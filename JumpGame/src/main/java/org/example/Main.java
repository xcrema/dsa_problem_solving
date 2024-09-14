package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};

        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i>end) {
                System.out.println(false);
                return;
            }
            end = Math.max(end, arr[i]+i);
        }
        System.out.println(true);
    }
}