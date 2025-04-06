class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null){
            return -1;
        }
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				nums[i] = -1;
			}
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int j = 0; j < nums.length; j++){
            sum+=nums[j];
            if(map.containsKey(sum)){
                int last = map.get(sum);
                max = Math.max(max, j - last);
            }else{
                map.put(sum, j);
            }
        }
        return max;
    }
}