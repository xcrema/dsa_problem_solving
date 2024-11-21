import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "aaaddd";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        List<String> result = new ArrayList<>();

        for (int i=0; i<n; i++) {
            dp[i][i] = true;
            result.add(String.valueOf(s.charAt(i)));
        }

        for (int i=0; i<n-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = true;
                result.add(s.substring(i, i+2));
            }
        }


        for (int i=3; i<=n; i++) {
            for (int j=0; j<n-i+1; j++) {
                if (dp[j+1][j+i-2] && s.charAt(j) == s.charAt(j+i-1)) {
                    dp[j][j+i-1] = true;
                    result.add(s.substring(j, j+i));
                }
            }
        }

        System.out.println(result);
    }
}