import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
    }

    private static int characterReplacement(String str, int k) {
        int start = 0, maxLength = 0, maxCount = 0;
        int[] count = new int[26];

        for (int end = 0; end < str.length(); end++) {
            maxCount = Math.max(maxCount, ++count[str.charAt(end) - 'A']);

            if (end - start + 1 - maxCount > k) {
                count[str.charAt(start)]--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}