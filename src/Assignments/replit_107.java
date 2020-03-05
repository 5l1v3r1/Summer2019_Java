package Assignments;

public class replit_107 {
	public static void main(String[] args) {

		int[] nums= {2,4,6,7,8,9,5,2};
		int count = 0;
		
		for(int  i= 0; i <nums.length;i++) {
			if(nums[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
