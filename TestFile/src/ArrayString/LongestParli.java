package ArrayString;

public class LongestParli {
//    //time O(n^2), space: O(n^2)
//    public String lonestPalindrome(String s) {
//        if (s == null || s.length() == 0) return s;
//        String res = "";
//        boolean[][] dp = new boolean[s.length()][s.length()];
//        int max = 0;
//        for (int j = 0; j < s.length(); j++) {
//            for (int i = 0; i <= j; i++) {
//                dp[i][j] = s.charAt(i) == s.charAt(j) && ((j - 1 <= 2) || (dp[i + 1][j - 1]));
//                if (dp[i][j]) {
//                    if (j - 1 + 1 > max) {
//                        max = j - i + 1;
//                        res = s.substring(i, j + 1);
//                    }
//                }
//            }
//        }
//        return res;
//    }
//
//    //tiem:n^2 space:1
//    String res = "";
//    public String lonestPalindrome2(String s) {
//        if (s == null || s.length() == 0) return s;
//        for(int i=0;i<s.length();i++){
//            helper(s,i,i);
//            helper(s,i,i+1);
//        }
//        return res;
//
//    }
///*  0 1 2 3 4
//eg: b a b a d
//    left = 2, right = 2;
//    left = 1, right = 3;
//    left = 0, right = 4;
// */
//    public void helper(String s,int left,int right){
//        while(left >=0 && right < s.length() & s.charAt(left) == s.charAt(right)){
//            left--; right++;
//        }
//        String cur = s.substring(left+1,right);
//        if(cur.length()>res.length()) res = cur;
//    }
    public static void main(){
        String Input = "babad";
//        Output: "bab";
        System.out.println(longestPalindrome(Input));


    }


    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
