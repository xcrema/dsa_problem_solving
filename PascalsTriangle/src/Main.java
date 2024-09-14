import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(generate(n));
    }

    public static List<List<Integer>> generate(int n) {
        if (n <= 1) {
            return List.of(List.of(1));
        }

        List<List<Integer>> prevResult = generate(n - 1);

        List<List<Integer>> currResult = new ArrayList<>(prevResult);

        List<Integer> prevRow = prevResult.get(n - 2);
        List<Integer> currRow = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                currRow.add(1);
                continue;
            }
            currRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }
        currResult.add(currRow);
        return currResult;
    }
}