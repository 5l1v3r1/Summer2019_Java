package day59_Exceptions;

public class LunchTimeException extends Exception{

	public LunchTimeException() {
		super("it's lunch time");
		System.err.println("time to stop the class, let's go homeeee yayayaya");
		
	}
	
	
}
