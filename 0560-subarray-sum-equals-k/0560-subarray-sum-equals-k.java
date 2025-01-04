class Solution {
    public int subarraySum(int[] nums, int k) {
         if (nums == null || nums.length == 0) {
            return 0; // Return 0 if the array is empty
        }

        int currSum = 0;
        int count = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            // Check if the current sum equals k
            if (currSum == k) {
                count++;
            }

            // Check if (currSum - k) exists in the map
            if (prefixSumMap.containsKey(currSum - k)) {
                count += prefixSumMap.get(currSum - k);
            }

            // Update the map with the current sum
            prefixSumMap.put(currSum, prefixSumMap.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}