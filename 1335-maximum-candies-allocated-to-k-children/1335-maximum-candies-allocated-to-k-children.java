class Solution {
    public int maximumCandies(int[] candies, long k) {
         Arrays.sort(candies);

        int low = 1, high = candies[candies.length - 1];
        int myAns = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            long count = 0;
            for (int candy : candies) {
                count += candy / mid;
            }

            if (count >= k) {
                myAns = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return myAns;  
    }
}