class Solution {
    public int reverse(int x) {
      int answer = 0;
        
        while(x!=0){           
            int remainder = x %10;
            int newAnswer = answer *10 + remainder;

            if ((newAnswer - remainder) / 10 != answer)
                { return 0; }
           answer = newAnswer;
           x = x/10;
        }   
    return answer;
    }
   
}