package day15;

public class StringMethods {
	public static void main(String[] args) {
		
		String str = "Cybertek";
		//index num:  01234567
		
		//charAt(index):
		
		System.out.println(str.charAt(5));
		
		        char ch = str.charAt(4);
		        System.out.println(ch);
		
		        String str2 = "Mu htar";
		      //index numbers  0123456
		        
		        System.out.println(str2.charAt(2));
		        
		        // length():
		        
		        String name = "Donald J Trump";
		        System.out.println(name.length());
		        
		        //concat():
		        
		        String s1 = "Cybertek";
		                 s1.concat(" School"); // attempt to modify String s1
		               //returns a brand new String value
		             
		                 System.out.println(s1); // String is immutable
		                 s1 = s1.concat(" School");
		                 System.out.println(s1);
		                 
		
		       //toUpperCase():
		                 String N = "cybertek";
		                 N.toUpperCase();
		                 
		                 System.out.println(N); //cybertek, string is immutable
		                 
		                 N = N.toUpperCase();
		                 System.out.println(N); //CYBERTEK
		                 
		       //toLowerCase():
		                 String name1 = "MUAZZEZ";
		                 name1.toLowerCase();
		                 System.out.println(name1);
		                 name1 = name1.toLowerCase();
		                 System.out.println(name1);
		                 
		                 
		      //concat():
		                 String mua = " merhaba ";
		                 mua.concat(" ben ");
		                 
		                 System.out.println(mua);
		                 
		                 String azzez = mua.concat("ben");
		                 mua = azzez;
		                 System.out.println(mua);
		                 System.out.println(azzez);
		                 
		     //charAt(index):
		                 String Kahve = "Gunlugum Kahveyi cok seviyorum";
		                 // index ==>    0123456789....
		                char love = Kahve.charAt(2);
		                 System.out.println(love);
		        
		                 System.out.println(Kahve.charAt(12));
		                 
		     // length():
		                 String hayal = "Hayallerimi Kaybettim";
		                 System.out.println(hayal.length());
		
		
		
		
		
		
	}

}
