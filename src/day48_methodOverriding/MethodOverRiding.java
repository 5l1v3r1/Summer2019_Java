package day48_methodOverriding;

class student {
	public void printname() {
		System.out.println("coco");
	}
}


public class MethodOverRiding extends student{

	public void print(String str) {
		
	}
	
    public void print(double a) {
		
	}
    
    public void printname() {
    	System.out.println("yoyo");
    }
    
   public static void main(String[] args) {
	
	   student obj2 = new student();
	   obj2.printname();
	   
	   MethodOverRiding obj = new MethodOverRiding();
	   obj.printname();
}


}
