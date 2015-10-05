
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/PlayFramework/sealinune-assignment2015/conf/routes
// @DATE:Sun Oct 04 23:23:50 AEDT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
