package models

import play.api.db.slick.Config.driver.simple._

/**
  * Created by wendyarifkurniyanto on 4/15/16.
  */
case class Cart (id: Int, total: BigDecimal, netTotal:BigDecimal)

/* Table mapping
 */
class CartsTable(tag: Tag) extends Table[Cart](tag, "CART") {

  def id = column[Int]("id", O.PrimaryKey , O.AutoInc)
  def total = column[BigDecimal]("total", O.Nullable)
  def netTotal = column[BigDecimal]("netTotal", O.Nullable)

  def * = (id,total,netTotal) <> (Cart.tupled, Cart.unapply _)

  def products = CartProductQueries.query.filter(_.cartId === id)
    .flatMap(_.cartFk)
}


object CartQueries {

  lazy val query = TableQuery[CartsTable]

  def findById(id: Int)(implicit session: Session): Option[Cart] = {
    val byId = query.findBy(_.id)
    byId(id).list.headOption
  }
}