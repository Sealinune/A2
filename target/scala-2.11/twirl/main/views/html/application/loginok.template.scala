
package views.html.application

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginok_Scope0 {
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

class loginok extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email:String):play.twirl.api.HtmlFormat.Appendable = {
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


<h1><b>Landing Page</b></h1><br/>

<h3>You are signed in as """),_display_(/*14.27*/email),format.raw/*14.32*/("""!!!</h3>

<table border="0">
    <tr>
        <td>
            <form action="publish" method = "get"> 
                <button type="submit" style="width:300px; height: 80px;">Post Messages</button>
            </form>
        </td>
    </tr>
    <tr>
        <td>
            <form action="search" method = "get"> 
                <button type="submit" style="width:300px; height: 80px;">Search Messages</button>
            </form>            
        </td>
    </tr>

    <tr>
        <td>
            <form action="sessions" method = "get"> 
                <button type="submit" style="width:300px; height: 80px;">Sessions</button>
            </form>            
        </td>
    </tr>
    <tr>
        <td>
            <form action="logout" method = "get"> 
                <button type="submit" style="width:300px; height: 80px;">log out</button>
            </form>            
        </td>
    </tr>

</table>

<!--
<form action="show" method = "get"> 
    <button type="submit">show</button>
</form>
-->

</body>
</html>"""))
      }
    }
  }

  def render(email:String): play.twirl.api.HtmlFormat.Appendable = apply(email)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (email) => apply(email)

  def ref: this.type = this

}


}

/**/
object loginok extends loginok_Scope0.loginok
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 17:37:53 AEDT 2015
                  SOURCE: D:/PlayFramework/sealinune-assignment2015/app/views/application/loginok.scala.html
                  HASH: 5fa641fe60b17c3f2451eb4a2591c618bf0c39a8
                  MATRIX: 761->1|870->15|900->19|1103->195|1129->200
                  LINES: 27->1|32->1|34->3|45->14|45->14
                  -- GENERATED --
              */
          