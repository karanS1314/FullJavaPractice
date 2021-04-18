package oopsRevision.SingletonClass;

public class AppConfig {
     private AppConfig() {}
     
   static  AppConfig obj=null;
     public static AppConfig getinstance() {
    	 if(obj==null) {
    		 obj=new AppConfig();
    	 }
    	 return obj;
     }
}
