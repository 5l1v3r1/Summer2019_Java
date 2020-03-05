package Assignments;

import java.util.Arrays;

public class replit_118 {
	public static void main(String[] args) {
		
		int[] nums = {1,4,8,3,0,5,7};
		int lastIndex = nums.length-1;
		int middle = nums.length/2;
		
		for(int i =0; i <middle;i++) {
			int temp =nums[i];
			nums[i] = nums[lastIndex -i];
			nums[lastIndex-i] = temp;
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
