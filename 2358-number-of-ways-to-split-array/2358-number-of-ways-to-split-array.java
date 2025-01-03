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

// Prefix Sum as long: To handle cases where the array contains large values that could result in overflow during summation, I changed prefixSum to long.
// Correct Comparison Logic:
// The leftSum is the prefix sum up to index i.
// The rightSum is derived by subtracting leftSum from the total sum (prefixSum[n - 1]).
// The split condition checks if leftSum >= rightSum.
// Limit the Range of i: The loop runs from 0 to n - 2, as the array must split into two non-empty subarrays.