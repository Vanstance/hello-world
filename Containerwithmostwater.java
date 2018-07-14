class Containerwithmostwater {
    public int maxArea(int[] height) {
        int maxarea = 0; int l =0 ; int r = height.length-1;int area = 0;
        while(l<r){
            area = Math.min(height[l],height[r]) * (r-l);
            maxarea = Math.max(maxarea, area);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxarea;
    }
}