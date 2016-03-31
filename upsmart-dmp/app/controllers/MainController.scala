package controllers

import play.api.mvc._
import play.api.i18n.Lang
import play.api.data._
import play.api.Play
import play.api.Logger
import play.api.Play.current
import play.api.libs.iteratee.Enumerator
import play.api.libs.json._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.io._
import java.io.FileWriter
//import com.github.tototoshi.play2.json4s.native.Json4s
import services._
import models._
import Implicits._

object MainController extends Controller {
  val log = Logger(this.getClass)

  def index = Action {
    implicit request =>
    Ok(views.html.index.render(request.session))
  }

  def interface = Action {
    implicit request =>
    Ok(views.html.analyse.render(request.session))
  }

  def analyse = Action {
    implicit request =>
    Ok(views.html.interface.render(request.session))
  }

  def queryAudienceById(id: String, idType: String) = Action {
    implicit request =>
    log.info(s"query audience: id: $id, idType: $idType")
    val result = AudienceService.queryAudienceById(id, idType)
    log.info(s"query result: $result")
    Ok(Json.toJson(result))
  }

  private def parseBoolean(s: Option[String]) = {
    val _s = s.getOrElse("")
    if ("true" == _s) Some(true)
    else if ("false" == _s) Some(false)
    else None
  }

  def queryAudience = Action(parse.urlFormEncoded) {
    implicit request =>
    val data = request.body
    val gender = getParam(data, "gender").getOrElse("")
    val age = getParam(data, "age").getOrElse("")
    val isEmployedOpt = parseBoolean(getParam(data, "employed"))
    val isMarriedOpt = parseBoolean(getParam(data, "married"))
    val hasChildrenOpt = parseBoolean(getParam(data, "has-children"))
    val isStudentOpt = parseBoolean(getParam(data, "student"))

    val basicInfo = BasicInfo(gender, age, isEmployedOpt, isMarriedOpt, hasChildrenOpt, isStudentOpt)

    val location = getParam(data, "location").getOrElse("")
    val locInfo = LocInfo(location);

    val netPerferTimePeroid = getParam(data, "net-time").getOrElse("")
    val netPerfer = NetPrefer("", netPerferTimePeroid, 0)

    val consumeablity = getParam(data, "consumeablity").getOrElse("")
    val repayablity = getParam(data, "repayablity").getOrElse("")
    val consumptionInfo = ConsumptionInfo(consumeablity, repayablity, "", 0, None);

    val condition = Audience("", "", basicInfo, locInfo, netPerfer, consumptionInfo)
    log.info("query audience: query condition: $condition");
    val allMatched = AudienceService.queryAudience(condition)

    val locResult = allMatched.groupBy(_.locInfo.city).mapValues(_.size).map(e => ChartDataItem(AudienceConst.cityNames(e._1), e._1, e._2))
    val consumCateResult = allMatched.groupBy(_.consumptionInfo.consumptionCategory).mapValues(_.size).map(e => ChartDataItem(e._1, e._1, e._2))
    val consumAblityResult = allMatched.groupBy(_.consumptionInfo.consumeablity).mapValues(_.size).map(e => ChartDataItem(e._1, e._1, e._2))

    val result = Json.obj(
      "tatal" -> allMatched.size,
      "locationstat" -> Json.toJson(locResult),
      "consumestat" -> Json.toJson(consumCateResult),
      "consumablitystat" -> Json.toJson(consumAblityResult)
    )
    Ok(result);
  }

  def rawData(limit: Int, skip: Int) = Action {
    implicit request =>
    val result = AudienceService.rawData(limit, skip)
    Ok(Json.toJson(result));
  }

  def getParam(queryString: Map[String, Seq[String]], param: String): Option[String] = {
    queryString.get(param).map(_(0))
  }
}
