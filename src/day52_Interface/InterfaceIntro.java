package day52_Interface;

public interface InterfaceIntro {
	
	public abstract void methodA();
	
	public static void mm() {
		
	}
	
	int a = 100;
	public static void main(String[] args) {
	InterfaceIntro.mm();
	
	System.out.println(a);
	
	}

}

interface Data{
	
	
}


class Test implements InterfaceIntro, Data{
	
	@Override
	public void methodA() {
		
	}
	
	
}


