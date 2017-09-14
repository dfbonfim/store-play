package models

/**
  * Created by diego on 12/09/17.
  */
case class Product (
  ean: Long, name: String, description: String)

object Product{
  var products = Set(
      Product(5010255079763L,"Some 1","Some desc 1"),
      Product(5018206244666L,"Some 2","Some desc 2"),
      Product(5018306332812L,"Some 3","Some desc 3"),
      Product(5018306312913L,"Some 4","Some desc 4")
  )

  def findAll = products.toList.sortBy(_.ean)

  def findByEan(ean:Long) = products.find(_.ean == ean)
}