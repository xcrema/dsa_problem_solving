import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Set<String> allPalindroms = new HashSet<>();

        helper(arr, 0, String.valueOf(arr[0]), 0, allPalindroms);

        String result = "";
        for(String str : allPalindroms) {
            result = result.length() > str.length() ? result : str;
        }
        return result;
    }

    public static void helper(char[] arr, int i, String currStr, int pos, Set<String> allPalindroms) {
        if (i>=arr.length) {
            return;
        }

        String revCurrStr = new StringBuilder(currStr).reverse().toString();

        if (currStr.equals(revCurrStr)) {
            allPalindroms.add(currStr);

            if ((i+pos+1) < arr.length && (i-pos-1) >= 0) {
                String newCurrStr =  "" + arr[i-pos-1] + currStr + "" + arr[i+pos+1];
                helper(arr, i, newCurrStr, pos+1, allPalindroms);
            }
        }
        if (i+1 < arr.length) {
            helper(arr, i+1, String.valueOf(arr[i+1]), pos, allPalindroms);
        }
        return;
    }
}