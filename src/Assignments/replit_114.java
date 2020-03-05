package Assignments;

public class replit_114 {
	public static void main(String[] args) {

		int[] nums= {1,4,6,8,9,4,3,3,1};
		int count =0;
		
		for(int each1: nums) {
			  
			count = 0;
			for(int each2: nums) {
				
				if(each1  == each2) {
					
					count++;
				}
				
			}
			if(count ==1) {
				System.out.println(each1);
			}
		}



	}

}
