class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> op = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), op);
        return op;
    }
    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> op) {
        // Add the current subset to the list of subsets
        op.add(new ArrayList<>(current));
        
        for (int i = index; i < nums.length; i++) {
            // Include the number at index i
            current.add(nums[i]);
            // Recur with the next index
            generateSubsets(nums, i + 1, current, op);
            // Backtrack: remove the last number added
            current.remove(current.size() - 1);
        }
    }
}