public class Main {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) {
                int ij = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = ij;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length-1-i];
                mat[i][mat.length-1-i] = temp;
            }
        }
    }
}