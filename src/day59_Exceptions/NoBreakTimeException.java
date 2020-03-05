package day59_Exceptions;

public class NoBreakTimeException extends RuntimeException{
	
	public NoBreakTimeException() {
		
		super("too much breaks have occured in java course");
		
		System.err.println("there is no break till we get the job done");
	}

}
