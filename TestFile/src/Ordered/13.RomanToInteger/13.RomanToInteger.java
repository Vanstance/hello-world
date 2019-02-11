class Solution {
    public int romanToInt(String s) {
        /* 1.先把string变成单个字母，按照顺序
        	2. 给每个String赋值
        	3. 如果String0 >= String 1，那么String0+1
        			String0	<String1, 那么String1 - String-
        */
    	int value = 0;
    	int nums[] = new int[s.length()];
    	for(int i=0;i<s.length();i++){
    		switch(s.charAt(i)){
    			case 'M':
                	nums[i]=1000;
                	break;
            	case 'D':
                	nums[i]=500;
                	break;
            	case 'C':
                	nums[i]=100;
                	break;
            	case 'L':
                	nums[i]=50;
                	break;
            	case 'X' :
                	nums[i]=10;
                	break;
            	case 'V':
                	nums[i]=5;
                	break;
            	case 'I':
                	nums[i]=1;
                	break;
    		}
    	}

    	for(int i=0;i<s.length()-1;i++){
    		if(nums[i] >= nums[i+1]){
    			value = value + nums[i];
    		}
    		else{
    			value = value - nums[i];
    		}
    	}
    	return value + nums[s.length()-1];
    }
}