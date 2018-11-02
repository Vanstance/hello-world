class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i =0; i<nums.length; i++){
            ans ^= nums[i]; 
            /*XOR方法
            n ^ n = 0, n^0 =n;
			*/
        }
        return ans;
    }
}
