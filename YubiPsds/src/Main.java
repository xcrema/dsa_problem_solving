/*

arr = [10, 3, 6, 9, 11] n
x =  13

arr = [7, 25, 1, 7, 5]

0, 7, 32, 33, 40, 45



1 2 3 10 15

left sum arr

leftSum = [0, 10, 13, 19, 28, 39]


i = 0 i<=n
j = i+2 j<=n

 */


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 1};
        int n = arr.length;
        int x = 13;
        int[] leftSum = new int[n+1];

        for (int i=0; i<n; i++) {
            leftSum[i+1] = leftSum[i] + arr[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i=1; i<=n; i++) {
            if (leftSum[i]%x == 0) {
                System.out.println(true);
                return;
            }
            int rem = leftSum[i]%x;
            Integer val = map.get(x-rem);
            if (val != null) {
                System.out.println(true);
                return;
            }
            map.put(rem, 1);
        }
    }
}


/*
str1 = abc

str2 = bmnazidcabc

bacabc

cdemnb


 */