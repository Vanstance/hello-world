class reverseString{
	public static void main(String[] args){

		String s = "abc";
		char[] x = new char[s.length()];
		int next = 0;
		for(int i =s.length()-1; i>=0; i--){
			x[next] = s.charAt(i);
			next++;
		}

		System.out.println(new String(x));

	}

}