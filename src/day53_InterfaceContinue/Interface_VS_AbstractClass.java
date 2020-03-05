package day53_InterfaceContinue;

public interface Interface_VS_AbstractClass {
	
	static int num = 300;
	
	// static{} 
	      // variables in interface are static and final by default, final variables can 
	
	public abstract void method1();
	public abstract int method2();
	
	public void method3();	
	public void method4();

	int a = 10;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Interface_VS_AbstractClass.a);
		// you cannot create object of interface. and instance can be called in static method without any object
	}
	
	
	
}

class Test implements Interface_VS_AbstractClass {

	@Override
	public void method1() {
		
	}

	@Override
	public int method2() {
		
		return 0;
	}

	@Override
	public void method3() {
		
	}

	@Override
	public void method4() {
		
	}
	
}