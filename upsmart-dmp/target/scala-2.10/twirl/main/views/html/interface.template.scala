
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
object interface extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DMP-interface</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/app.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/angular.min.js"></script>
<script src="js/angular-route.min.js"></script>
<script src="js/angular-cookies.min.js"></script>
<script src="js/dmp.js"></script>
</head>
<body ng-app="dmp">
 <div class="bs-docs-header" id="content" tabindex="-1">
  <div class="container">
   <h1>DMP-interface</h1>
   <p>welcome!</p>
  </div>
 </div>

 <div class="container" ng-controller="InterCtrl">
  <div class="row clearfix">
   <div class="col-md-12 column">

    <ul class="breadcrumb">
     <li><a href="/">首頁</a></li>
     <li><a active>演示页面</a></li>
    </ul>

    <div class="row clearfix">
     <div class="col-md-12 column">
      <form class="form-horizontal" role="form">
       <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
         <div class="checkbox">
          <!--cookie -->
          <label> <input type="radio" class="radio-inline"
           ng-model="idType" value="cookie" />&nbsp;COOKIE
          </label>
          <!-- IMEI/IDFA -->
          <label><input type="radio" class="radio-inline"
           ng-model="idType" value="imei-idfa" />&nbsp;IMEI/IDFA</label>
          <!-- mobile  -->
          <label><input type="radio" class="radio-inline"
           ng-model="idType" value="mobile" />&nbsp;MOBILE</label>
          <!--  Rcard  -->
          <label><input type="radio" class="radio-inline"
           ng-model="idType" value="card" />&nbsp;RCARD</label>
         </div>
        </div>
       </div>
       <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">输入参数</label>
        <div class="col-sm-10">
         <input type="text" class="form-control" id="inputEmail3"
          ng-model="audId" />
        </div>
       </div>
       <!-- <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">输入参数</label>
            <div class="col-sm-10">
            <input type="password" class="form-control" id="inputPassword3" />
            </div>
            </div> -->
       <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
         <button type="button" class="btn btn-default"
          ng-click="doQuery();">发送请求</button>
         &nbsp; &nbsp;&nbsp;
         <a href="/rawdata/10/10"　target="_Blank">查看示例数据</a>
        </div>
       </div>
      </form>
      <h2>結果</h2>
      <div class="jumbotron">
       <p ng-bind="jsonResult"></p>
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
                  DATE: Thu Sep 10 12:26:30 CST 2015
                  SOURCE: /home/upsmart/git/upsmart-dmp/app/views/interface.scala.html
                  HASH: c1c8e382353818893beda41a000af4f16dae96db
                  MATRIX: 510->1|627->30|655->32
                  LINES: 19->1|22->1|24->3
                  -- GENERATED --
              */
          