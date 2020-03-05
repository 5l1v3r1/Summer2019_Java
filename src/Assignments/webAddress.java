package Assignments;

import java.util.Scanner;

public class webAddress {
	public static void main(String[] args) {
		
		System.out.println("write a web address:");
		
		Scanner scan = new Scanner(System.in);
		
		
		String add = scan.nextLine().toLowerCase();
		String ext = "";
		String domain = "";
		
		
		boolean r1 = add.startsWith("www.");
		boolean r2 = add.endsWith(".com")||add.endsWith(".edu")||add.endsWith(".org")||add.endsWith(".gov")||add.endsWith(".net");
		
		if(r1&&r2) {
			
			int a = add.lastIndexOf(".")+1;
			ext = add.substring(a);
			int b = add.indexOf(".")+1;
			domain = add.substring(b, a-1);
			
		}else {
			System.out.println("invalid web address "+add);
		}
		
		
		
		System.out.println("Domain: "+domain+ " Extention: "+ext);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
