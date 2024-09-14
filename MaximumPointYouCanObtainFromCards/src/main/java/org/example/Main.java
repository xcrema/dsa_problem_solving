package org.example;

import java.util.Arrays;

public class Main {
//    public static void main(String[] args) {
//
//        int[] cardPoints = {2, 2, 2};
//        int k = 2;
//
//        int total = 0;
//        for (int i=0; i<k; i++) total+=cardPoints[i];
//
//        int best = total;
//
//        for (int i=k-1, j = cardPoints.length-1; i>=0; i--, j--) {
//            total += cardPoints[j] - cardPoints[i];
//            best = Math.max(best, total);
//        }
//
//        System.out.println(best);
//    }
//
//    public static void main(String[] args) {
//        int memory1 = 4;
//        int memory2 = 4;
//
//        int time = 0;
//
//        while (memory1 >= 0 && memory2 >= 0) {
//            time++;
//            if (memory1 < memory2) {
//                memory2 -= time;
//            } else {
//                memory1 -= time;
//            }
//        }
//
//        if (memory1 < 0) memory1 += time;
//        if (memory2 < 0) memory2 += time;
//
//
//        System.out.printf("%s %s %s", time, memory1, memory2);
//    }

//    public static void main(String[] args) {
//        int n = 4;
//        int[] shop = {1, 1, 0, 0};
//
//        int shopping = 0;
//        int tempResult = 0;
//
//        boolean shoppingStarted  = false;
//
//        for (int i=0; i<n; i++) {
//            if (!shoppingStarted && shop[i] == 1) {
//                shoppingStarted = true;
//            }
//            if (shoppingStarted && shop[i] == -1) {
//                shoppingStarted = false;
//                if (shopping < tempResult) {
//                    shopping = tempResult;
//                    tempResult = 0;
//                }
//            }
//
//            if (shoppingStarted && shop[i] == 0) {
//                tempResult++;
//            }
//        }
//
//        if (tempResult != 0 && shopping < tempResult) shopping = tempResult;
//
//        System.out.println(shopping);
//    }

    public static void main(String[] args) {
        int[] hc = {2};
        int[] vc = {2};
        int h = 1000000000;
        int w = 1000000000;

        Arrays.sort(hc);
        Arrays.sort(vc);

        long hMax = hc[0];
        long vMax = vc[0];

        for (int i = 1; i < hc.length; i++) {
            hMax = Math.max(hc[i] - hc[i - 1], hMax);
        }

        hMax = Math.max(h - hc[hc.length - 1], hMax);

        for (int i = 1; i < vc.length; i++) {
            vMax = Math.max(vc[i] - vc[i - 1], vMax);
        }

        vMax = Math.max(w - vc[vc.length - 1], vMax);

        System.out.println((hMax * vMax) % 1000000007);
    }
}