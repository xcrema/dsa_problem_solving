import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };


        int rowStart = 0;
        int rowEnd = matrix.length - 1;

        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        List<Integer> result = new ArrayList<>();

        while (rowStart <= rowEnd && colStart <= colEnd) {

            //traverse right
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }

            rowStart++;

            //traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }

            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i=colEnd; i>=colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }

            rowEnd--;

            if (colStart <= colEnd) {
                for (int i=rowEnd; i>=rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }

            colStart++;

        }

        System.out.println(result);
    }
}