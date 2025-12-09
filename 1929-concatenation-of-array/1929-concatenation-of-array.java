class Solution {
    public int[] getConcatenation(int[] nums) {
        int newLength = nums.length * 2;
        int[] result = new int[newLength];
        for(int i = 0; i < newLength; i++){
            if( i < nums.length){
                result[i] = nums[i];
            }else{
                result[i] = nums[i-nums.length];
            }
        }
        return result;
    }
}