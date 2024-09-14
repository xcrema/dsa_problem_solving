import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[][] board = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        int totalRows = board.length;
        int totalColumn = board[0].length;

        List<List<Integer>> coordinates = new ArrayList<>();

        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalColumn; col++) {
                int countOne = 0;
                if (row - 1 >= 0) {
                    if (board[row - 1][col] == 1) {
                        countOne++;
                    }
                    if (col - 1 >= 0) {
                        if (board[row - 1][col - 1] == 1) {
                            countOne++;
                        }
                    }
                    if (col + 1 < totalColumn) {
                        if (board[row - 1][col + 1] == 1) {
                            countOne++;
                        }
                    }
                }
                if (col - 1 >= 0) {
                    if (board[row][col - 1] == 1) {
                        countOne++;
                    }
                }
                if (col + 1 < totalColumn) {
                    if (board[row][col + 1] == 1) {
                        countOne++;
                    }
                }
                if (row + 1 < totalRows) {
                    if (board[row + 1][col] == 1) {
                        countOne++;
                    }
                    if (col - 1 >= 0) {
                        if (board[row + 1][col - 1] == 1) {
                            countOne++;
                        }
                    }
                    if (col + 1 < totalColumn) {
                        if (board[row + 1][col + 1] == 1) {
                            countOne++;
                        }
                    }
                }
                if ((countOne < 2 && board[row][col] == 1)  || (countOne > 3 && board[row][col] == 1) || (countOne == 3 && board[row][col] == 0)) {
                    coordinates.add(Arrays.asList(row, col));
                }
            }
        }

        for (List<Integer> coord : coordinates) {
            board[coord.get(0)][coord.get(1)] = board[coord.get(0)][coord.get(1)] == 1 ? 0 : 1;
        }

    }
}
