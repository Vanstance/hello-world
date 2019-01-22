package ArrayString;
/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i=1; i<n;i++){
            result[i] = result[i-1] * nums[i-1];
        }
        /*eg     1,2,3,4 result[1] = r[0]*n[0]=1*1 = 1; result[2] = r[1]*n[1] = 2; r[3] = 2; r[4] =3*2=6
         result  1,1,2,6
         */

        int right = 1;
        for(int i = n-1; i>=0;i--){
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        /*
        nums[]       1,2,3,4
        results[]    24,24,8,6 result[3] = 6, right = 4; result[2] = 8, right = 12; result[1] = 24, right = 24;result[0]=24,right = 24;

         */


        return result;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf2(nums);
        for(int i:result)
            System.out.println(productExceptSelf2(nums));
    }
}

