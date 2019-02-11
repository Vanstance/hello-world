public Sting longestCommonPrefix(String[] strs){
    if(strs == null || strs.length ==0)
        return "";

    String pre = strs[0];

    int i = 1;
    while(i<strs.length){
        while(strs[i].indexOf(pre) != 0)//see if strs[i] contains "pre" as its prefix
            pre = pre.substring(0,pre.length()-1);
            /*eg: flower - index is 0;
                then flow(flower) -> flow(flowe) -> flow(flow) - bingo, we get pre = flow now;
                repeat ....
                in the end pre = fl
                */
        i++;
    }
    return pre;
}
