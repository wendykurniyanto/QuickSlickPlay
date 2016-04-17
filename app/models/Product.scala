package models
import play.api.db.slick.Config.driver.simple._
import scala.slick.jdbc.JdbcBackend

/**
  * Created by wendyarifkurniyanto on 4/15/16.
  */
case class Product (id: Int, name: String, description: String, price:BigDecimal)

/* Table mapping
 */
class ProductsTable(tag: Tag) extends Table[Product](tag, "PRODUCT") {

  def id = column[Int]("id", O.PrimaryKey , O.AutoInc)
  def name = column[String]("name", O.NotNull)
  def description = column[String]("description", O.NotNull)
  def price = column[BigDecimal]("price", O.NotNull)

  def * = (id,name,description,price) <> (Product.tupled, Product.unapply _)

  def carts = CartProductQueries.query.filter(_.productId === id)
    .flatMap(_.cartFk)
}


object ProductQueries {

  lazy val query = TableQuery[ProductsTable]

  def findById(id: Int)(implicit session: Session): Option[Product] = {
    val byId = query.findBy(_.id)
    byId(id).list.headOption
  }
}