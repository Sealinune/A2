
package views.html.application

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sessions_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class sessions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(u:model.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
<body>

  <h2>Sessions</h2>

  """),_display_(/*13.4*/if(u != null)/*13.17*/ {_display_(Seq[Any](format.raw/*13.19*/("""

      """),format.raw/*15.7*/("""<p>
          You are logged in as """),_display_(/*16.33*/{u.getEmail()}),format.raw/*16.47*/("""
      """),format.raw/*17.7*/("""</p>

      <p>Your sessions:</p>
      <ul>
      """),_display_(/*21.8*/for(session <- u.getSessions()) yield /*21.39*/ {_display_(Seq[Any](format.raw/*21.41*/("""
          """),format.raw/*22.11*/("""<li>
              <label>IP address: </label> """),_display_(/*23.44*/{session.getIpAddress()}),format.raw/*23.68*/("""
              """),format.raw/*24.15*/("""<label>Since: </label> """),_display_(/*24.39*/{session.getSince()}),format.raw/*24.59*/("""
              """),format.raw/*25.15*/("""<form action="remoteLogout" method="POST">
                  <input type="hidden" value=""""),_display_(/*26.48*/{session.getId()}),format.raw/*26.65*/("""" name="remove" />
                  <button type="submit">Log out remotely</button>
              </form>
          </li>
      """)))}),format.raw/*30.8*/("""
      """),format.raw/*31.7*/("""</ul>

  """)))}/*33.5*/else/*33.10*/{_display_(Seq[Any](format.raw/*33.11*/("""
    """),format.raw/*34.5*/("""<p>You are not logged in</p>
  """)))}),format.raw/*35.4*/("""
  
  

"""),format.raw/*39.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(u:model.User): play.twirl.api.HtmlFormat.Appendable = apply(u)

  def f:((model.User) => play.twirl.api.HtmlFormat.Appendable) = (u) => apply(u)

  def ref: this.type = this

}


}

/**/
object sessions extends sessions_Scope0.sessions
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 19:01:29 AEDT 2015
                  SOURCE: D:/PlayFramework/sealinune-assignment2015/app/views/application/sessions.scala.html
                  HASH: b144294ba67f2d953d13572d71885940f61d9afe
                  MATRIX: 767->1|876->15|906->19|1069->156|1091->169|1131->171|1168->181|1232->218|1267->232|1302->240|1384->296|1431->327|1471->329|1511->341|1587->390|1632->414|1676->430|1727->454|1768->474|1812->490|1930->581|1968->598|2132->732|2167->740|2197->753|2210->758|2249->759|2282->765|2345->798|2384->810
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|46->15|47->16|47->16|48->17|52->21|52->21|52->21|53->22|54->23|54->23|55->24|55->24|55->24|56->25|57->26|57->26|61->30|62->31|64->33|64->33|64->33|65->34|66->35|70->39
                  -- GENERATED --
              */
          