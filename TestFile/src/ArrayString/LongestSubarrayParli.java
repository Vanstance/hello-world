package ArrayString;
/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */
public class LongestSubarrayParli {
    public static void main(String[] args){
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }



    public static String longestPalindrome(String s){
        int len = s.length();
        int max = 0;
        String ans = "";
        for(int i= 0; i<len;i++){
            for(int j = i+1; j<=len; j++){
                String test = s.substring(i,j);
                if(isParli(test)&&test.length()>0){
                    ans = s.substring(i,j);
                    max = Math.max(max, ans.length());
                }
            }
        }
        return ans;
    }

    private static boolean isParli(String s){
        if(s==null) return false;
        for(int i =0; i<s.length()/2;i++)
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        return true;
    }
}
