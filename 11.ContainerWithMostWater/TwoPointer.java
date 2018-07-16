class Solution {
	/*Two Pointer way to solve the problem
    we use left and right pointers. Start from both sides, every time we calculate the area size, 
    and then, we move the smaller pointer into middle.
	*/
    public int maxArea(int[] height) {
        //height is the value of Ai
        int maxarea = 0;int l = 0; int r=height.length-1;
        while(l<r){
            maxarea = Math.max(maxarea, Math.min(height[l], height[r])*(r-l));
            if(height[l] > height[r]) r--;
            else l++;
        }
        return maxarea;
    }
}