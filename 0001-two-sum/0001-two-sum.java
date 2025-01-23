class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer,Integer> map = new HashMap();
        // for(int i = 0; i < nums.length; i++){
        //     map.put(nums[i],i);
        // }
        // for(int i = 0; i < nums.length; i++){
        //     int num = nums[i];
        //     int rem = target - num;
        //     if(map.containsKey(rem)){
        //         int index = map.get(rem);
        //         if(index==i)continue;
        //         return new int []{i,index};
        //     }
        // }
        // return new int []{};

    //     int[] ans = null;
    //     int[] prefixSum = new int[nums.length];
    //     prefixSum[0] = nums[0];
    //     for(int i = 1; i < nums.length; i++){
    //         prefixSum[i] = prefixSum[i-1] + nums[i];
    //     }
    //    for (int i = 0; i < nums.length; i++) {
    //         if (prefixSum[i] == target) {
    //             ans = new int[]{0, i};
    //             return ans;
    //         }

    //         for (int j = 0; j < i; j++) {
    //             if (prefixSum[i] - prefixSum[j] == target) {
    //                 ans = new int[]{j + 1, i};
    //                 return ans;
    //             }
    //         }
    //     }

    //     return ans == null ? new int[]{} : ans;
    HashMap<Integer,Integer> map = new HashMap();
    for(int i = 0; i< nums.length; i++){
        map.put(nums[i],i);
    }
     for(int i = 0; i< nums.length; i++){
        int rem = target - nums[i];
        if(map.containsKey(rem)){
            int index = map.get(rem);
            if(i==index)
            continue;
            return new int[]{i,index};
        }
    }
 return new int[]{};

    
    }
}