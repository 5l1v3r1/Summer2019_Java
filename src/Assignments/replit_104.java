package Assignments;

public class replit_104 {
	public static void main(String[] args) {

		int[] nums = {1,4,7,5,5,8};
		boolean check = false;
		
		for(int i= 0; i<nums.length-1;i++) {
			if(nums[i]== 5 &&nums[i+1]==5) {
				check = true;
			}
		}
		System.out.println(check);
	}

}
