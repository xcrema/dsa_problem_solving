package org.example;

public class Main {
    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 1, 4};

        int ans = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, nums[i] + i);
            if (i == end) {
                ans++;
                end = farthest;
            }
        }

        System.out.println(ans);
    }
}