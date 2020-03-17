package day46_SuperKeyword;

class B {
	
	public B() {    // super class's constructor
		System.out.println("super");
	}
}

public class DefaultConstructor extends B {
	
	public DefaultConstructor() {
		super();                           // we don't need to call the super class' constructor manually actually. because its default
		System.out.println("sub");
	}
	
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		
	}

}
