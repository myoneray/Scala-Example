
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import controllers.PageUtil

Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!doctype html>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/app.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/angular.min.js"></script>
<script src="js/angular-route.min.js"></script>
<script src="js/angular-cookies.min.js"></script>

</head>
<body>
 <div class="bs-docs-header" id="content" tabindex="-1">
  <div class="container">
   <h1>DMP</h1>
   <p>welcome!</p>
  </div>
 </div>

 <div class="container">
  <div class="row clearfix">
   <div class="col-md-12 column">

    <ul class="breadcrumb">
     <li><a active>首頁</a></li>
    </ul>

    <div class="row clearfix">
     <div class="col-md-6 column">
      <div class="jumbotron">
       <h2>演示页面</h2>
       <p>文案文案文案文案文案文案文案文案文案文案文案文案文案文案</p>
       <p>
        <a class="btn btn-primary btn-large" href="/interface">演示页面</a>
       </p>
      </div>
     </div>

     <div class="col-md-6 column">
      <div class="jumbotron">
       <h2>分析页面</h2>
       <p>文案文案文案文案文案文案文案文案文案文案文案文案文案文案</p>
       <p>
        <a class="btn btn-primary btn-large" href="/analyse">分析页面</a>
       </p>
      </div>
     </div>
    </div>

   </div>
  </div>
 </div>
</body>
</html>
"""))}
  }

  def render(session:Session): play.twirl.api.HtmlFormat.Appendable = apply()(session)

  def f:(() => (Session) => play.twirl.api.HtmlFormat.Appendable) = () => (session) => apply()(session)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Sep 09 13:43:01 CST 2015
                  SOURCE: /home/upsmart/git/upsmart-dmp/app/views/index.scala.html
                  HASH: 3d2499cd1609e48516eb6249858a12ae469f5a3b
                  MATRIX: 506->1|650->30|678->61|705->62
                  LINES: 19->1|22->1|24->4|25->5
                  -- GENERATED --
              */
          