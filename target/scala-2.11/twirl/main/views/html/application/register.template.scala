
package views.html.application

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    
        <h1>Sign-up Page:</h1>
        <form action="register" method="post">
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
              
                <tr>
                    <td>
                        <label>Repeat password:</label>
                    </td>
                    <td>
                        <input type="password" name="repw" /><br/>
                    </td>
                </tr>
               
            </table>
        
            <button type="submit" style="width:300px; height: 80px;">Submit</button>

        </form>
        
        <form action="index" method = "get"> 
            <button type="submit" style="width:300px; height: 80px;">Back to the home page</button>
        </form>
        """),_display_(/*49.10*/if(err != null)/*49.25*/ {_display_(Seq[Any](format.raw/*49.27*/("""
            """),format.raw/*50.13*/("""<p> """),_display_(/*50.18*/err),format.raw/*50.21*/(""" """),format.raw/*50.22*/("""</p>
        """)))}),format.raw/*51.10*/("""        

        
        
    """),format.raw/*55.5*/("""</body>
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
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 17:36:33 AEDT 2015
                  SOURCE: D:/PlayFramework/sealinune-assignment2015/app/views/application/register.scala.html
                  HASH: 0e38b47115986436465b053de0f37be996e30c3d
                  MATRIX: 763->1|870->13|900->17|2335->1425|2359->1440|2399->1442|2441->1456|2473->1461|2497->1464|2526->1465|2572->1480|2635->1516
                  LINES: 27->1|32->1|34->3|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|86->55
                  -- GENERATED --
              */
          