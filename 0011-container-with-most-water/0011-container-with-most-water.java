class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            int left_height = height[left];
            int right_height = height[right];
            int min_height = Math.min(left_height, right_height);
            max = Math.max(max, min_height*(right-left));
            if(left_height>right_height){right--;}
        else{
            left++;
        }
        }
        return max;
    }
}