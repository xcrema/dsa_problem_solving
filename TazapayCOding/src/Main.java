import java.util.Arrays;
import java.util.Scanner;

public class Main {

//     1 2 4 3 1
//     5 7 9 8 6
//     10 12 18 13 11
    public static void main(String[] args) {

        int noOfRows = 3;
        int[] heights = {1, 1, 2, 4, 5, 7, 8, 11, 12, 6, 13, 18, 10, 3, 9};

        int maxPeopleInARow = (int) Math.ceil(heights.length/3);
        int minPeopleInARow = (int) Math.floor(heights.length/3);

        Arrays.sort(heights);

        int[][] arrangement = new int[3][maxPeopleInARow];
        int pos = 0;

        for (int i=0; i < 3; i++) {
            for (int j=0; ; j++) {
                if (i!=2) {
                    if (j >= minPeopleInARow) {
                        break;
                    }
                } else {
                    if (j >= maxPeopleInARow) {
                        break;
                    }
                }
                arrangement[i][j] = heights[pos++];
            }
        }

        for(int i=0; i<3; i++) {

            int rowLength = i==2 ? maxPeopleInARow : minPeopleInARow;

            int left = rowLength/2;
            int right = rowLength-1;


            while(left<right) {
                int temp = arrangement[i][left];
                arrangement[i][left++] = arrangement[i][right];
                arrangement[i][right--] = temp;
            }
        }

        for (int i=0; i < 3; i++) {
            for (int j=0; ; j++) {
                if (i!=2) {
                    if (j >= minPeopleInARow) {
                        break;
                    }
                } else {
                    if (j >= maxPeopleInARow) {
                        break;
                    }
                }
                System.out.print(arrangement[i][j] + " ");
            }
            System.out.println("");
        }
    }
}