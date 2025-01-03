class Solution {
    public int waysToSplitArray(int[] nums) {
        int ans = 0;
        long[] prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];
        for(int i = 1 ; i< nums.length; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        for(int  i = 0; i < nums.length-1; i++){
           long leftsum = prefixSum[i];
           long rightsum = prefixSum[nums.length-1] - leftsum;
           
           if(leftsum>=rightsum)
           ans++;
        }
        return ans;
    }
}