public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 2, 3, 4, -1};

        int result = Integer.MIN_VALUE;

        int temp = 1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                temp = 1;
                continue;
            }
            temp *= arr[i];
            if (result < temp) {
                result  = temp;
            }
        }

        temp = 1;
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] == 0) {
                temp = 1;
                continue;
            }
            temp *= arr[i];
            if (result < temp) {
                result  = temp;
            }
        }

        System.out.println(result);
    }
}