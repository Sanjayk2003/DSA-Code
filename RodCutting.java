public class RodCutting {
    public static int maxProfit(int[] price, int N) {
        int[] dp = new int[N + 1]; // dp[i] stores max profit for length i
        
        // Compute max profit for each length 1 to N
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], price[j - 1] + dp[i - j]);
            }
        }
        return dp[N]; // Maximum profit for rod length N
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20}; // Prices for rod lengths 1 to N
        int N = 8; // Total rod length

        System.out.println("Maximum Profit: " + maxProfit(price, N));
    }
}
