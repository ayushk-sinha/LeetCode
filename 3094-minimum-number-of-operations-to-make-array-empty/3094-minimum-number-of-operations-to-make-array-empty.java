class Solution {
    public int minOperations(int[] nums) {
   
        int count = 0; HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);
        for(int x : map.keySet())
            if(map.get(x)==1)return -1;
            else{
                count+=map.get(x)/3;
                if(map.get(x)%3!=0)count++;
            }
        return count;
    }
}