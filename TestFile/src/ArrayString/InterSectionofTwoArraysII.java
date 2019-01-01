package ArrayString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InterSectionofTwoArraysII {
    InterSectionofTwoArraysII interSectionofTwoArraysII;

//    public int[] intersect(int[] nums1, int[] nums2){
//        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
//        ArrayList<Integer> result = new ArrayList<Integer>();
//
//        for(int i=0; i<nums1.length; i++){
//            if(map.containsKey(nums1[i])) map.put(nums1[i],map.get(nums1[i]));
//            else map.put(nums1[i],1);
//        }
//
//        for(int i= 0;i<nums2.length;i++){
//            if(map.containsKey(nums2[i])&&map.get(nums2[i])>0){
//                result.add(nums2[i]);
//                map.put(nums2[i],map.get(nums2[i])-1);
//            }
//        }
//
//
//
//
//        int[] r = new int[result.size()];
//        for(int i = 0; i < result.size(); i++){
//            r[i] = result.get(i);
//        }
//
//        return r;
//    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1); // if there is a key with value nums1[i], it increase the value from 1 to 2, and so on, which is count;
            else map.put(nums1[i], 1); //if there is no key with value nums1[i], then put it into map.
        }

        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        int[] r = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
        {
            r[i] = result.get(i);
        }

        return r;
    }



    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};


//        int[] nums1 = new int[]{4,9,5};
//        int[] nums2 = new int[]{9,4,9,8,4};
        InterSectionofTwoArraysII is2 = new InterSectionofTwoArraysII();
        System.out.println(Arrays.toString(is2.intersect(nums1,nums2)));
    }
}
