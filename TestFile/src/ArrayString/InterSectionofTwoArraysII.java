package ArrayString;

import java.util.ArrayList;
import java.util.HashMap;

public class InterSectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<nums1.length; i++){
            if(map.containsKey(nums1[i])) map.put(nums1[i],map.get(nums1[i]));
            else map.put(nums1[i],1);
        }


        
        int[] r = new int[result.size()];
        for(int i: result){
            r[i] = result.get(i);
        }

        return r;
    }
}
