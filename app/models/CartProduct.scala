package models

import play.api.db.slick.Config.driver.simple._
import java.util.Date


/**
  * Created by wendyarifkurniyanto on 4/15/16.
  */
case class CartProduct (cartId: Int, productId: Int ,quantity : Int, discount:BigDecimal)
{

}

/* Table mapping
 */
class CartProductsTable(tag: Tag) extends Table[CartProduct](tag, "CART_PRODUCT") {

  def cartId = column[Int]("CartId")
  def productId = column[Int]("ProductId")
  def quantity = column[Int]("Quantity")
  def discount = column[BigDecimal]("Discount")

  def * = (cartId,productId,quantity, discount) <> (CartProduct.tupled, CartProduct.unapply _)

  def cartFk = foreignKey("cart_fk", cartId, CartQueries.query)(e => e.id)
  def productFk = foreignKey("product_fk", productId, CartQueries.query)(i => i.id)
}


object CartProductQueries {
  lazy val query = TableQuery[CartProductsTable]
}