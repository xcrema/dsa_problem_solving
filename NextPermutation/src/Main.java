import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 7, 2, 1};

        int pivot = getIndexOfLastPeak(arr) - 1;

        if (pivot != -1) {
            int minValueIndexWithThreshold = getMinValueIndexWithThreshold(arr, pivot);
            swap(arr, pivot, minValueIndexWithThreshold);
        }

        int i = pivot + 1;
        int j = arr.length - 1;

        while (i < j) {
            swap(arr, i++, j--);
        }

        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }

    private static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    private static int getMinValueIndexWithThreshold(int[] arr, int pivot) {

        for (int i = arr.length - 1; i > pivot; i--) {
            if (arr[pivot] < arr[i]) {
                return i;
            }
        }

        return 0;
    }

    private static int getIndexOfLastPeak(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                return i;
            }
        }
        return 0;
    }
}