class Solution {
	/*Two Pointer way to solve the problem
    we use left and right pointers. Start from both sides, every time we calculate the area size, 
    and then, we move the smaller pointer into middle
	*/
    public int maxArea(int[] height) {
        //height is the value of Ai
        int maxarea = 0;int i = 0; int j=0;
        for(i=0;i<height.length;i++)
            for(j = i+1;j<height.length;j++){
                maxarea = Math.max(maxarea,Math.min(height[i],height[j])*(j-i));
            }
        return maxarea;
    }
}