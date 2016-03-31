// @SOURCE:/home/upsmart/git/upsmart-dmp/conf/routes
// @HASH:beba62b77ef1b66f452d64230b900db5dcfad9d9
// @DATE:Wed Sep 09 15:57:12 CST 2015

package controllers;

public class routes {
public static final controllers.ReverseMainController MainController = new controllers.ReverseMainController();
public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets();

public static class javascript {
public static final controllers.javascript.ReverseMainController MainController = new controllers.javascript.ReverseMainController();
public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets();
}
          

public static class ref {
public static final controllers.ref.ReverseMainController MainController = new controllers.ref.ReverseMainController();
public static final controllers.ref.ReverseAssets Assets = new controllers.ref.ReverseAssets();
}
          
}
          