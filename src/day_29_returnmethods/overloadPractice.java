package day_29_returnmethods;

public class overloadPractice {
	
	public static void main(String[] args) {
		System.out.println("String Array");
		
		boolean[] array1 = {true,false};
		main(array1);
		
		double[] array2 = {1,2,3};
		main(array2);
		
		return;
	}
	
	public static void main(int[] args) {
		System.out.println("Int Array");
	}
	
	public static void main(double[] args) {
		System.out.println("double Array");
	}
	
	public static int main(boolean[] args) {
		System.out.println("boolean array");
		return 78;
	}
	

}
