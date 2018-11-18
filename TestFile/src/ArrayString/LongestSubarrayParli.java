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
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {//遍历所有字符的 位置


            int len1 = expandAroundCenter(s, i, i);
        /*计算以位置 i 为中心的奇数回文子串的长度，len1必为奇数，因为它的中心是单个字符
        例如i=2,s=cbabc，调用函数，从a发散，会得到一个len1=5的结果。如果i=0或者1，3，4，
        就会得到len1=1。len1的最小值就是1，因为一个字符本身肯定是一个回文子串
        */

            int len2 = expandAroundCenter(s, i, i + 1);
            //计算以位置 i 和 i+1 为中心的偶数回文子串的长度,同上。详情见expandAroundCenter函数

            int len = Math.max(len1, len2);//因为要找最长子串，所以先比较从当前位置发散的奇数串和偶数串两个串哪个更长，只要长的，短的没用
            if (len > end - start) {
            /*end-start就是目前找到那个最长子串的长度，如果这次循环的len
            没有原来找到的长那就不用更新start和end了，因为只要最长的，短的没用。
            那么end-start为什么就是目前找到那个最长子串的长度呢？别急往后看*/

                start = i - (len - 1) / 2;
            /*在当前这个循环里，上面几步你已经找到在i位置长度最长的回文子串了，
            如果这个子串是奇数串，那么 i 就是找到当前这个长度为len的子串的中心位置，
            如果这个子串是偶数串，i 就是中心的两个其中左边的那个。
            由于len是int型，(len-1)/2 肯定会得到一个整数，当len是奇数时，没问题它肯定是整数
            这个数就是那个子串去掉中心之后的一半，比如s = caabaaagklkj, i=3时，
            我们找到了一个比较长的回文子串 aabaa ,i=3是它的中心的位置,len=5没错吧，
            好的计算一下，i-(len-1)/2= 1  而 1 这个位置呢，就是回文串开始的那个a的位置
            如果是偶数串呢，(len-1)/2 这个数其实就是去掉两个中心字符之后的一半，你想啊
            如果不减1，它除2刚好是自己这个子串的一半，减了1肯定变成奇数，奇数除2了，它又是个int型
            肯定会把除不尽的舍掉了，所以刚好就是比刚刚不减1得到的那个数小1，这里也可以是len/2-1
            但是为了统一奇数和偶数的公式，这样写没毛病，就是偶数不太好理解。
            所以start就是当前找到的最长子串的开始的位置**********
            如果文字不好理解 直接举个例子比划比划就明白了*/

                end = i + len / 2;
            /*同理，可以自己推一下无论奇数偶数通用这个公式。至于为什么上面要-1下面不-1，
            这是由于排序是从0开始的，我每次都是现推，我也不知道有什么快速记忆的方法*/
            }
        }
        return s.substring(start, end + 1);//最后end+1是因为substring(x,y+1)返回的就是x到y的子串，定义是这样
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;//传入了左右两个位置，所以当你要验证奇数串的时候，就两个参数传同一个位置
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            /*当两个位置对称的时候就往外扩散，否则就退出循环。当然还有左右都不能超出边界的条件*/
            L--;//L是有可能等于-1的
            R++;//R也是有可能等于s.length()的，只是不会再进入下一次循环了
        }
        return R - L - 1;//R-L是比长度要大一个的，你可以自己奇数偶数都试一下，其实还是因为下标从0开始。


//    public static String longestPalindrome(String s){
//        int len = s.length();
//        int max = 0;
//        String ans = "";
//        for(int i= 0; i<len;i++){
//            for(int j = i+1; j<=len; j++){
//                String test = s.substring(i,j);
//                if(isParli(test)&&test.length()>0){
//                    ans = s.substring(i,j);
//                    max = Math.max(max, ans.length());
//                }
//            }
//        }
//        return ans;
//    }
//
//    private static boolean isParli(String s){
//        if(s==null) return false;
//        for(int i =0; i<s.length()/2;i++)
//            if(s.charAt(i) != s.charAt(s.length()-i-1))
//                return false;
//        return true;
//    }
    }
}
