public class Main {

    public static int maxAreaHistogram(int[] arr) {

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            int temp = 1;
            int idx = i;

            while (--idx >= 0 && arr[i] <= arr[idx]) {
                temp++;
            }

            idx = i;
            while (++idx < arr.length && arr[i] <= arr[idx]) {
                temp++;
            }

            result = Math.max(result, temp * arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 2, 6};
        maxAreaHistogram(arr);

        arr = new int[] {1, 1, 1, 1, 1};

        maxAreaHistogram(arr);
    }
}