package Day_22;

public class warmup {
	public static void main(String[] args) {
		
		String str ="";
		int i =1;
		
		while(i <=30) {
			
		 if(i % 3 == 0 && i % 5 == 0) {
				str+="FINRA ";
				
			}else if(i%3 == 0) {
				str += "FIN ";
			}else if(i % 5 == 0) {
				str +="RA ";
			}else {
				str += i+" ";
			}
			
			i++;
		
			
		   
		}
		
		System.out.println(str);
		
	}

}
