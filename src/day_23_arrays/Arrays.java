package day_23_arrays;

public class Arrays {
	public static void main(String[] args) {
		
		/*
		 Arrays: a variable that we can store multiple values
		 regular variables: int a = 10;
		 
		 arrays: int[] variableName = {10, 20, 30, 40 ..};
		 
		 each values (elements) in an array have their own index numbers:
		 int[] variableName = {10, 20, 30, 40 ..};
		      index num:       0   1   2   3 ..
		      
		      to retrive the data of the array:
		           
		            VariableName[indexNumber of data]:
		         
		          VariableName[3] ==> 40
		           VariableName[0] ==> 10
		           
		           Array is immutable, and array's size is fixed
		           
		           array's size must be initialized, there are two ways
		           we can initialize array's size:
		             1. giving values: int[] a = {123}
		             2. giving the size only: int[] a = new int[lengthNumber]
		 
		 */
		
		int[] a = {1, 2};
		String[] names = {"Muazzez", "Dilara", "Esmira", "Huseyin", "Hamza"};
		//                   0          1         2          3         4
		
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		String str = names[0];
		System.out.println(str);
		//                       .......
		
		
		
		
		
		double[] myArray = {1, 2, 3, 4, 5, 8, 0, 2};
		//index             0  1  2  3  4  5  6  7
		
		for(int i = 0; i < 8; i++) {
			
			System.out.print(myArray[i]+", ");
			
		}
		System.out.println();
		
		
		
		//length of array:
		
		String str1 ="ABC";
		int A = str1.length();
		System.out.println(A);
		
		int[] Numbers = {12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int B = Numbers.length;
		          System.out.println(B);
		
		          int highestindexnumber = Numbers.length-1;
		System.out.println(highestindexnumber);
		
		
		for(int i = 0; i < Numbers.length; i++ ) {
			System.out.print(Numbers[i]+" ");
		}
		
		System.out.println();
		
		
		char[] mychar = {'a', 'b', 'c', 'd'};
		int highestIndex = mychar.length-1;
		System.out.println(highestIndex);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
