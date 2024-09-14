public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = arr.length - 1;

        int max = Integer.MIN_VALUE;

        while(left < right) {
            int area = (right - left) * Math.min(arr[left], arr[right]);
            if (area > max) {
                max = area;
            }
            if (arr[left] < arr[right]) {
                left++;
            } else if(arr[right] < arr[left]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        System.out.println(max);
    }
}