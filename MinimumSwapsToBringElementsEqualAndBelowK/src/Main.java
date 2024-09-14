public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 7, 9, 5, 8, 7, 4};
        int k = 5;

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) cnt++;
        }

        int bad = 0;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }

        int ans = bad;
        for (int i = 0, j = cnt; j < arr.length; i++, j++) {

            if (arr[i] > k) {
                --bad;
            }

            if (arr[j]> k) {
                ++bad;
            }

            ans = Math.min(ans, bad);
        }

        System.out.println(ans);
    }
}