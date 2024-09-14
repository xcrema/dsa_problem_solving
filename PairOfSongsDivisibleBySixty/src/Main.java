import java.util.*;

public class Main {
//    public static void main(String[] args) {
//
//        int[] arr = {30, 20, 150, 100, 40};
//
//        List<List<Integer>> result = new ArrayList<>();
//        helper(arr, 0, new ArrayList<>(), 0, result);
//        System.out.println(result);
//    }

//    public static void helper(int[] arr, int i, List<Integer> currentVec, int currentSum, List<List<Integer>> result) {
//
//        if (currentVec.size() == 2) {
//            if (currentSum % 60 == 0) {
//                result.add(currentVec);
//            }
//            return;
//        }
//
//        if (i >= arr.length) {
//            return;
//        }
//
//        List<Integer> tempCurrentVec = new ArrayList<>(currentVec);
//        tempCurrentVec.add(arr[i]);
//        helper(arr, i + 1, tempCurrentVec, currentSum + arr[i], result);
//
//        helper(arr, i + 1, currentVec, currentSum, result);
//    }

    public static void main(String[] args) {
        int[] arr = {30, 20, 150, 100, 40};

        int[] cnt = new int[60];

        for (int i = 0; i < arr.length; i++) {
            cnt[arr[i] % 60] += 1;
        }

        long result = 0L;

        for (int i = 1; i < 30; i++) {
            result += (long) cnt[i] * cnt[60 - i];
        }

        result += (long) cnt[30] * (cnt[30] - 1) / 2 + (long) cnt[0] * (cnt[0] - 1) / 2;
        System.out.println(result);
    }
}