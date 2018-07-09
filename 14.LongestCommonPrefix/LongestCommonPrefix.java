class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0)
            return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                //indexOf(Ch) 返回指定字符Ch在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1,如果有，返回0
                pre = pre.substring(0,pre.length()-1);
                //只要还没找到相等的字符串，那就把当前字符串长度-1；
        }
    return pre;
    }
}

/*解题思路
比如有字符串 apple, applet, appaa
我们可以选择第一个 apple为pre，然后用剩下的所有的词汇与pre对比。
用到x.indexOf(pre)，函数的意思是将x和pre对比，如果相同，则得到0. 如果不相同，则将pre-1继续对比（即apple - applet 变成 appl - applet）
最后返回的pre就是能够和每个词汇都能开头重复的词汇
*/