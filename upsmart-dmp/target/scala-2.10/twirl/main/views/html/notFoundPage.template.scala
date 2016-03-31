
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
object notFoundPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
  <title>"""),_display_(/*6.11*/Messages("title")),format.raw/*6.28*/("""</title>

<style>
</style>
</head>

<body>
<div>

<body>

<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div>
              <h2 class="msg">您访问的页面不存在!</h2>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 col-md-offset-4">
        </div>

    </div>
</div>

</div> <!-- page-wrapper -->
</body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Sep 08 14:31:33 CST 2015
                  SOURCE: /home/upsmart/git/upsmart-dmp/app/views/notFoundPage.scala.html
                  HASH: a162fbe10ef6737ca1f9a57842a40926cce6bebe
                  MATRIX: 505->1|594->3|622->5|688->45|725->62
                  LINES: 19->1|22->1|24->3|27->6|27->6
                  -- GENERATED --
              */
          