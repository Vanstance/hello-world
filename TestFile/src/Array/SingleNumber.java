package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class SingleNumber {
    public int singleNumber(int[] nums) {

        return xor(nums);
    }

    public int xor(int[] nums){
        //xor方法
        int ans = 0;
        for(int i =0; i<nums.length; i++){
            ans ^= nums[i];
            /*XOR方法
            n ^ n = 0, n^0 =n;
			*/
        }
        return ans;
    }

    public int hashSet(int[] A){
        HashSet<Integer> set = new HashSet<>();
        for(int n:A){
            if(!set.add(n)) //如果n已经出现过,就remove n
                set.remove(n); //如果num[i] 有偶数个,经过一进一出,已经没有了
        }

        Iterator<Integer> it = set.iterator();
        return it.next();//set里面只剩下了单数过的
    }


}
