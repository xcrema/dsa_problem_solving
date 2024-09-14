import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] coins = {1};
        int amount = 0;

        Set<Integer> numberOfCoins = new HashSet<>();

        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int[] temp : dp) {
            Arrays.fill(temp, Integer.MAX_VALUE);
        }

        helper(coins, amount, 0, 0, numberOfCoins, dp, true);

        if (numberOfCoins.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(Collections.min(numberOfCoins));
        }
    }

    public static int helper(int[] coins, int amount, int pos, int currentNoOfCoins, Set<Integer> numberOfCoins, int[][] dp, boolean include) {
        if (amount == 0) {
            numberOfCoins.add(currentNoOfCoins);
            return currentNoOfCoins;
        }

        if (pos >= coins.length || amount < 0) {
            return -1;
        }

        if (include && dp[pos][amount] != Integer.MAX_VALUE) {
            return dp[pos][amount];
        }
        if (!include && dp[pos + 1][amount] != Integer.MAX_VALUE) {
            return dp[pos + 1][amount];
        }

        int includeCurr = helper(coins, amount - coins[pos], pos, currentNoOfCoins + 1, numberOfCoins, dp, true);
        if (dp[pos][amount] != -1 && dp[pos][amount] != 0) {
            if (includeCurr == -1) {
                dp[pos][amount] = -1;
            } else
                dp[pos][amount] = Math.min(includeCurr - currentNoOfCoins, dp[pos][amount]);
        }


        int notIncludeCurr = helper(coins, amount, pos + 1, currentNoOfCoins, numberOfCoins, dp, false);
        if (dp[pos + 1][amount] != -1 && dp[pos + 1][amount] != 0) {
            if (notIncludeCurr == -1) {
                dp[pos + 1][amount] = -1;
            } else
                dp[pos + 1][amount] = Math.min(notIncludeCurr - currentNoOfCoins, dp[pos + 1][amount]);
        }

        if ()

    }
}