import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[][] intervals =
                {
                        {4, 5},
                        {1, 4}

                };

        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));

        List<List<Integer>> result = new ArrayList<>();

        int first = -1;
        int second = -1;

        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[0];
            if (first == -1) {
                first = interval[0];
                second = interval[1];
            } else {
                if (second >= interval[0]) {
                    second = interval[1];
                } else {
                    result.add(Arrays.asList(first, second));
                    first = -1;
                    second = -1;
                    i--;
                }
            }
        }
        result.add(Arrays.asList(first, second));
        int[][] res = result.stream().map(data -> data.stream().mapToInt(d -> d).toArray()).toArray(int[][]::new);
        System.out.println(Arrays.deepToString(res));
    }
}