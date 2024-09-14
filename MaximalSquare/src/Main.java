import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        char[][] matrix = {
//                {'1', '0', '1', '0', '0'},
//                {'1', '0', '1', '1', '1'},
//                {'1', '1', '1', '1', '1'},
//                {'1', '0', '0', '1', '0'}
//        };

        char[][] matrix = {
                {'0', '1'},
                {'0', '0'}
        };

        int max = 0;

        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                if (matrix[i][j] == '1') {
                    dp[i + 1][j + 1] =
                            Math.min(dp[i][j], Math.min(dp[i + 1][j], dp[i][j + 1])) + 1;

                    max = Math.max(max, dp[i + 1][j + 1]);
                }

            }
        }

        System.out.println(max * max);
    }


}