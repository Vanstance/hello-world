class Solution {
    public boolean isPalindrome(int x) {
        
        if (x<0)
            return false;
        
        int answer = 0;
        int xx = x; 
        while(x!=0){
          int remain =  x % 10;
          int newanswer = answer *10 + remain;             
          answer = newanswer;    
          x = x/10;
        }
        
        return (xx == answer);
    }
}