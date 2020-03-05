package day20_javaRecap;

public class warmup1 {
	public static void main(String[] args) {
		
		//task 1
		
		int sum1 = 0;
		
		
		for(int i = 1; i<=1000;i++) {
			sum1 += i;
		}
		
		
		System.out.println("sum of all numbers "+sum1);
		
		
		
		//task2
		int sum2 = 0;
		for(int i = 1; i<=1000;i++) {
			if(i%2==0) {
				sum2+=i;
			}
		}
		
		System.out.println("sum of all even numbers "+sum2);
		
		
		
		
		//another solution for task2
		
		int Sum2 = 0;
		for(int i = 2; i<=1000;i+=2) {
			Sum2+=i;
		}
		System.out.println("sum of all even numbers "+Sum2);
		
		
		
		
		
		
		// task3
		int sum3= 0;
		for(int i = 1; i<=1000;i+=2) {
			sum3+=i;
		}
		
		System.out.println("sum of all even numbers "+sum3);
		
		
	}

}
