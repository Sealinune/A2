
package views.html.application

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(err:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head lang="en">
        <meta charset="UTF-8">
        <title></title>
    </head>
    
    <body>
    
        <h1>Sign-in Page:</h1>
    
        <form action="login" method="post">
            <table>
                <tr>
                    <td>
                        <label>Email address:</label>
                    </td>
                    <td>
                        <input type="text" name="email"><br/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Password:</label>
                    </td>
                    <td>
                        <input type="password" name="password" /><br/>
                    </td>
                </tr>
        
            </table>
            <button type="submit" style="width:300px; height: 80px;">Submit</button>
        </form>
        
        <form action="index" method = "get"> 
            <button type="submit" style="width:300px; height: 80px;">Back to the home page</button>
        </form>
        """),_display_(/*40.10*/if(err != null)/*40.25*/ {_display_(Seq[Any](format.raw/*40.27*/("""
            """),format.raw/*41.13*/("""<p> """),_display_(/*41.18*/err),format.raw/*41.21*/(""" """),format.raw/*41.22*/("""</p>
        """)))}),format.raw/*42.10*/("""

    """),format.raw/*44.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(err:String): play.twirl.api.HtmlFormat.Appendable = apply(err)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (err) => apply(err)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 17:35:49 AEDT 2015
                  SOURCE: D:/PlayFramework/sealinune-assignment2015/app/views/application/login.scala.html
                  HASH: e461233fe4e9ad0a122cc4ae84f35ddad0cbf640
                  MATRIX: 757->1|864->13|894->17|2027->1123|2051->1138|2091->1140|2133->1154|2165->1159|2189->1162|2218->1163|2264->1178|2299->1186
                  LINES: 27->1|32->1|34->3|71->40|71->40|71->40|72->41|72->41|72->41|72->41|73->42|75->44
                  -- GENERATED --
              */
          