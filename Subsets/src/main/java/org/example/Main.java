package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println(helper(nums, 0));
    }

    public static List<List<Integer>> helper(int[] nums, int i) {

        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            return new ArrayList<>(){{add(temp);}};
        }

        List<List<Integer>> result = new ArrayList<>();

        List<List<Integer>> prevResult = helper(nums, i+1);
        for(List<Integer> subset : prevResult) {
            result.add(new ArrayList<>(subset));
            subset.add(nums[i]);
            result.add(new ArrayList<>(subset));
        }

        return result;
    }
}