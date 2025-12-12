class Solution {
    static int[][] dp = new int[3][1001];

    public int twoEggDrop(int n) {
        int e = 2;
        int f = n;
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(e, f);

    }

    public static int solve(int e, int f) {
        //     int[][] dp = new int[e + 1][f + 1];
        //     for(int[] row : dp){
        //         Arrays.fill(row, -1);
        //     }
        if (e == 1) {
            return f;
        }
        if (f == 0 || f == 1) {
            return f;
        }
        if (dp[e][f] != -1) {
            return dp[e][f];
        }
        int res = Integer.MAX_VALUE;

        for (int k = 1; k <= f; k++) {
            int temp = 1 + Math.max(solve(e - 1, k - 1), solve(e, f - k));
            res = Math.min(temp, res);
        }
        dp[e][f] = res;
        return res;
    }
}