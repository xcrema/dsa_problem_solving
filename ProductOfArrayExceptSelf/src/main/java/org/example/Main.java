package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int size = nums.length;
        int[] result = new int[size];
        int tempMult = 1;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                tempMult *= nums[i - 1];
            }
            result[i] = tempMult;
        }
        tempMult = 1;
        for (int i = size-1; i >= 0; i--) {
            if (i != size-1) {
                tempMult *= nums[i + 1];
            }
            result[i] = result[i] * tempMult;
        }

        System.out.println(Arrays.stream(result).boxed().collect(Collectors.toList()));
    }
}