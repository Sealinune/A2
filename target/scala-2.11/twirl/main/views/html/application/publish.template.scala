
package views.html.application

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object publish_Scope0 {
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

class publish extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[String],String,play.twirl.api.HtmlFormat.Appendable] {

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
    
        <h1><b>Posting Page</b></h1><br/>
        
        <p>You are signed in as """),_display_(/*13.34*/email),format.raw/*13.39*/("""!!!  <a href="logout">Click here to log out</a><p>

        <form action="postmessage" method="post" >
            <label>Message:</label><br/>
            
            <textarea style="width: 750px; height: 200px;" name="newMessage" type="text"></textarea><br/>
            <label>Tag:</label><br/>
            <input type="text" style="width: 50px" name="tag1" />
            <input type="text" style="width: 50px" name="tag2" />
            <input type="text" style="width: 50px" name="tag3" />
            <input type="text" style="width: 50px" name="tag4" />
            <button type="submit">Submit</button>
        </form>
        
        <br/>
        <form action="index" method = "get"> 
            <button type="submit">Back to the home page</button>
        </form>
        
        <br/>
        <b>old messages : </b>
        
        """),_display_(/*35.10*/for(message <- messageList) yield /*35.37*/ {_display_(Seq[Any](format.raw/*35.39*/("""
			"""),format.raw/*36.4*/("""<div class="col-sm-12" style="margin-:15px;">
				<label>email</label>
				<p>"""),_display_(/*38.9*/message),format.raw/*38.16*/("""</p>
			</div>
		""")))}),format.raw/*40.4*/("""
		
    """),format.raw/*42.5*/("""</body>
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
object publish extends publish_Scope0.publish
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 23:11:06 AEDT 2015
                  SOURCE: D:/PlayFramework/sealinune-assignment2015/app/views/application/publish.scala.html
                  HASH: 2cf8101abf0ecfb59dcf9ad1884cd7154fc337f1
                  MATRIX: 774->1|908->40|938->44|1186->265|1212->270|2113->1144|2156->1171|2196->1173|2228->1178|2335->1259|2363->1266|2413->1286|2450->1296
                  LINES: 27->1|32->1|34->3|44->13|44->13|66->35|66->35|66->35|67->36|69->38|69->38|71->40|73->42
                  -- GENERATED --
              */
          