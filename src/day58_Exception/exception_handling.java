package day58_Exception;

public class exception_handling {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(9/0);
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block"); // it always gets executed
		}
		
		System.out.println("==================");
		
		try {
			Thread.sleep(2000);
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block"); 
		}
		
	}

}
