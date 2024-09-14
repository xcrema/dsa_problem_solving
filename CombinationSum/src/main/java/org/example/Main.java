package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        HashSet<List<Integer>> result = new HashSet<>();
        helper(candidates, 0, 0, new ArrayList<>(), result, target);
        System.out.println(result);
    }


    public static void helper(int[] candidate, int i, int currentSum, List<Integer> currCombination, HashSet<List<Integer>> result, int target) {
        if(currentSum == target) {
            result.add(currCombination);
            return;
        }

        if (i >= candidate.length || currentSum > target) {
            return;
        }

        List<Integer> tempCurrentComb = new ArrayList<>(currCombination);
        tempCurrentComb.add(candidate[i]);
        helper(candidate, i, currentSum+candidate[i], tempCurrentComb, result, target);

        helper(candidate, i+1, currentSum, currCombination, result, target);
    }
}