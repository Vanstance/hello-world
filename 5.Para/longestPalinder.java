class longestPalindrome {

	public String longestPalindrome(String s){
		String ans = "";
		int max = 0;
		int len = s.length();
		for(int i =0; i<len ;i++)
			for(int j =i+1;j<=len; j++){
				String test = s.substring(i,j);
				if(isPalinder(test) && test.length() > max){
					ans = s.substring(i,j);
					max = Math.max(max, ans.length());
				}
			}
		return ans;
	}


	public boolean isPalinder(String s){
		int len = s.length();
		for(int i = 0; i<len/2 ; i++){
			if(s.charAt(i) != s.charAt(len-1-i)){
				return false;
			}
		}
		return true;
	}

}