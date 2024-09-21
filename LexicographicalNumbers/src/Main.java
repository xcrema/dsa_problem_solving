import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n=13;
        System.out.println(lexicalOrder(n));
    }

    private static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i=1; i<10; i++) {
            dfs(i, n, result);
        }

        return result;
    }

    private static void dfs(int curr, int n, List<Integer> result) {

        if (curr>n) {
            return;
        }
        result.add(curr);
        for (int i=0; i<10; i++) {
            if (curr*10 + i > n) {
                return;
            }
            dfs(curr*10+i, n, result);
        }
    }
}