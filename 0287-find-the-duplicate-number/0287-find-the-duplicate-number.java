class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int num : nums){
            map.put(num,map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                ans = entry.getKey();
            }
        }
         return ans;
        }
       
    }
