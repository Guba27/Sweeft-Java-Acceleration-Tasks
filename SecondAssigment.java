public class SecondAssigment {
    public static void main(String[] args) {
            int amount = 127;
            int minCoins = minSplit(amount);
            System.out.println("Minimum number of coins to make " + amount + " tetri is " + minCoins + " coins");
        }

        public static int minSplit(int amount) {
            int[] coins = {50, 20, 10, 5, 1};

            int minCoins = 0;
            int remainingAmount = amount;

            for (int coin : coins) {
                if (remainingAmount >= coin) {
                    int numCoins = remainingAmount / coin;
                    minCoins += numCoins;
                    remainingAmount %= coin;
                }
            }

            return minCoins;
        }
}
