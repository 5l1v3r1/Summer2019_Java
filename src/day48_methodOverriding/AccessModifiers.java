package day48_methodOverriding;

class koko {
	void methodA() {
		System.out.println("method A");
	}
	
	public String methodB() {
		return "B";
	}
	
	protected double salary(double bonus) {
		return bonus+100000;
	}
	
}



public class AccessModifiers extends koko{
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		double a = obj.salary(2000);
		System.out.println(a);
	}
	
	@Override 
	void methodA() {
		System.out.println("method A");
	}
	
	@Override
	public String methodB() {
		return "B";
	}
	
	public double salary(double bonus) {
		return bonus+100000;
	}
	
}
