package Day40_StaticKeyword;

public class staticVariables {
	
	static String name;
	static double staticnum;
	
	int num1; // instance variable
	
	public static void main(String[] args) {
		
	//	System.out.println(num1);  static only accepts class members
		staticVariables objectA = new staticVariables();
		System.out.println(objectA.num1);
		
		staticVariables a = new staticVariables();
		a.name = "esra";
		System.out.println(a.name); //esra
		
		staticVariables b = new staticVariables();
		
		b.name = "esi";
		
		System.out.println(b.name); // esi
		System.out.println(a.name); // esi
	//=======================================================
	System.out.println(staticVariables.staticnum); // 0.0
		staticVariables object1 = new staticVariables();
		object1.staticnum = 4.5;
		System.out.println(object1.staticnum); // 4.5
		
		staticVariables object2 = new staticVariables();
		System.out.println(object2.staticnum); // 4.5
		
		
		
		
		
	}

	
}
