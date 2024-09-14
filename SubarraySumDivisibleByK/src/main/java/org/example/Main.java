package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int result = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int remainder = sum%k;
            if (remainder < 0) {
                remainder += k;
            }
            int prevOcc = map.getOrDefault(remainder, 0);
            map.put(remainder, prevOcc+1);
            result += prevOcc;
        }

        System.out.println(result);

    }
}