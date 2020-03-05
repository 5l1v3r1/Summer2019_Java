package day53_InterfaceContinue;

interface B {
	void method3();
}

// if the types are same use extends keyword not implements
public interface extends_vs_implements extends B { 
              //  subtype                   supertype
	void method1(); // public
	void method2(); // public
//  void method3();  inherited
	
	//public void method3(){ } abstract method cannot be overriden in interface, because there is no instance methods in interfaces 
	
}

class A implements extends_vs_implements {

	@Override
	public void method3() {
		
	}

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}
	
	
}

class C extends A implements extends_vs_implements {
	// you can use at the same time extends and implements
	
	
	
}



