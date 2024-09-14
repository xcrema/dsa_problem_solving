import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        Arrays.sort(arr);

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {

                    long sum = (long)arr[i] + (long)arr[j] + (long)arr[k] + (long)arr[l];


                    if (sum == target) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                        continue;
                    }
                    if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        System.out.println(new ArrayList<>(result));
    }
}