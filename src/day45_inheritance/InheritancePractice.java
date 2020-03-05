package day45_inheritance;

public class InheritancePractice extends ParentClass {
//                   sub                   super
	
	/*
	 protected static String password = "1";
	 public static int age = 12;
     static double salary = 1000000; 
          
          those are here like ghost
	 */
	
	public static void main(String[] args) {
	//	System.out.println(username); neither inheritable nor visible
		System.out.println(password);
		System.out.println(age);
		System.out.println(salary);
	}
	
}
