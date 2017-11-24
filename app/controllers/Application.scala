package controllers

import play.api.mvc.Controller
import javax.inject._
import play.api._
import play.api.mvc._
/**
  * Created by mazhiyong on 2017/11/24.
  */
class Application extends Controller{
  def index =  Action {
    Ok(views.html.dwz(""))
  }
}
