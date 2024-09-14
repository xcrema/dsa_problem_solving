import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "27";
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        System.out.println(helper(0, s, dp));
    }

    public static int helper(int i, String s, int[] dp) {

        if (i >= s.length()) {
            return 1;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int firstNum = Character.getNumericValue(s.charAt(i));

        int currResult = 0;
        if (firstNum != 0) {
            currResult += helper(i+1, s, dp);
        }

        if (i + 1 < s.length() && firstNum != 0) {
            int secondNum = firstNum * 10 + Character.getNumericValue(s.charAt(i + 1));
            if (secondNum <= 26) {
                currResult += helper(i + 2, s, dp);
            }
        }

        dp[i] = currResult;

        return currResult;
    }


//    public static int helper(int i, String s, int[] dp) {
//
//        if (i >= s.length()) return 1;
//
//        if (dp[i] != -1) return dp[i];
//
//        int ans = 0;
//
//        int op1 = Character.getNumericValue(s.charAt(i));
//        int op2 = 0;
//
//        if (i < s.length() - 1) {
//            op2 = Character.getNumericValue(s.charAt(i)) * 10 + Character.getNumericValue(s.charAt(i + 1));
//        }
//
//        if (op1 > 0) ans += helper(i + 1, s, dp);
//
//        if (op1 > 0 && op2 > 0 && op2 <= 26) ans += helper(i + 2, s, dp);
//
//        dp[i] = ans;
//
//        return ans;
//    }
}