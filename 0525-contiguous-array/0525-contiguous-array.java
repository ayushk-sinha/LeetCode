class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        map.put(0,-1);
        int len = 0;
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i]==0){
                sum = sum - 1;
            }else{
                sum = sum + 1;
            }

            if(map.containsKey(sum)){
                int l = i - map.get(sum);
                len = Math.max(len,l);
            }else{
                map.put(sum,i);
            }
        }
        return len;
    }
}