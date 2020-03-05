package day59_Exceptions;

import java.io.FileInputStream;

public class throws_Keyword {
	
	public static void main(String[] args) throws Exception {
	//	sleep(3000); // method signiture contains throws
		sleep2(3000); 
		test();
		method1();
	}
	
	
	public static void sleep(long milliSec) throws InterruptedException {
		Thread.sleep(milliSec);
	}
	
	public static void method1() throws InterruptedException {
		sleep(3000);
	}
	
	
	public static void test() throws Exception {  // instead of using interruptedexception u can use exception
		
		Thread.sleep(3000);
		
		System.out.println("hello");
		System.out.println("ddj");
		
		Thread.sleep(5000);
	}
	
	
	
	
	
	public static void sleep2(long milliSec) {
		try {
			Thread.sleep(milliSec);
		} catch (Exception e) {
			
		}
		
	}
	

	public static void method2() throws Exception{  // InterruptedException is not available with fileinput.
		Thread.sleep(3000);
		
		FileInputStream fil = new FileInputStream("");
	}
	
	
}
