package controllers

import play.api.mvc._
import models.AgendaItem

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Everything works as expected!!!!"))
  }

  def getBook = Action {
    Ok("Alice in Wonderland!")
  }

  def getBookItem = Action { implicit request =>
    val json = request.body.asJson.get

    val bookItem = AgendaItem.getInstance(json)
    Ok("Book title: " + bookItem.title)
  }
}