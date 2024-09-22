import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(longestPalindromeApproach1("cdda"));
        System.out.println(manacherAlgo("aacabdkacaa"));
    }


    public static String manacherAlgo(String str) {
        if (str.length() <= 1) {
            return str;
        }
        int maxLength = 1;
        String maxLengthStr = str.substring(0, 1);
        str = str.replaceAll("", "#");
        int[] dp = new int[str.length()];


        int l = 0;
        int r = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i <= r) {
                dp[i] = Math.min(r-i, dp[r+l-i]);
            }

            while ((i-dp[i]-1) >= 0 && (i+dp[i]+1) < str.length() && str.charAt(i-dp[i]-1) == str.charAt(i+dp[i]+1))
                dp[i]++;

            if (i+dp[i] > r) {
                r = dp[i]+i;
                l = i-dp[i];
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxLengthStr = str.substring(i-dp[i], i+dp[i]+1).replaceAll("#", "");
            }
        }

        return maxLengthStr;

    }

    public static String longestPalindromeApproach1(String s) {

        if (s.length() <= 1) {
            return s;
        }

        String result = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {

            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > result.length()) {
                result = odd;
            }

            if (even.length() > result.length()) {
                result = even;
            }
        }
        return result;
    }

    private static String expandFromCenter(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
}