
package views.html.application

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
    <body>

    <h1><b>Home Page</b></h1>
    <h3>You are not login, please Sign in or Sign up : </h3>
    
    <table border="0">
        <tr>
            <td>
                <form action="login" method = "get"> 
                    <button type="submit"  style="width:500px; height: 80px;">Log In</button>
                </form>
            </td>
    
           
        </tr>
        
        <tr>
            <td>
                <form action="register" method = "get"> 
                    <button type="submit" style="width:500px; height: 80px;">Register</button>
                </form>            
            </td>
        </tr>
        
        <tr>
            <td>
                <form action="sessions" method = "get"> 
                    <button type="submit" style="width:500px; height: 80px;">Sessions</button>
                </form>            
            </td>
        </tr>
        
    
    </table><br/><br/>
    
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 21:24:09 AEDT 2015
                  SOURCE: D:/PlayFramework/sealinune-assignment2015/app/views/application/index.scala.html
                  HASH: 3c95303aecd6cb9007f260856d971c52de37e4d4
                  MATRIX: 750->1|846->3|876->7
                  LINES: 27->1|32->1|34->3
                  -- GENERATED --
              */
          