package day10_ifSatement;

public class multi_branch_ifStatement {
	public static void main(String[] args) {
		
		
		if(false) {
			System.out.println("if block");
		} 
		else if(false) {
			System.out.println("else if block");
		} 
		else {
			System.out.println("else block");
	}
		
		
		
		
		// ilk ikisi dogru olursa ilki execute olur
		
		
		
		
		
		
		System.out.println("\n========================");
		
		
		
		/*
		 task 1:
		 
		     90 <= grade <= 100 ==> A
		     80 <= grade < 90 ==> B
		     70 <= grade < 80 ==> C
		     60 <= grade < 70 ==> D
		                 else ==> F
		 
		 */
		
		
		
		int grade = 100;
		
		if( grade >= 90 && grade <= 100) {
			System.out.println("A");
		}
		else if( grade < 90 && grade >= 80) {
			System.out.println("B");
		}
		else if( grade < 80 && grade >= 70) {
			System.out.println("C");
		}
		else if( grade < 70 && grade >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
		
		
		
		
		System.out.println("\n========================");
		
		
		/*
		 task2:
		 1. 0~12 ==> good morning
		 2. 12~15 ==> good afternoon
		 3. 15~23 ==> good night
		 4. 12 good noon
		 */
		
		
		
		
		
		int hour = 12;
		
		if(hour>= 0 && hour <12) {
			System.out.println("good morning");
		}
		else if(hour >12 && hour <= 15) {
			System.out.println("good afternoon");
		}
		else if(hour>15 && hour <=23) {
			System.out.println("good night");
		}
		else {
			System.out.println("good noon");
		}
		
		
		
		
		System.out.println("\n========================");
		
		
		
		
		/*
		 task:
		 int num1, num2, num3,
		 find the bigger number
		 
		 
		 
		 */
		
		
		int num1 = 1, num2=6, num3= 6;
		
		if( num1 > num2 && num1> num3) {
			System.out.println(num1 +" is the bigger number");
		}
		else if( num2 > num1 && num2 > num3) {
			System.out.println(num2+" is bigger number");
		}
		else if(num3>num2 && num3>num1) {
			System.out.println(num3+" is the bigger number");
		}
		else if(num3 == num2 && num3 > num1) {
			System.out.println(num3+" and "+num2+" are the bigger number");
		}
		else if(num3 == num1 && num3 > num2) {
			System.out.println(num3+" and "+num1+" are the bigger number");
		}
		else if(num2 == num1 && num2 > num3) {
			System.out.println(num1+" and "+num2+" are the bigger number");
		}
		else {
			System.out.println("all of them are equal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
