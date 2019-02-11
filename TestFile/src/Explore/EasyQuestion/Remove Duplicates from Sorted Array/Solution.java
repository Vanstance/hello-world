class Solution{
	public int removeDuplicates(int[] nums){
		if(nums == null) return 0;
		if(nums.length < 2) return nums.length;
	
		int next = 1, currVal = nums[0];
		
		for(int i=1; i<nums.length; i++){
			if(nums[i] != currVal){
				currVal = nums[i];
				nums[next++] = currVal;
			}
		}
	return next;
	}
}
