class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet();
        if(nums.length == 0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum == -nums[i]){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;right--;
                }else if(sum> -nums[i]){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}