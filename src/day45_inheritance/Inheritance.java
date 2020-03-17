package day45_inheritance;

class TestBase { // super class
	
      static String chromeDriver; // default
      
      public static void takescreenshot() {
    	  System.out.println("took screenshot");
      }
	
      private static void closebrowser() {    //  its not going to be inheritable
    	  System.out.println("browser closed");
    	  
      }
      
}


public class Inheritance extends TestBase{
     //         sub               super
	 // sub class is gonna inherit all the visible or protected features from the super class

	 /*	static String chromeDriver;
	
	public static void takescreenshot() {
	  System.out.println("took screenshot");
   }
   
   those variable and method we can not see them but they are somewhere in the class
      */
	public static void main(String[] args) {
		System.out.println(chromeDriver);
		takescreenshot();
		
	}                                   
	
}
