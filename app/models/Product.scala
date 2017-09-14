package models

/**
  * Created by diego on 12/09/17.
  */
case class Product (
  ean: Long, name: String, description: String)

object Product{
  var products = Set(
      Product(1L,"Some 1","Some desc 1"),
      Product(2L,"Some 2","Some desc 2"),
      Product(3L,"Some 3","Some desc 3"),
      Product(4L,"Some 4","Some desc 4")
  )

  def findAll = products.toList.sortBy(_.ean)
}