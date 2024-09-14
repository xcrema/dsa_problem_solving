public class Main {
    public static void main(String[] args) {

        char[][] board = {{'A','B'},{'A','B'}};
        String word = "SEER";

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (helper(board, word, 0, i, j, new String[board.length][board[0].length])) {
                    System.out.println(true);
                }
            }
        }
         System.out.println(false);
    }

    public static boolean helper(char[][] board, String wordArr, int elemIndexToSearch, int row, int col, String[][] visitedLocations) {
        int boardMaxRow = board.length - 1;
        int boardMaxColumn = board[0].length - 1;

        if (elemIndexToSearch >= wordArr.length()) {
            return true;
        }

        if (row < 0 || row > boardMaxRow || col < 0 || col > boardMaxColumn  ||
                board[row][col] != wordArr.charAt(elemIndexToSearch)) {
            return false;
        }

        if (visitedLocations[row][col] != null &&  visitedLocations[row][col].equals("#")) {
            return false;
        }

        visitedLocations[row][col] = "#";

        boolean o1 = helper(board, wordArr, elemIndexToSearch + 1, row - 1, col, visitedLocations);

        boolean o2 = helper(board, wordArr, elemIndexToSearch + 1, row + 1, col, visitedLocations);

        boolean o3 = helper(board, wordArr, elemIndexToSearch + 1, row, col - 1, visitedLocations);

        boolean o4 = helper(board, wordArr, elemIndexToSearch + 1, row, col + 1, visitedLocations);

        visitedLocations[row][col] = "";

        return o1 || o2 || o3 || o4;
    }
}