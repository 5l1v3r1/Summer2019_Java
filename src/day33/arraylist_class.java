package day33;
import java.util.ArrayList;
public class arraylist_class {
	
	public static void main(String[] args) {
		
		ArrayList<String> shoppinglist = new ArrayList<>();
		               shoppinglist.add("apple"); // index: 0 , size: 1
		               shoppinglist.add("orange"); // index: 1 , size: 2
		               shoppinglist.add("KiWi"); // index: 2 , size: 3
		               
		               System.out.println(shoppinglist);
		               
		// add(index, object(): adds the object at the given index number
		               
		               shoppinglist.add(1,"strawberry");
		               System.out.println(shoppinglist);
		               
		               ArrayList<Integer> numbers = new ArrayList<>();
		               
		               numbers.add(0, 5);
		               numbers.add(1, 10);
		               numbers.add(2, 15);          
		               numbers.add(1, 1);
		                
		               System.out.println(numbers);  // output: [5, 1, 10, 15]
		               
		               // set(index, object): the given object will replace the object with the given index' object
		               
		               ArrayList<String> mea = new ArrayList<>();
		               mea.add("muazzez");
		               mea.add("esra");
		               mea.add("alperen");
		               mea.add("kiwi");
		               
		               mea.set(0, "mobese"); // muazzez ==> mobese uje bele olduiy
		               
		               System.out.println(mea);
		               
		               // contains(object): checks if the given object is contained in the arraylist, it returns a boolean expression.
		               ArrayList<String> kore = new ArrayList<>();
		               kore.add("sarang");
		               kore.add("kopi");
		               kore.add("hangug");
		               kore.add("hajima");
		               kore.add("achim");
		               // boolean a = kore.contains("kopi"); ==> another way
		               System.out.println(kore.contains("kopi")); // true
		               
		               //equals(arraylist): checks if two arraylist are equal or not. returns a boolean
		               ArrayList<String> japon = new ArrayList<>();
		               japon.add("watashi");
		               japon.add("wakarimasen");
		               japon.add("arigato");
		               japon.add("hai");
		               
		               System.out.println(japon.equals(kore)); // false
		               
		               // remove(int): removes the index
		               ArrayList<Integer> list = new ArrayList<>();
		               list.add(1); // index: 0
		               list.add(2); // index: 1
		               list.add(3); // index: 2     // auto-boxing
		               list.add(4); // index: 3
		               list.add(5); // index: 4
		               
		               list.remove(1);
		               System.out.println(list); // [1, 3, 4, 5]
		               
		               // remove(Integer): removes the first matching object, at the same time it returns boolean value
		               ArrayList<Integer> list2 = new ArrayList<>();
		               list2.add(1); // index: 0
		               list2.add(2); // index: 1
		               list2.add(3); // index: 2     // auto-boxing
		               list2.add(4); // index: 3
		               list2.add(5); // index: 4
		               
		               // [1,2,3,4,5]
		               Integer a = 1;
		               list2.remove(a); // [2, 3, 4, 5]  you can assign it to boolean also
		               boolean r1 = list2.remove(a);
		               System.out.println(list2);
		               System.out.println(r1);
		               
		               ArrayList<String> city = new ArrayList<>();
		               city.add("istanbul");
		               city.add("baku");
		               city.add("seul");
		               city.add("tokyo");
		               city.add("moskova");
		               
		               if(city.remove("moskova")) {
		            	   city.remove(2);
		               }
		               
		               city.add(3, "seul");
		               System.out.println(city);
		               
		     ArrayList<Integer> price = new ArrayList<>();
		         price.add(1);
		         price.add(2);
		         price.add(3);    // auto-boxing
		         price.add(4);
		         price.add(5);
		         
		       price.remove(Integer.parseInt("2"));  // parse method returns primitive
		       System.out.println(price); // [1, 2, 4, 5]
		       
		     boolean r3 = price.remove(Integer.valueOf("3"));  // valueOf method returns wrapper class
		       System.out.println(price);
		       System.out.println(r3);
		     
		               
	}

}
