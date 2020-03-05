package day59_Exceptions;

public class TestCustomException {
	public static void main(String[] args) throws LunchTimeException{
		
    // throw new NoBreakTimeException();
	//	throw new RuntimeException("there is a run time exception");
		
		boolean studentaskedforbreak = true;
		
		if(studentaskedforbreak) {
			throw new NoBreakTimeException();
			
		} else {
			System.out.println("contunie to class");
		}
		
		
		try {
			throw new NoBreakTimeException();
		} catch (NoBreakTimeException e) {  // also you can write RuntimeException, since it a parent class
			System.out.println("it has to be break time no more java");
		}
		
		
		throw new LunchTimeException();
		
		
	}

}
