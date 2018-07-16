class Solution {
    public int maxArea(int[] height) {
        //height is the value of Ai
        int maxarea = 0;
        for(int i=0;i<height.length;i++)
            for(int j=i+1;j<height.length;j++)
                maxarea = Math.max(maxarea, Math.min(height[i],height[j])*(j-i));
		return maxarea;  
    }
}