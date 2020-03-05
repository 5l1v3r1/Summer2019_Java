package kendi_practicelerim;

public class methodcalisma {
	public static void main(String[] args) {
		sum(54,849);
		sum();
	    System.out.println();
		
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sum() {
		for(int i = 0; i < 20; i++) {
			System.out.print(i+" ");
		}
	}

}
