
package views.html.application

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messageList:List[String],email:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
<body>

<h1>Searching Page</h1>

<form action="searchuser" method="post">
    <label>Search messages by username :   </label>
    <input type="text" name="searchuser"><br/>

    <button type="submit">Submit</button>
</form><br/>

<form action="searchtopic" method="post">
    <label>Search messages by keyword :   </label>
    <input type="text" name="searchtopic"><br/>
    <button type="submit">Submit</button>
</form>

<br/>
<form action="index" method = "get"> 
    <button type="submit">Back to the home page</button>
</form>

<h1>search result:</h1>

"""),_display_(/*33.2*/messageList/*33.13*/.map/*33.17*/ { message =>_display_(Seq[Any](format.raw/*33.30*/("""
            """),format.raw/*34.13*/("""<li>
                <p><strong>"""),_display_(/*35.29*/message),format.raw/*35.36*/("""</strong></p>
            </li>
        """)))}),format.raw/*37.10*/("""

"""),format.raw/*39.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(messageList:List[String],email:String): play.twirl.api.HtmlFormat.Appendable = apply(messageList,email)

  def f:((List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (messageList,email) => apply(messageList,email)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Fri Aug 21 14:08:15 AEST 2015
                  SOURCE: D:/PlayFramework/sealinune-assignment2015/app/views/application/search.scala.html
                  HASH: 6873b64ef6fc2cf1999dc5e383386018379e8961
                  MATRIX: 772->1|906->40|936->44|1645->727|1665->738|1678->742|1729->755|1771->769|1832->803|1860->810|1934->853|1965->857
                  LINES: 27->1|32->1|34->3|64->33|64->33|64->33|64->33|65->34|66->35|66->35|68->37|70->39
                  -- GENERATED --
              */
          