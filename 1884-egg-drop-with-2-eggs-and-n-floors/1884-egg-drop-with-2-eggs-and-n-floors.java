class Solution {
        int[] dp = new int[1001];
    public int twoEggDrop(int n) {
        /*
        recursive solution  
                if (n <= 2)
            return n;

        int ans = Integer.MAX_VALUE;

        for (int x = 1; x <= n; x++) {

            int worstCase = 1 + Math.max(

                    x - 1,

                    twoEggDrop(n - x)
            );

            ans = Math.min(ans, worstCase);
        }

        return ans;
         */

     // DP (Memoization)
     if (n <= 2)
            return n;

        if (dp[n] != 0)
            return dp[n];

        int ans = Integer.MAX_VALUE;

        for (int x = 1; x <= n; x++) {

            int worstCase = 1 + Math.max(

                    x - 1,

                    twoEggDrop(n - x)
            );

            ans = Math.min(ans, worstCase);
        }

        return dp[n] = ans;

    }
}