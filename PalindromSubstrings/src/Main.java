import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "aba";

        int result = 0;
        boolean [][] dp = new boolean[s.length()][s.length()];

        for (int i=0; i<s.length(); i++) {
            dp[i][i] = true;
            result++;
        }

        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = true;
                result++;
            }
        }

        for (int i = 3; i<=s.length(); i++) {
            for (int j=0; j<s.length()-i+1; j++) {
                if (s.charAt(j) == s.charAt(j+i-1) && dp[j+1][j+i-2]) {
                    dp[j][i+j-1] = true;
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}