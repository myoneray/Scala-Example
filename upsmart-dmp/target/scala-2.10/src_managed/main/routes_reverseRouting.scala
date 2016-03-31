// @SOURCE:/home/upsmart/git/upsmart-dmp/conf/routes
// @HASH:beba62b77ef1b66f452d64230b900db5dcfad9d9
// @DATE:Wed Sep 09 15:57:12 CST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseMainController {
    

// @LINE:6
def interface(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "interface")
}
                        

// @LINE:9
def queryAudience(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "query")
}
                        

// @LINE:7
def analyse(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "analyse")
}
                        

// @LINE:5
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:10
def rawData(limit:Int, skip:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "rawdata/" + implicitly[PathBindable[Int]].unbind("limit", limit) + "/" + implicitly[PathBindable[Int]].unbind("skip", skip))
}
                        

// @LINE:8
def queryAudienceById(id:String, idType:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "queryById/" + implicitly[PathBindable[String]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("idType", idType))
}
                        
    
}
                          

// @LINE:13
// @LINE:12
class ReverseAssets {
    

// @LINE:13
// @LINE:12
def at(path:String, file:String): Call = {
   (path: @unchecked, file: @unchecked) match {
// @LINE:12
case (path, file) if path == "/public/css" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/css")))
  Call("GET", _prefix + { _defaultPrefix } + "css/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:13
case (path, file) if path == "/public/js" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/js")))
  Call("GET", _prefix + { _defaultPrefix } + "js/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseMainController {
    

// @LINE:6
def interface : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.interface",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "interface"})
      }
   """
)
                        

// @LINE:9
def queryAudience : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.queryAudience",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query"})
      }
   """
)
                        

// @LINE:7
def analyse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.analyse",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "analyse"})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def rawData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.rawData",
   """
      function(limit,skip) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rawdata/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("limit", limit) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("skip", skip)})
      }
   """
)
                        

// @LINE:8
def queryAudienceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.queryAudienceById",
   """
      function(id,idType) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "queryById/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("idType", idType)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:12
class ReverseAssets {
    

// @LINE:13
// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/css") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "css/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/js") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "js/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseMainController {
    

// @LINE:6
def interface(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.interface(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "interface", Seq(), "GET", """""", _prefix + """interface""")
)
                      

// @LINE:9
def queryAudience(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.queryAudience(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "queryAudience", Seq(), "POST", """""", _prefix + """query""")
)
                      

// @LINE:7
def analyse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.analyse(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "analyse", Seq(), "GET", """""", _prefix + """analyse""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:10
def rawData(limit:Int, skip:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.rawData(limit, skip), HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "rawData", Seq(classOf[Int], classOf[Int]), "GET", """""", _prefix + """rawdata/$limit<[^/]+>/$skip<[^/]+>""")
)
                      

// @LINE:8
def queryAudienceById(id:String, idType:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.queryAudienceById(id, idType), HandlerDef(this.getClass.getClassLoader, "", "controllers.MainController", "queryAudienceById", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """queryById/$id<.+>/$idType<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """css/$file<.+>""")
)
                      
    
}
                          
}
        
    