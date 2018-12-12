package RandomLeet;

import java.util.Arrays;

//leetcode 280
/*
Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

Example:

Input: nums = [3,5,2,1,6,4]
Output: One possible answer is [3,5,1,6,2,4]
 */
public class WiggleSort {
    /*
    [1,2,3,4,5,6]



     */

//    public void wiggleSort(int[] nums){
//        Arrays.sort(nums);
//        for(int i=1;i<nums.length-1;i+=2){
//            swap(nums, i, i+1);
//        }
//    }
//
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void wiggleSort(int[] nums){
        boolean less = true;
        for(int i=0;i<nums.length-1;i++){
            if(less) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }else{
                if(nums[i] < nums[i+1]){
                    swap(nums,i,i+1);
                }
            }
            less = !less;
        }
    }
}
