// @SOURCE:/Users/wendyarifkurniyanto/Documents/Projects/Scala/PlaySlickQS/conf/routes
// @HASH:4ce32a51b09675c47a4ccd6ac87fdfc0ebc7a818
// @DATE:Sun Apr 17 14:36:47 WIB 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:35
class ReverseAssets {


// @LINE:35
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:21
def jsonInsertCartProduct(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/insertCartProduct")
}
                        

// @LINE:26
def jsonUpdateCartProduct(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/updateCartProduct")
}
                        

// @LINE:31
def jsonDeleteCart(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/deleteCart")
}
                        

// @LINE:19
def jsonInsertProduct(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/insertProduct")
}
                        

// @LINE:15
def jsonFindAllCartProduct(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "json/allCartProduct")
}
                        

// @LINE:18
def jsonInsert(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/insert")
}
                        

// @LINE:24
def jsonUpdateProduct(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/updateProduct")
}
                        

// @LINE:9
def insert(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "insert")
}
                        

// @LINE:12
def jsonFindAll(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "json/all")
}
                        

// @LINE:25
def jsonUpdateCart(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/updateCart")
}
                        

// @LINE:32
def jsonDeleteCartProduct(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/deleteCartProduct")
}
                        

// @LINE:14
def jsonFindAllCart(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "json/allCart")
}
                        

// @LINE:10
def insertProduct(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "insertProduct")
}
                        

// @LINE:13
def jsonFindAllProduct(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "json/allProduct")
}
                        

// @LINE:30
def jsonDeleteProduct(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/deleteProduct")
}
                        

// @LINE:20
def jsonInsertCart(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "json/insertCart")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:35
class ReverseAssets {


// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:21
def jsonInsertCartProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonInsertCartProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/insertCartProduct"})
      }
   """
)
                        

// @LINE:26
def jsonUpdateCartProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonUpdateCartProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/updateCartProduct"})
      }
   """
)
                        

// @LINE:31
def jsonDeleteCart : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonDeleteCart",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/deleteCart"})
      }
   """
)
                        

// @LINE:19
def jsonInsertProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonInsertProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/insertProduct"})
      }
   """
)
                        

// @LINE:15
def jsonFindAllCartProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonFindAllCartProduct",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "json/allCartProduct"})
      }
   """
)
                        

// @LINE:18
def jsonInsert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonInsert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/insert"})
      }
   """
)
                        

// @LINE:24
def jsonUpdateProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonUpdateProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/updateProduct"})
      }
   """
)
                        

// @LINE:9
def insert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.insert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insert"})
      }
   """
)
                        

// @LINE:12
def jsonFindAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonFindAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "json/all"})
      }
   """
)
                        

// @LINE:25
def jsonUpdateCart : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonUpdateCart",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/updateCart"})
      }
   """
)
                        

// @LINE:32
def jsonDeleteCartProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonDeleteCartProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/deleteCartProduct"})
      }
   """
)
                        

// @LINE:14
def jsonFindAllCart : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonFindAllCart",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "json/allCart"})
      }
   """
)
                        

// @LINE:10
def insertProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.insertProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insertProduct"})
      }
   """
)
                        

// @LINE:13
def jsonFindAllProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonFindAllProduct",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "json/allProduct"})
      }
   """
)
                        

// @LINE:30
def jsonDeleteProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonDeleteProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/deleteProduct"})
      }
   """
)
                        

// @LINE:20
def jsonInsertCart : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonInsertCart",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json/insertCart"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:35
class ReverseAssets {


// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:21
def jsonInsertCartProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonInsertCartProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonInsertCartProduct", Seq(), "POST", """""", _prefix + """json/insertCartProduct""")
)
                      

// @LINE:26
def jsonUpdateCartProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonUpdateCartProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonUpdateCartProduct", Seq(), "POST", """""", _prefix + """json/updateCartProduct""")
)
                      

// @LINE:31
def jsonDeleteCart(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonDeleteCart(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonDeleteCart", Seq(), "POST", """""", _prefix + """json/deleteCart""")
)
                      

// @LINE:19
def jsonInsertProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonInsertProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonInsertProduct", Seq(), "POST", """""", _prefix + """json/insertProduct""")
)
                      

// @LINE:15
def jsonFindAllCartProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonFindAllCartProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonFindAllCartProduct", Seq(), "GET", """""", _prefix + """json/allCartProduct""")
)
                      

// @LINE:18
def jsonInsert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonInsert(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonInsert", Seq(), "POST", """ JSON Insert page""", _prefix + """json/insert""")
)
                      

// @LINE:24
def jsonUpdateProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonUpdateProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonUpdateProduct", Seq(), "POST", """ JSON Update page""", _prefix + """json/updateProduct""")
)
                      

// @LINE:9
def insert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.insert(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "insert", Seq(), "POST", """ Home page""", _prefix + """insert""")
)
                      

// @LINE:12
def jsonFindAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonFindAll(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonFindAll", Seq(), "GET", """""", _prefix + """json/all""")
)
                      

// @LINE:25
def jsonUpdateCart(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonUpdateCart(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonUpdateCart", Seq(), "POST", """""", _prefix + """json/updateCart""")
)
                      

// @LINE:32
def jsonDeleteCartProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonDeleteCartProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonDeleteCartProduct", Seq(), "POST", """""", _prefix + """json/deleteCartProduct""")
)
                      

// @LINE:14
def jsonFindAllCart(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonFindAllCart(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonFindAllCart", Seq(), "GET", """""", _prefix + """json/allCart""")
)
                      

// @LINE:10
def insertProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.insertProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "insertProduct", Seq(), "POST", """""", _prefix + """insertProduct""")
)
                      

// @LINE:13
def jsonFindAllProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonFindAllProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonFindAllProduct", Seq(), "GET", """""", _prefix + """json/allProduct""")
)
                      

// @LINE:30
def jsonDeleteProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonDeleteProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonDeleteProduct", Seq(), "POST", """ JSON Delete page""", _prefix + """json/deleteProduct""")
)
                      

// @LINE:20
def jsonInsertCart(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonInsertCart(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonInsertCart", Seq(), "POST", """""", _prefix + """json/insertCart""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    