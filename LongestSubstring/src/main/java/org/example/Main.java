package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "avaf";
        int result = 0;
        String[] arr = s.split("");

        Map<String, Integer> map = new HashMap<>();

        for (int right = 0, left = 0; right < arr.length; right++) {
            if (map.containsKey(arr[right])) {
                left = Math.max(left, map.get(arr[right]) + 1);
            }
            map.put(arr[right], right);
            result = Math.max(right - left + 1, result);
        }
        System.out.println(result);
    }
}