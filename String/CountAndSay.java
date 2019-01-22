/*
Count and Say;
Ex:
n   f(n)
1   1
2   11
3   21
4   1211
5   111221
6   312211
Principle is the output[f(n)] is in the form of count + char,
for example, when n = 3, former one read as two(count) one(char), 21
*/
public class Solution{
    public String countAndSay(int n){
        String s = "1";
        for(int i=1; i<n; i++){
            s = countIdx(s);
        }
        return s;
    }

    private String countIdx(String s){
        StringBuilder sb = new StringBuilder();

        char c = s.charAt(0); //without n = 1, s(0) should be count(1);
        int count = 1;

        //read from the secone char at string, each time for a specific s(i), count ++
        //which lead to count(i)s(i), then append them
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }else{
                sb.append(count);
                sb.append(c);

                //start over
                c = s.charAt(i);
                count = 1;
            }
            sb.append(count);
            sb.append(c);

            return sb.toString();
        }
    }
}
