import play.filters.gzip.GzipFilter
import play.api._
import play.api.mvc._
import play.api.mvc.Results._
import scala.concurrent.Future
import services._

object Global extends WithFilters(new GzipFilter()) with GlobalSettings {

  override def onStart(app: Application) {
    println("Application has started")
    AudienceService.queryAudienceById("aaa", "bbb")
  }

  override def onStop(app: Application) {
    println("Application shutdown...")
  }

   override def onHandlerNotFound(request: RequestHeader) = {
     Future.successful(NotFound(
       views.html.notFoundPage()
     ))
  }

  override def onBadRequest(request: RequestHeader, error: String) = {
    Future.successful(BadRequest("Bad Request: " + error))
  }

}
