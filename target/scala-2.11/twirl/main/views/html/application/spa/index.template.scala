
package views.html.application.spa

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

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    
    
    
    <link rel="stylesheet" href=""""),_display_(/*15.35*/routes/*15.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.82*/("""" />
    <link rel="stylesheet" href=""""),_display_(/*16.35*/routes/*16.41*/.Assets.versioned("stylesheets/animate.css")),format.raw/*16.85*/("""">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://code.jquery.com/jquery-2.1.4.min.js" ></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="https://fb.me/react-0.13.3.js"></script>
    <script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script src="http://cdn.bootcss.com/web-socket-js/1.0.0/web_socket.min.js"></script>
    
    <script src=""""),_display_(/*26.19*/routes/*26.25*/.Assets.versioned("javascripts/main.js")),format.raw/*26.65*/("""" type="text/javascript" ></script>
    <meta name="referrer" content="no-referrer">
    <meta charset="UTF-8">
    <title></title>
    
</head>
<body>
    <div class = "container">
		<div class="row">
			<h2 class="text-center">Twitter-like-app
				<div class="logout">
					
					<button 
					        class="btn btn-sm btn-drfault pull-right" 
					        id="register" 
					        data-toggle="modal" 
					        data-target="#registermodal" 
					        style="margin-left:20px;">
					        Register
					 </button>
					 
					 <button 
					        class="btn btn-sm btn-primary pull-right" 
					        id="login" 
					        data-toggle="modal" 
					        data-target="#loginmodal">
					        LogIn
					  </button>
					  
				</div>
				<div class="login hidden">
					<button class="btn btn-sm btn-drfault pull-right" id="logout" style="margin-left:20px;">
					    Log Out
					</button>
					<a id="user" style="font-size:14px;margin-top: 7px;" class="pull-right"> </a>
				</div>
			</h2>
		</div>
		
		<div class="row" style="margin-top:15px;">
  			<div class="row">
			  <div class="col-lg-offset-8 col-lg-4">
				<div class="input-group">
				  <input type="text" class="form-control" placeholder="Search for...">
				  <span class="input-group-btn">
					<button class="btn btn-default" type="button" id="search">Go!</button>
				  </span>
				</div>
			  </div>
			</div>
  		</div>
  		
  		
		<div class="row">
			<textarea class="col-lg-12" style="height:120px;margin-top:15px;"></textarea>
			<button class="btn btn-default pull-right" style="margin-top:15px;">Submit</button>
		</div>
		
		<div class="row hidden" style="margin-top:15px;" id="send_message_wrapper">
			<div class="row">
				<textarea class="col-lg-12" style="height:120px;margin-top:15px;" id="message-content"></textarea>
				<p class="help-block" style="color:red" id="send-tip"></p>
				<button class="btn btn-default pull-right" style="margin-top:15px;" id="send-message">Submit</button>
			</div>
  		</div>
  		
  		<div class="row"	id="message-list">
			
		</div>
		
		
		<div class="modal fade" id="loginmodal" tabindex="-1" role="dialog" aria-labelledby="loginmodallabel" style="margin-top:100px;">
		  <div class="modal-dialog">
			<div class="modal-content">
			  <div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">Log In</h4>
			  </div>
			  <div class="modal-body">
				<form id="loginform">
				  <div class="form-group">
					<label for="email">Email address</label>
					<input type="email" class="form-control" id="email" placeholder="Email">
				  </div>
				  <div class="form-group">
					<label for="password">Password</label>
					<input type="password" class="form-control" id="password" placeholder="Password">
				  </div>
				</form>
			  </div>
			  <div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
				<button type="button" class="btn btn-primary">Ok</button>
			  </div>
			</div>
		  </div>
		</div>
		
		<div class="modal fade" id="registermodal" tabindex="-1" role="dialog" aria-labelledby="registermodallabel" style="margin-top:100px;">
		  <div class="modal-dialog">
			<div class="modal-content">
			  <div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">Register</h4>
			  </div>
			  <div class="modal-body">
				<form id="loginform">
				  <div class="form-group">
					<label for="email">Email address</label>
					<input type="email" class="form-control" id="email" placeholder="Email">
				  </div>
				  <div class="form-group">
					<label for="password">Password</label>
					<input type="password" class="form-control" id="password" placeholder="Password">
				  </div>
				  <div class="form-group">
					<label for="confirmpassword">ConfirmPassword</label>
					<input type="password" class="form-control" id="confirmpassword" placeholder="ConfirmPassword">
				  </div>
				</form>
			  </div>
			  <div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
				<button type="button" class="btn btn-primary">Ok</button>
			  </div>
			</div>
		  </div>
		</div>
  		
    </div>

</body>
</html>
"""))
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
                  DATE: Mon Oct 05 01:46:32 AEDT 2015
                  SOURCE: D:/PlayFramework/sealinune-assignment2015/app/views/application/spa/index.scala.html
                  HASH: ae0c9f3680f170c851507f7a68d4acbf91c137e5
                  MATRIX: 754->1|850->3|880->7|1284->384|1299->390|1361->431|1428->471|1443->477|1508->521|2101->1087|2116->1093|2177->1133
                  LINES: 27->1|32->1|34->3|46->15|46->15|46->15|47->16|47->16|47->16|57->26|57->26|57->26
                  -- GENERATED --
              */
          