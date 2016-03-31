
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
object analyse extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import AudienceConst._

Seq[Any](format.raw/*1.31*/(""" """),format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DMP-ANALYSE</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/app.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/angular.min.js"></script>
<script src="js/angular-route.min.js"></script>
<script src="js/angular-cookies.min.js"></script>
<script src="js/echart/echarts-all.js"></script>
<script src="js/custom.js"></script>
<script src="js/dictionary.js"></script>

</head>
<body>
 <div class="bs-docs-header" id="content" tabindex="-1">
  <div class="container">
   <h1>DMP-ANALYSE</h1>
   <p>WELCOME!</p>
  </div>
 </div>
 <div class="container-fluid">
  <div class="row clearfix">
   <div class="col-md-12 column">
    <ul class="breadcrumb">
     <li><a href="/">首頁</a></li>
     <li><a active>分析页面</a></li>
    </ul>
    <div class="row clearfix">
     <div class="col-md-4 column">
      <div class="jumbotron">
       <h2>选择维度</h2>
       <hr />
       <div class="row clearfix">
        <div class="col-md-12 column">
         <div class="panel-group" id="panel-913131">
          <!--     基本信息 -->
          <div class="panel panel-default">
           <div class="panel-heading">
            <a class="panel-title" data-toggle="collapse"
             data-parent="#panel-913131" href="#panel-element-726682">基本信息</a>
           </div>
           <div id="panel-element-726682" class="panel-collapse in">
            <div class="panel-body">
             <!-- 内容 -->
             <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
               性别:
               <!-- 男 -->
               <label><input type="radio" name="gender"
                value="Male" />男</label>
               <!-- 女 -->
               <label><input type="radio" name="gender"
                value="Famale" />女</label>
              </div>
             </div>
             <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
               年龄:
               <!-- 青年 -->
               <label><input type="radio" name="age"
                value="young" />青年</label>
               <!-- 中年 -->
               <label><input type="radio" name="age"
                value="middle" />中年</label>
               <!--  老年 -->
               <label><input type="radio" name="age" value="old" />老年</label>
              </div>
             </div>
             <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
               是否有工作:
               <!-- 是  -->
               <label><input type="radio" name="work"
                value="true" />是</label>
               <!-- 否  -->
               <label><input type="radio" name="work"
                value="false" />否</label>
              </div>
             </div>
             <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
               是否已婚:
               <!-- 是  -->
               <label><input type="radio" name="marry"
                value="true" />是</label>
               <!-- 否  -->
               <label><input type="radio" name="marry"
                value="false" />否</label>
              </div>
             </div>
             <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
               是否有孩子:
               <!-- 是  -->
               <label><input type="radio" name="son"
                value="true" />是</label>
               <!-- 否  -->
               <label><input type="radio" name="son"
                value="false" />否</label>
              </div>
             </div>
             <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
               是否学生:
               <!-- 是  -->
               <label><input type="radio" name="student"
                value="true" />是</label>
               <!-- 否  -->
               <label><input type="radio" name="student"
                value="false" />否</label>
              </div>
             </div>
            </div>
           </div>
          </div>
          <!-- 位置信息 -->
          <div class="panel panel-default">
           <div class="panel-heading">
            <a class="panel-title collapsed" data-toggle="collapse"
             data-parent="#panel-913131" href="#panel-element-98894">位置信息</a>
           </div>
           <div id="panel-element-98894" class="panel-collapse collapse">
            <div class="panel-body">
             <!-- 内容 -->
             <div class="btn-group">
              <button class="btn btn-default" id="cityName">城市</button>
              <button data-toggle="dropdown"
               class="btn btn-default dropdown-toggle">
               <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" id="city">
               """),_display_(/*138.17*/for( e <- cityNames) yield /*138.37*/{_display_(Seq[Any](format.raw/*138.38*/("""
               """),format.raw/*139.16*/("""<li><a href="#"""),_display_(/*139.31*/{e._1}),format.raw/*139.37*/("""" id=""""),_display_(/*139.44*/{e._1}),format.raw/*139.50*/("""">"""),_display_(/*139.53*/{e._2}),format.raw/*139.59*/("""</a></li> """)))}),format.raw/*139.70*/("""
              """),format.raw/*140.15*/("""</ul>
             </div>
            </div>
           </div>
          </div>
          <!-- 上网信息 -->
          <div class="panel panel-default">
           <div class="panel-heading">
            <a class="panel-title" data-toggle="collapse"
             data-parent="#panel-913131" href="#panel-element-2">上网信息</a>
           </div>
           <div id="panel-element-2" class="panel-collapse collapse">
            <div class="panel-body">
             <div class="btn-group">
              <button class="btn btn-default" id="allNetCateNames">上网偏好</button>
              <button data-toggle="dropdown"
               class="btn btn-default dropdown-toggle">
               <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" id="allNetCate">
               """),_display_(/*160.17*/for( e <- allNetCateNames) yield /*160.43*/{_display_(Seq[Any](format.raw/*160.44*/("""
               """),format.raw/*161.16*/("""<li><a href="#"""),_display_(/*161.31*/{e._1}),format.raw/*161.37*/("""" id=""""),_display_(/*161.44*/{e._1}),format.raw/*161.50*/("""">"""),_display_(/*161.53*/{e._2}),format.raw/*161.59*/("""</a></li> """)))}),format.raw/*161.70*/("""
              """),format.raw/*162.15*/("""</ul>
             </div>
             <div class="btn-group">
              <button class="btn btn-default" id="swsdName">上网时段</button>
              <button data-toggle="dropdown"
               class="btn btn-default dropdown-toggle">
               <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" id="swsd">
               <li><a href="#"> 6:00-11:00</a></li>
               <li><a href="#">11:00-14:00</a></li>
               <li><a href="#"> 14:00-17:00</a></li>
               <li><a href="#"> 17:00-21:00</a></li>
               <li><a href="#"> 21:00-1:00</a></li>
               <li><a href="#"> 1:00-6:00</a></li>
              </ul>
             </div>
            </div>
           </div>
          </div>
          <!-- 消费信息 -->
          <div class="panel panel-default">
           <div class="panel-heading">
            <a class="panel-title" data-toggle="collapse"
             data-parent="#panel-913131" href="#panel-element-1">消费信息</a>
           </div>
           <div id="panel-element-1" class="panel-collapse collapse">
            <div class="panel-body">
             <div class="btn-group">
              <button class="btn btn-default" id="allConsumeablities">消费能力</button>
              <button data-toggle="dropdown"
               class="btn btn-default dropdown-toggle">
               <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" id="allConsumeablitie">
               """),_display_(/*197.17*/for( e <- allConsumeablities) yield /*197.46*/{_display_(Seq[Any](format.raw/*197.47*/("""
               """),format.raw/*198.16*/("""<li><a href="#"""),_display_(/*198.31*/{e}),format.raw/*198.34*/("""" id=""""),_display_(/*198.41*/{e}),format.raw/*198.44*/("""">"""),_display_(/*198.47*/{e}),format.raw/*198.50*/("""</a></li> """)))}),format.raw/*198.61*/("""
              """),format.raw/*199.15*/("""</ul>
             </div>
             <div class="btn-group">
              <button class="btn btn-default" id="hknlName">还贷能力</button>
              <button data-toggle="dropdown"
               class="btn btn-default dropdown-toggle">
               <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" id="">
               <li><a href="#">5000</a></li>
               <li><a href="#">10000</a></li>
               <li><a href="#">15000</a></li>
               <li><a href="#">20000</a></li>
               <li><a href="#">20000以上</a></li>
              </ul>
             </div>
             <div class="btn-group">
              <button class="btn btn-default" id="xfphName">消费偏好</button>
              <button data-toggle="dropdown"
               class="btn btn-default dropdown-toggle">
               <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" id="xfph">
               <li><a href="#">餐饮业</a></li>
               <li><a href="#">金融业</a></li>
               <li><a href="#">零售业</a></li>
               <li><a href="#">汽车业</a></li>
               <li><a href="#">批发业</a></li>
               <li><a href="#">医疗业</a></li>
               <li><a href="#">IT业</a></li>
              </ul>
             </div>
             <div class="btn-group">
              <button class="btn btn-default" id="sfpcName">消费频次</button>
              <button data-toggle="dropdown"
               class="btn btn-default dropdown-toggle">
               <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" id="sfpc">
               <li><a href="#">1次/3月</a></li>
               <li><a href="#">1次/2月</a></li>
               <li><a href="#">1次/月</a></li>
               <li><a href="#">2次/月</a></li>
               <li><a href="#">5次/月</a></li>
               <li><a href="#">10次/月</a></li>
               <li><a href="#">10次以上/月</a></li>
              </ul>
             </div>
                <div class="btn-group">
              <button class="btn btn-default" id="yshName">夜生活</button>
              <button data-toggle="dropdown"
               class="btn btn-default dropdown-toggle">
               <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" id="ysh">
               <li><a href="#">是</a></li>
               <li><a href="#">否</a></li>
              </ul>
             </div>
            </div>
           </div>
          </div>
         </div>
        </div>
       </div>
       <p>
        <a id="sendRequest" class="btn btn-primary btn-large" href="#">发送请求</a>
       </p>
      </div>
     </div>

     <div class="col-md-8 column">
      <div class="tabbable" id="tabs-766816"  style="overflow:hidden;height: 620px;"/>
       <ul class="nav nav-tabs">
        <!--        Section 1 -->
        <li class="active"><a href="#panel-519578"
         data-toggle="tab">地理位置分布</a></li>
        <!--         Section 2 -->
        <li><a href="#panel-184752" data-toggle="tab">消费能力</a></li>
        <!--         Section 3 -->
        <li><a href="#panel-1992" data-toggle="tab">消费类别</a></li>
       </ul>
       <div class="tab-content">
        <div class="tab-pane  active" id="panel-519578">
         <div id="echartMap" style="height: 600px;"></div>
        </div>
        <div class="tab-pane active" id="panel-184752">
         <div id="echartPie" style="height: 600px;"></div>
        </div>
        <div class="tab-pane active" id="panel-1992">
         <div id="echartConsumecate" style="height: 600px;"></div>
        </div>
       </div>
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
                  DATE: Thu Sep 10 12:22:12 CST 2015
                  SOURCE: /home/upsmart/git/upsmart-dmp/app/views/analyse.scala.html
                  HASH: 79cad0b0d98c64be062c0742e992f0fe62aac5ff
                  MATRIX: 508->1|647->30|674->55|701->56|5578->4905|5615->4925|5655->4926|5700->4942|5743->4957|5771->4963|5806->4970|5834->4976|5865->4979|5893->4985|5936->4996|5980->5011|6811->5814|6854->5840|6894->5841|6939->5857|6982->5872|7010->5878|7045->5885|7073->5891|7104->5894|7132->5900|7175->5911|7219->5926|8743->7422|8789->7451|8829->7452|8874->7468|8917->7483|8942->7486|8977->7493|9002->7496|9033->7499|9058->7502|9101->7513|9145->7528
                  LINES: 19->1|22->1|22->2|23->3|158->138|158->138|158->138|159->139|159->139|159->139|159->139|159->139|159->139|159->139|159->139|160->140|180->160|180->160|180->160|181->161|181->161|181->161|181->161|181->161|181->161|181->161|181->161|182->162|217->197|217->197|217->197|218->198|218->198|218->198|218->198|218->198|218->198|218->198|218->198|219->199
                  -- GENERATED --
              */
          