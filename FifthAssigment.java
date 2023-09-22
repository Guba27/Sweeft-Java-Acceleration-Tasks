public class FifthAssigment {
    public static void main(String[] args) {
        int stairsCount = 5; 
        int variants = countVariants(stairsCount);
        System.out.println("Number of ways to climb " + stairsCount + " stairs: " + variants);
    }

    public static int countVariants(int stairsCount) {
        if (stairsCount <= 1) {
            return 1;
        }

        int[] dp = new int[stairsCount + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= stairsCount; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[stairsCount];
    }
}
