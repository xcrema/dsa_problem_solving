package org.example;

public class Main {
    public static void main(String[] args) {
        String text1 = "shmtulqrypy";
        String test2 = "oxcpqrsvwf";

        String[] text1Array = text1.split("");
        String[] test2Array = test2.split("");

        int i = 0, j = 0;
        int result = 0;

        while (i < text1Array.length) {
            int temp = j;
            while (temp < test2Array.length) {
                if (test2Array[temp].equals(text1Array[i])) {
                    result++;
                    j = temp + 1;
                    i++;
                    break;
                }
                temp++
            }
            i++;
        }

        System.out.println(result);
    }
}