package day18;

public class StringMethods_3 {
	public static void main(String[] args) {
		
		/*
		 indexOf(str) : returns the index number of the first occured character in the given String. helps to find index number of the number you want to know.
		 
		 */
		
		
		
		String a1 = "Batch 12 is a great batch";
		
		int num = a1.indexOf("g");
		System.out.println(num);
		
		int num2 = a1.indexOf("at "); // bulmak istedigin harfin sonrasindan gelen karakterlere gore suzerek bulabilirsin. 
		// eger o harf sadece bir taneyse, sadece onu yazman yeterli
		System.out.println(num2);
		
		String b1 = "today is tuesday, today we have class in the afternoon";
		int n1 = b1.indexOf("te");
		System.out.println(n1);
		
		
		String address = " 7925 Jones Branch Dr, Mclearn, VA 22003";
		int begin= address.indexOf(", M");
		int end = address.indexOf(", V");
	
		
			String cityname = address.substring(begin, end);
			System.out.println(cityname);
			
			String email = "random.email@gmail.com";
			int begin2 = email.indexOf("@")+1;
			int end2 = email.indexOf(".com");
			String emailtype = email.substring(begin2, end2);
			System.out.println(emailtype);
		
		
		/*
		 lastIndexOf() : returns the last occured character' index number as and Int Value
		 */
		
		
		String str = "ABCDABCD";
		
		int n2 = str.indexOf("B"); // 1
		int n3 = str.lastIndexOf("B");// 5   // 'B' da kullanilabilir tek karakter olursa
		System.out.println(n2);
		System.out.println(n3);
		
		
		String myemail = "myemail.school@gmail.com";
		int begin3 = myemail.indexOf("@")+1;     // +1 koyuyoruz cunku @ isaretinden sonra gelen olmali
		int end3 = myemail.lastIndexOf(".");
		
		String emailtype2 = myemail.substring(begin3, end3);
		System.out.println(emailtype2);
		
		
	
		
		
		
		
	}

}
