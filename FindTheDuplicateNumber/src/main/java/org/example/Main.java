package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //    public static void main(String[] args) {
//
//        int[] arr = {1, 3, 4, 2, 2};
//
//
//        int slow = arr[0];
//        int fast = arr[0];
//
//        do {
//            slow = arr[slow];
//            fast = arr[arr[fast]];
//        } while (slow != fast);
//
//        slow = arr[0];
//        while (slow != fast) {
//            slow = arr[slow];
//            fast = arr[fast];
//        }
//
//        System.out.println(slow);
//    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                result.add(Math.abs(nums[i]));
                continue;
            }
            nums[Math.abs(nums[i]) - 1] = Math.negateExact(nums[Math.abs(nums[i]) - 1]);
        }

        System.out.println(result);
    }
}