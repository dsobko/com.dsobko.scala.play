package models

import play.api.libs.json._


case class Book(title: String, year: Int)

object Book {

  def getInstance(input: JsValue): Book ={
    val title = (input \ "title").as[String]
    val year = (input \ "event").as[Int]
    Book(title,year)
  }

}