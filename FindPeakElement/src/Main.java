public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1};
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 1;
        int end = n - 2;

        if (n == 1) return 0;

        if (nums[0] > nums[1]) return 0;

        if (nums[n - 1] > nums[n - 2]) return n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;

            if (nums[mid] < nums[mid - 1]) {
                end = mid - 1;
                continue;
            }

            if (nums[mid] < nums[mid + 1]) start = mid + 1;
        }

        return -1;
    }
}