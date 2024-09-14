package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;

        List<List<Integer>> result = new ArrayList<>();
        helper(arr, 0, result, new ArrayList<>(), 0, k);
        System.out.println(result);
    }

    public static void helper(int[] arr, int i, List<List<Integer>> result, List<Integer> currentVec, int currentVecSum, int k) {
        if (i >= arr.length) {
            return;
        }

        if (currentVecSum == k) {
            result.add(currentVec);
            i++;
            return;
        }

        List<Integer> tempCurrentVec = new ArrayList<>(currentVec);
        tempCurrentVec.add(arr[i]);
        helper(arr, i+1, result, tempCurrentVec, currentVecSum+arr[i], k);
    }
}