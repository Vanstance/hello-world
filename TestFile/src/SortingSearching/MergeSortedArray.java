package SortingSearching;
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1;  //last index of nums1that has valid number
        int i2 = n - 1; // last index of nums2
        int lastIndex = m + n - 1; //last index of nums array
        while(i1 >= 0 && i2 >= 0){
            if(nums1[i1] > nums2[i2]){ //compare two numbers
                //if nums1[i1] is bigger, then place it in the last index in nums1
                nums1[lastIndex] = nums1[i1];
                i1 --;
            } else {
                nums1[lastIndex] = nums2[i2];
                i2 --;
            }
            lastIndex --;
        }
        // if i1 is greater than 0 but i2 is not, we don't need to do anything becuase it's a sorted array.
        // However, if i2 is greater than 0, this means the rest of spot is only n2.
        while( i2 >= 0){
            nums1[lastIndex] = nums2[i2];
            lastIndex --;
            i2 --;
        }
    }
    public static void main(String[] args){
        int[] nums1 ={1,2,3,0,0,0,0};
        int m = 3;
        int[] nums2 = {2,3,5,6};
        int n = 4;
        merge(nums1,m,nums2,n);

        System.out.println(nums1);

    }
}
