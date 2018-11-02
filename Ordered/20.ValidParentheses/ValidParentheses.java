/*
假设一个字符串只有(){}[]这几个符号，检测字符串是否合格：
1. 对应括号必须以对应括号结尾
2. 括号顺序不能乱
*/
class ValidParentheses{
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
        	if(st.empty()){
        		st.push(s.charAt(i));
        	}else if(s.charAt(i) == ')' && st.peek() == '('){
        		st.pop();
        	}else if(s.charAt(i) == '[' && st.peek() == ']'){
        		st.pop();
        	}else if(s.charAt(i) == '{' && st.peek() == '}'){
        		st.pop();
        	}else {
        		st.push(s.charAt(i));
        	}
        }

        return st.empty();
    }
}