class Solution {
    public int search(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }
    static int search(int []arr,int target,int s,int e) {
		if(s > e){
			return -1;
		}
		int mid = s + (e - s)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]<target) {
			return search(arr, target, mid + 1,e);
		}
		return search(arr, target, s, mid - 1);
		
	}
}