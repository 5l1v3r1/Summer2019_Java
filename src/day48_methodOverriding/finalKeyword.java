package day48_methodOverriding;

class holly {
	final public void printname() {
		System.out.println("cihiro");
	}
	
}


public class finalKeyword extends holly{
	
/*	
	@Override
	public void printname() {
		System.out.println("sen");
	}
	
	final methods cannot be override
*/
	final int age = 100;
	
	public static void main(String[] args) {
		final String SSN = "123456"; // you cannot assign it for another value. it is constant now
		
		final String DateOfBirth;
		
		DateOfBirth = "08.26.2000"; // you can assign it only one time
		
		System.out.println(SSN);
		System.out.println(DateOfBirth);
		
		finalKeyword obj = new finalKeyword();
		
		System.out.println(obj.age);
		
		
	}

}
