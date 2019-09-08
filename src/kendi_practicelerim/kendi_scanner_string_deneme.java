package kendi_practicelerim;

import java.util.Scanner;

public class kendi_scanner_string_deneme {
	
	public static void main(String[] args) {
		
		
		
		Scanner selam = new Scanner(System.in);
		
		System.out.println("Bana hayalini anlat");
		
		String tamam = selam.nextLine();
		
		System.out.println("Sence gerceklesekler mi?");
		
		String cevap = selam.nextLine();
		
		System.out.println(tamam+" ve "+cevap+" cevabi "+"birbiriyle uyusmadi");
		
		
		 System.out.println("tekrar denemek ister misin? (evet(1)\\hayir(2))");
		 int secenek = selam.nextInt();
		 
		 
		 if(secenek==1) {
			 System.out.println("pekala");
			 
		 }
		 else if(secenek == 2) {
			 System.out.println("sen bilirsin");
		 }
		 else {
			 System.out.println("yanlis girdi");
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
