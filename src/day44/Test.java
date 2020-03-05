package day44;
 // import static day44.Testdata.name;
 // import static day44.Testdata.ID;
import static day44.Testdata.*; // bu daha mantikli cunku hepsini bir yerde import ediyor

import java.util.Arrays;
public class Test {
	
	 public static void main(String[] args) {
		
		 defaultAccessModifier obj = new defaultAccessModifier();
		 System.out.println(obj.namePublic);
		 System.out.println(obj.nameDefault);
	// 	 System.out.println(obj.namePrivate); olmaz, not visible to other classes
		 
		 System.out.println(name);
		System.out.println(ID);
		
		int[] numbers = {1,2,3};
		Arrays.toString(numbers);
      
		System.out.println(age);
		
	}
}
