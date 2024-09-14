import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,1,4,6,2,7};
        int target = 8;

        Set<List<Integer>> result = new HashSet<>();

        helper(arr, target, 0, result, new ArrayList<>());

        System.out.println(result);
    }

    public static void helper(int[] arr, int target, int pos, Set<List<Integer>> result, List<Integer> currSeq) {
        if (target == 0) {
            result.add(currSeq);
            return;
        }

        if (target < 0) {
            return;
        }

        if (pos >= arr.length) {
            return;
        }

        List<Integer> tempCurrSeq = new ArrayList<>(currSeq);
        tempCurrSeq.add(arr[pos]);
        helper(arr, target-arr[pos], pos+1, result, tempCurrSeq);

        helper(arr, target, pos+1, result, currSeq);
    }
}