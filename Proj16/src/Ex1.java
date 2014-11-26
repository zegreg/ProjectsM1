
public class Ex1 {

	boolean groupSumIterative (int[] nums, int target){
		
		int acc = 0;
		for (int i = 0; i < nums.length; i++) {
			acc += nums[i];
		}
		
		return acc >= target;
	}
	
	boolean groupSum (int [] nums, int target){
		return sum(nums, 0) >= target;
	}
	
	int sum(int [] nums, int idx){
		if (idx == nums.length) {
			return 0;
		}
		return nums[idx] + sum(nums, idx+1);
		
//		return idx == nums.length
//				? 0
//				: nums[idx] + sum(nums, idx+1);
//		
		
	}
	
	
	
}
