import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 3, 3, 4};

        Arrays.sort(nums);

        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);

        System.out.println(helper(nums, 0, dp));
    }

    public static int helper(int[] nums, int i, int[] dp) {

        if (i >= nums.length) return 0;

        if (dp[i] != -1) return dp[i];

        int currNum = nums[i];
        int currSum = currNum;
        int index = i + 1;
        while (index < nums.length && nums[index] == currNum) {
            currSum += nums[index++];
        }

        while (index < nums.length && nums[index] == currNum + 1) {
            index++;
        }

        dp[i] = Math.max(currSum + helper(nums, index, dp), helper(nums, i + 1, dp));
        return dp[i];
    }

}