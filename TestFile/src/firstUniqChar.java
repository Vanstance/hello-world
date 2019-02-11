class Solution {
    public static int firstUniqChar(String s) {
        if(s == null){
            return -1;
        }
        int[] record = new int[256];
        for(int i = 0; i < s.length(); i++){
            record[s.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++){
            if(record[s.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String s = "aaabcdee";
//        System.out.println("1");
        System.out.println(firstUniqChar(s));
    }
}

