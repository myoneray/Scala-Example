// @SOURCE:/home/upsmart/git/upsmart-dmp/conf/routes
// @HASH:beba62b77ef1b66f452d64230b900db5dcfad9d9
// @DATE:Wed Sep 09 15:57:12 CST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_MainController_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_MainController_index0_invoker = createInvoker(
controllers.MainController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:6
private[this] lazy val controllers_MainController_interface1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("interface"))))
private[this] lazy val controllers_MainController_interface1_invoker = createInvoker(
controllers.MainController.interface(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "interface", Nil,"GET", """""", Routes.prefix + """interface"""))
        

// @LINE:7
private[this] lazy val controllers_MainController_analyse2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("analyse"))))
private[this] lazy val controllers_MainController_analyse2_invoker = createInvoker(
controllers.MainController.analyse(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "analyse", Nil,"GET", """""", Routes.prefix + """analyse"""))
        

// @LINE:8
private[this] lazy val controllers_MainController_queryAudienceById3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("queryById/"),DynamicPart("id", """.+""",false),StaticPart("/"),DynamicPart("idType", """.+""",false))))
private[this] lazy val controllers_MainController_queryAudienceById3_invoker = createInvoker(
controllers.MainController.queryAudienceById(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "queryAudienceById", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """queryById/$id<.+>/$idType<.+>"""))
        

// @LINE:9
private[this] lazy val controllers_MainController_queryAudience4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("query"))))
private[this] lazy val controllers_MainController_queryAudience4_invoker = createInvoker(
controllers.MainController.queryAudience(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "queryAudience", Nil,"POST", """""", Routes.prefix + """query"""))
        

// @LINE:10
private[this] lazy val controllers_MainController_rawData5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rawdata/"),DynamicPart("limit", """[^/]+""",true),StaticPart("/"),DynamicPart("skip", """[^/]+""",true))))
private[this] lazy val controllers_MainController_rawData5_invoker = createInvoker(
controllers.MainController.rawData(fakeValue[Int], fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "rawData", Seq(classOf[Int], classOf[Int]),"GET", """""", Routes.prefix + """rawdata/$limit<[^/]+>/$skip<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_Assets_at6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("css/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """css/$file<.+>"""))
        

// @LINE:13
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("js/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """js/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.MainController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """interface""","""controllers.MainController.interface()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """analyse""","""controllers.MainController.analyse()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """queryById/$id<.+>/$idType<.+>""","""controllers.MainController.queryAudienceById(id:String, idType:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """query""","""controllers.MainController.queryAudience()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rawdata/$limit<[^/]+>/$skip<[^/]+>""","""controllers.MainController.rawData(limit:Int, skip:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """css/$file<.+>""","""controllers.Assets.at(path:String = "/public/css", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """js/$file<.+>""","""controllers.Assets.at(path:String = "/public/js", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_MainController_index0_route(params) => {
   call { 
        controllers_MainController_index0_invoker.call(controllers.MainController.index())
   }
}
        

// @LINE:6
case controllers_MainController_interface1_route(params) => {
   call { 
        controllers_MainController_interface1_invoker.call(controllers.MainController.interface())
   }
}
        

// @LINE:7
case controllers_MainController_analyse2_route(params) => {
   call { 
        controllers_MainController_analyse2_invoker.call(controllers.MainController.analyse())
   }
}
        

// @LINE:8
case controllers_MainController_queryAudienceById3_route(params) => {
   call(params.fromPath[String]("id", None), params.fromPath[String]("idType", None)) { (id, idType) =>
        controllers_MainController_queryAudienceById3_invoker.call(controllers.MainController.queryAudienceById(id, idType))
   }
}
        

// @LINE:9
case controllers_MainController_queryAudience4_route(params) => {
   call { 
        controllers_MainController_queryAudience4_invoker.call(controllers.MainController.queryAudience())
   }
}
        

// @LINE:10
case controllers_MainController_rawData5_route(params) => {
   call(params.fromPath[Int]("limit", None), params.fromPath[Int]("skip", None)) { (limit, skip) =>
        controllers_MainController_rawData5_invoker.call(controllers.MainController.rawData(limit, skip))
   }
}
        

// @LINE:12
case controllers_Assets_at6_route(params) => {
   call(Param[String]("path", Right("/public/css")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:13
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public/js")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     