class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int left = 0, right = n -1, maxlength = 0;
        while(left < right) {
            int length = Math.min(height[left], height[right]);
            int width = right - left;

            int area = length * width;
            if(area > maxlength) {
                maxlength = area;
            }
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxlength;
        
    }
}