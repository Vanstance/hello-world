package ArrayString;
/*
Given an array nums and a target value k, find the maximum length of a subarray that sums to k.
If there isn't one, return 0 instead.

Note:
The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

Example 1:

Input: nums = [1, -1, 5, -2, 3], k = 3
Output: 4
Explanation: The subarray [1, -1, 5, -2] sums to 3 and is the longest.
Example 2:

Input: nums = [-2, -1, 2, 1], k = 1
Output: 2
Explanation: The subarray [-1, 2] sums to 1 and is the longest.
Follow Up:
Can you do it in O(n) time?
 */

import java.util.*;

public class MaximumSizeSubarraySumEqualsk {
    // O(n) method;
    public static int maxSubArrayLen(int[] nums, int k) {
        int max = 0;
        if(nums == null) return 0;
        int n = nums.length;
        for(int i = 1; i< n; i++) nums[i] += nums[i-1];
        //this is to transform num into sums;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int j=0;j<n;j++){
            if(!map.containsKey(nums[j])) map.put(nums[j],j);
            if(map.containsKey(nums[j]-k)) max = Math.max(max,j-map.get(nums[j]-k));
        }
        return max;
    }

//    public static int maxSubArrayLen(int[] nums, int k){
//        if(nums == null) return 0;
//        int n = nums.length;
//        ArrayList<Integer> list = new ArrayList<>();
//        int max = 0;
//
//        for(int i=0; i<n; i++){
//            int sum = 0;
//            for(int j =i; j<n; j++){
//                sum = sum + nums[j];
//                if(k == sum) max = j-i+1; list.add(max);
//            }
//        }
//        Collections.sort(list);
//        return list.get(0);
//    }


    public static void main(String[] args){
        int nums[] = {1,-1,5,-2,3};
        int k = 3;
        System.out.println(maxSubArrayLen(nums,k));
    }
}
