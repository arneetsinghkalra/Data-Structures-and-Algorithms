import java.util.HashMap;
import java.util.Map;

public class Questions {
	
	public static void main(String[] args) {
		//Question 1:
		int nums[] = new int[] {4,9,6,2,5,1};
		int target = 8;
	}
	
//{Question 1 ................................
/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
	
	public int[] twoSumBruteForce(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public int[] twoSumOptimalSolution(int[] nums, int target) {
	      Map<Integer,Integer> map = new HashMap<>();
	      
	        for (int i = 0; i < nums.length; i++){
	            int num2 = target - nums[i];
	            
	            if(map.containsKey(num2)){
	                return new int[]{map.get(num2),i};
	            }
	            map.put(nums[i],i);
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
//*****************************************************
}
