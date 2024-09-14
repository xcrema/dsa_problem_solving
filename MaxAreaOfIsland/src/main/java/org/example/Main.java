package org.example;

import java.util.*;

public class Main {

//    public static void main(String[] args) {
//        String s = "1101001100";
//        System.out.println(helper(s));
//    }
//    public static String helper(String s) {
//        if (s.isEmpty()) {
//            return s;
//        }
//        List<String> ans = new ArrayList<>();
//        int count = 0;
//        for (int i = 0, j = 0; i < s.length(); ++i) {
//            count += s.charAt(i) == '1' ? 1 : -1;
//            if (count == 0) {
//                String t = "1" + helper(s.substring(j + 1, i)) + "0";
//                ans.add(t);
//                j = i + 1;
//            }
//        }
//        ans.sort(Comparator.reverseOrder());
//        return String.join("", ans);
//    }

//    public static void main(String[] args) {
//        List<Integer> weights = new ArrayList<>(Arrays.asList(2,3,4,5));
//        Collections.sort(weights);
//
//        for (int i = weights.size() - 1; i > 0; i--) {
//            int wt1 = weights.remove(i);
//            int wt2 = weights.remove(i - 1);
//
//            if (wt1<wt2) {
//                weights.
//            }
//            if (wt1 == wt2) {
//                i--;
//                continue;
//            }
//            weights.add(Math.abs(wt1 - wt2));
//            Collections.sort(weights);
//        }
//
//
//        int result = 0;
//        if (!weights.isEmpty()) {
//            result = weights.getFirst();
//        }
//
//        System.out.println(result);
//
//    }

    public static void main(String[] args) {

        int[][] grid = {{0, 1}, {1, 1}};

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result = Math.max(helper(grid, i, j), result);
            }
        }

        System.out.println(result);
    }

    public static int helper(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) return 0;

        grid[row][col] = 0;
        return 1 + helper(grid, row - 1, col) + helper(grid, row, col + 1) + helper(grid, row + 1, col) + helper(grid, row, col - 1);
    }
}