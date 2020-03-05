package day56_Polymorphisim;


class Animal {
	
	public void method1() {
		
	}
}


class dog extends Animal{
	
	public void method2() {
		
	}
}


public class UpCasting {
	
	public static void main(String[] args) {
		
		// sub class to superior type ==> UpCasting
		dog obj = new dog();
		
		
		//Animal obj2 = (Animal)obj; // dog extended animal so its compiling, casting is ok
			
	}

}
