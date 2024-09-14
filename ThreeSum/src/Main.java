import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    set.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                }
                if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>(set);
        System.out.println(result);

    }


}