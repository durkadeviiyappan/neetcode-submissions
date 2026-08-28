class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int maxArea = 0;
        int left = 0 ;
        int right = heights.length-1;
        while(left < right){
            //area = lenght * breath
            area = (right-left) * (Math.min(heights[left],heights[right]));
            maxArea = Math.max(maxArea , area);

            if(heights[right] < heights[left]){
                right--;
            }else{
                left++;
            }
        }
        return maxArea;
        
    }
}
