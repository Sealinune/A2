
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/PlayFramework/sealinune-assignment2015/conf/routes
// @DATE:Sun Oct 04 23:23:50 AEDT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:35
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def sessionsView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.sessionsView",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sessions"})
        }
      """
    )
  
    // @LINE:26
    def doLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.doLogout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:31
    def doRemoteLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.doRemoteLogout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "remoteLogout"})
        }
      """
    )
  
    // @LINE:25
    def loginView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.loginView",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:28
    def registerView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.registerView",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:29
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:30
    def doRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.doRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def api_tags: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.api_tags",
      """
        function(tag) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/tags/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", encodeURIComponent(tag))})
        }
      """
    )
  
    // @LINE:21
    def api_users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.api_users",
      """
        function(username) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
        }
      """
    )
  
    // @LINE:15
    def postmessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.postmessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postmessage"})
        }
      """
    )
  
    // @LINE:17
    def searchuser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchuser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchuser"})
        }
      """
    )
  
    // @LINE:20
    def api_postmessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.api_postmessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/postmessage"})
        }
      """
    )
  
    // @LINE:12
    def publish: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.publish",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publish"})
        }
      """
    )
  
    // @LINE:23
    def api_tag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.api_tag",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/tag"})
        }
      """
    )
  
    // @LINE:18
    def searchtopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchtopic",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchtopic"})
        }
      """
    )
  
    // @LINE:10
    def front: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.front",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spa"})
        }
      """
    )
  
    // @LINE:13
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.search",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }


}