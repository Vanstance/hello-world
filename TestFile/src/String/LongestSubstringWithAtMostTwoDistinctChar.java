package String;

import java.util.HashMap;

/*
Given a string s , find the length of the longest substring t  that contains at most 2 distinct characters.

Example 1:

Input: "eceba"
Output: 3
Explanation: t is "ece" which its length is 3.
Example 2:

Input: "ccaabbb"
Output: 5
Explanation: t is "aabbb" which its length is 5.

 */
public class LongestSubstringWithAtMostTwoDistinctChar {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if( s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, max = 0;

        while(right<s.length()){

            if(map.size()<=2){
                map.put(s.charAt(right),right);
                right++;
            }else{
                int leftMost = s.length();
                int cur = map.get(s.charAt(right));
                leftMost = Math.min(leftMost,cur);
                map.remove(s.charAt(leftMost));
                left++;
            }
            max = Math.max(max, right - left);
        }



        return max;
    }
}
