
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/PlayFramework/sealinune-assignment2015/conf/routes
// @DATE:Sun Oct 04 23:23:50 AEDT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """controllers.Application.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""", """controllers.Application.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """spa""", """controllers.Application.front()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """publish""", """controllers.Application.publish()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""", """controllers.Application.search()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postmessage""", """controllers.Application.postmessage()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchuser""", """controllers.Application.searchuser()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchtopic""", """controllers.Application.searchtopic()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/postmessage""", """controllers.Application.api_postmessage()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/$username<[^/]+>""", """controllers.Application.api_users(username:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/tags/$tag<[^/]+>""", """controllers.Application.api_tags(tag:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/tag""", """controllers.Application.api_tag()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.loginView()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UserController.doLogout()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sessions""", """controllers.UserController.sessionsView()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.registerView()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.doLogin()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.doRegister()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remoteLogout""", """controllers.UserController.doRemoteLogout()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_index1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_Application_index1_invoker = createInvoker(
    controllers.Application.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """index"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_front2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spa")))
  )
  private[this] lazy val controllers_Application_front2_invoker = createInvoker(
    controllers.Application.front(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "front",
      Nil,
      "GET",
      """""",
      this.prefix + """spa"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_publish3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publish")))
  )
  private[this] lazy val controllers_Application_publish3_invoker = createInvoker(
    controllers.Application.publish(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "publish",
      Nil,
      "GET",
      """""",
      this.prefix + """publish"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_search4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Application_search4_invoker = createInvoker(
    controllers.Application.search(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_postmessage5_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmessage")))
  )
  private[this] lazy val controllers_Application_postmessage5_invoker = createInvoker(
    controllers.Application.postmessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "postmessage",
      Nil,
      "POST",
      """""",
      this.prefix + """postmessage"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_searchuser6_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchuser")))
  )
  private[this] lazy val controllers_Application_searchuser6_invoker = createInvoker(
    controllers.Application.searchuser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchuser",
      Nil,
      "POST",
      """""",
      this.prefix + """searchuser"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_searchtopic7_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchtopic")))
  )
  private[this] lazy val controllers_Application_searchtopic7_invoker = createInvoker(
    controllers.Application.searchtopic(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchtopic",
      Nil,
      "POST",
      """""",
      this.prefix + """searchtopic"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_api_postmessage8_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/postmessage")))
  )
  private[this] lazy val controllers_Application_api_postmessage8_invoker = createInvoker(
    controllers.Application.api_postmessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "api_postmessage",
      Nil,
      "POST",
      """""",
      this.prefix + """api/postmessage"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_api_users9_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_api_users9_invoker = createInvoker(
    controllers.Application.api_users(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "api_users",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/users/$username<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_api_tags10_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/tags/"), DynamicPart("tag", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_api_tags10_invoker = createInvoker(
    controllers.Application.api_tags(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "api_tags",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/tags/$tag<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_api_tag11_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/tag")))
  )
  private[this] lazy val controllers_Application_api_tag11_invoker = createInvoker(
    controllers.Application.api_tag(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "api_tag",
      Nil,
      "GET",
      """""",
      this.prefix + """api/tag"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_loginView12_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_loginView12_invoker = createInvoker(
    controllers.UserController.loginView(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "loginView",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UserController_doLogout13_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UserController_doLogout13_invoker = createInvoker(
    controllers.UserController.doLogout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "doLogout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UserController_sessionsView14_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sessions")))
  )
  private[this] lazy val controllers_UserController_sessionsView14_invoker = createInvoker(
    controllers.UserController.sessionsView(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "sessionsView",
      Nil,
      "GET",
      """""",
      this.prefix + """sessions"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_UserController_registerView15_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_registerView15_invoker = createInvoker(
    controllers.UserController.registerView(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerView",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_UserController_doLogin16_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_doLogin16_invoker = createInvoker(
    controllers.UserController.doLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "doLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UserController_doRegister17_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_doRegister17_invoker = createInvoker(
    controllers.UserController.doRegister(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "doRegister",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UserController_doRemoteLogout18_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remoteLogout")))
  )
  private[this] lazy val controllers_UserController_doRemoteLogout18_invoker = createInvoker(
    controllers.UserController.doRemoteLogout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "doRemoteLogout",
      Nil,
      "POST",
      """""",
      this.prefix + """remoteLogout"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_versioned19_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
      }
  
    // @LINE:8
    case controllers_Application_index1_route(params) =>
      call { 
        controllers_Application_index1_invoker.call(controllers.Application.index())
      }
  
    // @LINE:10
    case controllers_Application_front2_route(params) =>
      call { 
        controllers_Application_front2_invoker.call(controllers.Application.front())
      }
  
    // @LINE:12
    case controllers_Application_publish3_route(params) =>
      call { 
        controllers_Application_publish3_invoker.call(controllers.Application.publish())
      }
  
    // @LINE:13
    case controllers_Application_search4_route(params) =>
      call { 
        controllers_Application_search4_invoker.call(controllers.Application.search())
      }
  
    // @LINE:15
    case controllers_Application_postmessage5_route(params) =>
      call { 
        controllers_Application_postmessage5_invoker.call(controllers.Application.postmessage())
      }
  
    // @LINE:17
    case controllers_Application_searchuser6_route(params) =>
      call { 
        controllers_Application_searchuser6_invoker.call(controllers.Application.searchuser())
      }
  
    // @LINE:18
    case controllers_Application_searchtopic7_route(params) =>
      call { 
        controllers_Application_searchtopic7_invoker.call(controllers.Application.searchtopic())
      }
  
    // @LINE:20
    case controllers_Application_api_postmessage8_route(params) =>
      call { 
        controllers_Application_api_postmessage8_invoker.call(controllers.Application.api_postmessage())
      }
  
    // @LINE:21
    case controllers_Application_api_users9_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_api_users9_invoker.call(controllers.Application.api_users(username))
      }
  
    // @LINE:22
    case controllers_Application_api_tags10_route(params) =>
      call(params.fromPath[String]("tag", None)) { (tag) =>
        controllers_Application_api_tags10_invoker.call(controllers.Application.api_tags(tag))
      }
  
    // @LINE:23
    case controllers_Application_api_tag11_route(params) =>
      call { 
        controllers_Application_api_tag11_invoker.call(controllers.Application.api_tag())
      }
  
    // @LINE:25
    case controllers_UserController_loginView12_route(params) =>
      call { 
        controllers_UserController_loginView12_invoker.call(controllers.UserController.loginView())
      }
  
    // @LINE:26
    case controllers_UserController_doLogout13_route(params) =>
      call { 
        controllers_UserController_doLogout13_invoker.call(controllers.UserController.doLogout())
      }
  
    // @LINE:27
    case controllers_UserController_sessionsView14_route(params) =>
      call { 
        controllers_UserController_sessionsView14_invoker.call(controllers.UserController.sessionsView())
      }
  
    // @LINE:28
    case controllers_UserController_registerView15_route(params) =>
      call { 
        controllers_UserController_registerView15_invoker.call(controllers.UserController.registerView())
      }
  
    // @LINE:29
    case controllers_UserController_doLogin16_route(params) =>
      call { 
        controllers_UserController_doLogin16_invoker.call(controllers.UserController.doLogin())
      }
  
    // @LINE:30
    case controllers_UserController_doRegister17_route(params) =>
      call { 
        controllers_UserController_doRegister17_invoker.call(controllers.UserController.doRegister())
      }
  
    // @LINE:31
    case controllers_UserController_doRemoteLogout18_route(params) =>
      call { 
        controllers_UserController_doRemoteLogout18_invoker.call(controllers.UserController.doRemoteLogout())
      }
  
    // @LINE:35
    case controllers_Assets_versioned19_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(controllers.Assets.versioned(path, file))
      }
  }
}