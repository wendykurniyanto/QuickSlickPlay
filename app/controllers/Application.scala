package controllers

import models._
import play.api._
import play.api.db.slick._
import play.api.db.slick.Config.driver.simple._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import play.api.Play.current
import play.api.mvc.BodyParsers._
import play.api.libs.json.Json
import play.api.libs.json.Json._
import java.sql.Timestamp


object Application extends Controller{

  //create an instance of the table
  val cats = TableQuery[CatsTable] //see a way to architect your app in the computers-database-slick sample  
  val products = TableQuery[ProductsTable]
  val carts = TableQuery[CartsTable]
  val cartProducts = TableQuery[CartProductsTable]


  //JSON read/write macro
  implicit val catFormat = Json.format[Cat]
  implicit val productFormat = Json.format[Product]
  implicit val cartFormat = Json.format[Cart]
  implicit val cartProductFormat = Json.format[CartProduct]

  def index = DBAction { implicit rs =>
    Ok(views.html.index(cats.list))
  }

  val catForm = Form(
    mapping(
      "name" -> text(),
      "color" -> text()
    )(Cat.apply)(Cat.unapply)
  )

  def insert = DBAction { implicit rs =>
    val cat = catForm.bindFromRequest.get
    cats.insert(cat)

    Redirect(routes.Application.index)
  }

  def jsonFindAll = DBAction { implicit rs =>
    Ok(toJson(cats.list))
  }

  def jsonInsert = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[Cat].map { cat =>
        cats.insert(cat)
        Ok(toJson(cat))
    }.getOrElse(BadRequest("invalid json"))    
  }

  val productForm = Form(
    mapping(
      "id" -> number,
      "name" -> text(),
      "description" -> text(),
      "price" -> bigDecimal
    )(Product.apply)(Product.unapply)
  )

  def insertProduct = DBAction { implicit rs =>
    val product = productForm.bindFromRequest.get
    products.insert(product)

    Redirect(routes.Application.index)
  }

  def jsonFindAllProduct = DBAction { implicit rs =>
    Ok(toJson(products.list))
  }

  def jsonInsertProduct = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[Product].map { product =>
      products.insert(product)
      Ok(toJson(product))
    }.getOrElse(BadRequest("invalid json"))
  }

  def jsonUpdateProduct = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[Product].map { product =>
      products.update(product)
      Ok(toJson(product))
    }.getOrElse(BadRequest("invalid json"))
  }

  def jsonDeleteProduct = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[(Product)].map{product =>
      products.delete
      Ok(toJson(product))
    }.getOrElse(BadRequest("invalid json"))
  }

  def jsonFindAllCart = DBAction { implicit rs =>
    Ok(toJson(carts.list))
  }

  def jsonInsertCart = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[(Cart)].map{cart =>
      carts.insert(cart)
      Ok(toJson(cart))
    }.getOrElse(BadRequest("invalid json"))
  }

  def jsonUpdateCart = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[(Cart)].map{cart =>
      carts.update(cart)
      Ok(toJson(cart))
    }.getOrElse(BadRequest("invalid json"))
  }

  def jsonDeleteCart = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[(Cart)].map{cart =>
      carts.delete
      Ok(toJson(cart))
    }.getOrElse(BadRequest("invalid json"))
  }

  def jsonFindAllCartProduct = DBAction { implicit rs =>
    Ok(toJson(cartProducts.list))
  }

  def jsonInsertCartProduct = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[(CartProduct)].map{cartProduct =>
      cartProducts.insert(cartProduct)
      Ok(toJson(cartProduct))
    }.getOrElse(BadRequest("invalid json"))
  }

  def jsonUpdateCartProduct = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[(CartProduct)].map{cartProduct =>
      cartProducts.update(cartProduct)
      Ok(toJson(cartProduct))
    }.getOrElse(BadRequest("invalid json"))
  }

  def jsonDeleteCartProduct = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[CartProduct].map{cartProduct =>
      cartProducts.delete
      Ok(toJson(cartProduct))
    }.getOrElse(BadRequest("invalid json"))
  }



  
}
