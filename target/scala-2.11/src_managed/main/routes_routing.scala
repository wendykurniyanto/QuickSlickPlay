// @SOURCE:/Users/wendyarifkurniyanto/Documents/Projects/Scala/PlaySlickQS/conf/routes
// @HASH:4ce32a51b09675c47a4ccd6ac87fdfc0ebc7a818
// @DATE:Sun Apr 17 14:36:47 WIB 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_insert1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("insert"))))
private[this] lazy val controllers_Application_insert1_invoker = createInvoker(
controllers.Application.insert,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "insert", Nil,"POST", """ Home page""", Routes.prefix + """insert"""))
        

// @LINE:10
private[this] lazy val controllers_Application_insertProduct2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("insertProduct"))))
private[this] lazy val controllers_Application_insertProduct2_invoker = createInvoker(
controllers.Application.insertProduct,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "insertProduct", Nil,"POST", """""", Routes.prefix + """insertProduct"""))
        

// @LINE:12
private[this] lazy val controllers_Application_jsonFindAll3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/all"))))
private[this] lazy val controllers_Application_jsonFindAll3_invoker = createInvoker(
controllers.Application.jsonFindAll,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonFindAll", Nil,"GET", """""", Routes.prefix + """json/all"""))
        

// @LINE:13
private[this] lazy val controllers_Application_jsonFindAllProduct4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/allProduct"))))
private[this] lazy val controllers_Application_jsonFindAllProduct4_invoker = createInvoker(
controllers.Application.jsonFindAllProduct,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonFindAllProduct", Nil,"GET", """""", Routes.prefix + """json/allProduct"""))
        

// @LINE:14
private[this] lazy val controllers_Application_jsonFindAllCart5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/allCart"))))
private[this] lazy val controllers_Application_jsonFindAllCart5_invoker = createInvoker(
controllers.Application.jsonFindAllCart,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonFindAllCart", Nil,"GET", """""", Routes.prefix + """json/allCart"""))
        

// @LINE:15
private[this] lazy val controllers_Application_jsonFindAllCartProduct6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/allCartProduct"))))
private[this] lazy val controllers_Application_jsonFindAllCartProduct6_invoker = createInvoker(
controllers.Application.jsonFindAllCartProduct,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonFindAllCartProduct", Nil,"GET", """""", Routes.prefix + """json/allCartProduct"""))
        

// @LINE:18
private[this] lazy val controllers_Application_jsonInsert7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/insert"))))
private[this] lazy val controllers_Application_jsonInsert7_invoker = createInvoker(
controllers.Application.jsonInsert,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonInsert", Nil,"POST", """ JSON Insert page""", Routes.prefix + """json/insert"""))
        

// @LINE:19
private[this] lazy val controllers_Application_jsonInsertProduct8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/insertProduct"))))
private[this] lazy val controllers_Application_jsonInsertProduct8_invoker = createInvoker(
controllers.Application.jsonInsertProduct,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonInsertProduct", Nil,"POST", """""", Routes.prefix + """json/insertProduct"""))
        

// @LINE:20
private[this] lazy val controllers_Application_jsonInsertCart9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/insertCart"))))
private[this] lazy val controllers_Application_jsonInsertCart9_invoker = createInvoker(
controllers.Application.jsonInsertCart,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonInsertCart", Nil,"POST", """""", Routes.prefix + """json/insertCart"""))
        

// @LINE:21
private[this] lazy val controllers_Application_jsonInsertCartProduct10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/insertCartProduct"))))
private[this] lazy val controllers_Application_jsonInsertCartProduct10_invoker = createInvoker(
controllers.Application.jsonInsertCartProduct,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonInsertCartProduct", Nil,"POST", """""", Routes.prefix + """json/insertCartProduct"""))
        

// @LINE:24
private[this] lazy val controllers_Application_jsonUpdateProduct11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/updateProduct"))))
private[this] lazy val controllers_Application_jsonUpdateProduct11_invoker = createInvoker(
controllers.Application.jsonUpdateProduct,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonUpdateProduct", Nil,"POST", """ JSON Update page""", Routes.prefix + """json/updateProduct"""))
        

// @LINE:25
private[this] lazy val controllers_Application_jsonUpdateCart12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/updateCart"))))
private[this] lazy val controllers_Application_jsonUpdateCart12_invoker = createInvoker(
controllers.Application.jsonUpdateCart,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonUpdateCart", Nil,"POST", """""", Routes.prefix + """json/updateCart"""))
        

// @LINE:26
private[this] lazy val controllers_Application_jsonUpdateCartProduct13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/updateCartProduct"))))
private[this] lazy val controllers_Application_jsonUpdateCartProduct13_invoker = createInvoker(
controllers.Application.jsonUpdateCartProduct,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonUpdateCartProduct", Nil,"POST", """""", Routes.prefix + """json/updateCartProduct"""))
        

// @LINE:30
private[this] lazy val controllers_Application_jsonDeleteProduct14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/deleteProduct"))))
private[this] lazy val controllers_Application_jsonDeleteProduct14_invoker = createInvoker(
controllers.Application.jsonDeleteProduct,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonDeleteProduct", Nil,"POST", """ JSON Delete page""", Routes.prefix + """json/deleteProduct"""))
        

// @LINE:31
private[this] lazy val controllers_Application_jsonDeleteCart15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/deleteCart"))))
private[this] lazy val controllers_Application_jsonDeleteCart15_invoker = createInvoker(
controllers.Application.jsonDeleteCart,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonDeleteCart", Nil,"POST", """""", Routes.prefix + """json/deleteCart"""))
        

// @LINE:32
private[this] lazy val controllers_Application_jsonDeleteCartProduct16_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("json/deleteCartProduct"))))
private[this] lazy val controllers_Application_jsonDeleteCartProduct16_invoker = createInvoker(
controllers.Application.jsonDeleteCartProduct,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsonDeleteCartProduct", Nil,"POST", """""", Routes.prefix + """json/deleteCartProduct"""))
        

// @LINE:35
private[this] lazy val controllers_Assets_at17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """insert""","""controllers.Application.insert"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """insertProduct""","""controllers.Application.insertProduct"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/all""","""controllers.Application.jsonFindAll"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/allProduct""","""controllers.Application.jsonFindAllProduct"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/allCart""","""controllers.Application.jsonFindAllCart"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/allCartProduct""","""controllers.Application.jsonFindAllCartProduct"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/insert""","""controllers.Application.jsonInsert"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/insertProduct""","""controllers.Application.jsonInsertProduct"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/insertCart""","""controllers.Application.jsonInsertCart"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/insertCartProduct""","""controllers.Application.jsonInsertCartProduct"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/updateProduct""","""controllers.Application.jsonUpdateProduct"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/updateCart""","""controllers.Application.jsonUpdateCart"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/updateCartProduct""","""controllers.Application.jsonUpdateCartProduct"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/deleteProduct""","""controllers.Application.jsonDeleteProduct"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/deleteCart""","""controllers.Application.jsonDeleteCart"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """json/deleteCartProduct""","""controllers.Application.jsonDeleteCartProduct"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_Application_insert1_route(params) => {
   call { 
        controllers_Application_insert1_invoker.call(controllers.Application.insert)
   }
}
        

// @LINE:10
case controllers_Application_insertProduct2_route(params) => {
   call { 
        controllers_Application_insertProduct2_invoker.call(controllers.Application.insertProduct)
   }
}
        

// @LINE:12
case controllers_Application_jsonFindAll3_route(params) => {
   call { 
        controllers_Application_jsonFindAll3_invoker.call(controllers.Application.jsonFindAll)
   }
}
        

// @LINE:13
case controllers_Application_jsonFindAllProduct4_route(params) => {
   call { 
        controllers_Application_jsonFindAllProduct4_invoker.call(controllers.Application.jsonFindAllProduct)
   }
}
        

// @LINE:14
case controllers_Application_jsonFindAllCart5_route(params) => {
   call { 
        controllers_Application_jsonFindAllCart5_invoker.call(controllers.Application.jsonFindAllCart)
   }
}
        

// @LINE:15
case controllers_Application_jsonFindAllCartProduct6_route(params) => {
   call { 
        controllers_Application_jsonFindAllCartProduct6_invoker.call(controllers.Application.jsonFindAllCartProduct)
   }
}
        

// @LINE:18
case controllers_Application_jsonInsert7_route(params) => {
   call { 
        controllers_Application_jsonInsert7_invoker.call(controllers.Application.jsonInsert)
   }
}
        

// @LINE:19
case controllers_Application_jsonInsertProduct8_route(params) => {
   call { 
        controllers_Application_jsonInsertProduct8_invoker.call(controllers.Application.jsonInsertProduct)
   }
}
        

// @LINE:20
case controllers_Application_jsonInsertCart9_route(params) => {
   call { 
        controllers_Application_jsonInsertCart9_invoker.call(controllers.Application.jsonInsertCart)
   }
}
        

// @LINE:21
case controllers_Application_jsonInsertCartProduct10_route(params) => {
   call { 
        controllers_Application_jsonInsertCartProduct10_invoker.call(controllers.Application.jsonInsertCartProduct)
   }
}
        

// @LINE:24
case controllers_Application_jsonUpdateProduct11_route(params) => {
   call { 
        controllers_Application_jsonUpdateProduct11_invoker.call(controllers.Application.jsonUpdateProduct)
   }
}
        

// @LINE:25
case controllers_Application_jsonUpdateCart12_route(params) => {
   call { 
        controllers_Application_jsonUpdateCart12_invoker.call(controllers.Application.jsonUpdateCart)
   }
}
        

// @LINE:26
case controllers_Application_jsonUpdateCartProduct13_route(params) => {
   call { 
        controllers_Application_jsonUpdateCartProduct13_invoker.call(controllers.Application.jsonUpdateCartProduct)
   }
}
        

// @LINE:30
case controllers_Application_jsonDeleteProduct14_route(params) => {
   call { 
        controllers_Application_jsonDeleteProduct14_invoker.call(controllers.Application.jsonDeleteProduct)
   }
}
        

// @LINE:31
case controllers_Application_jsonDeleteCart15_route(params) => {
   call { 
        controllers_Application_jsonDeleteCart15_invoker.call(controllers.Application.jsonDeleteCart)
   }
}
        

// @LINE:32
case controllers_Application_jsonDeleteCartProduct16_route(params) => {
   call { 
        controllers_Application_jsonDeleteCartProduct16_invoker.call(controllers.Application.jsonDeleteCartProduct)
   }
}
        

// @LINE:35
case controllers_Assets_at17_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     