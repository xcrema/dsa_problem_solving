package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] transactions = {"alice,20,800,mtv", "alice,50,100,beijing"};

        List<String> result = new ArrayList<>();
        Map<String, List<String>> nameCityMap = new HashMap<>();

        for (int i = 0; i < transactions.length; i++) {
            String[] trans = transactions[i].split(",");
            if (Integer.parseInt(trans[2]) > 1000) {
                result.add(transactions[i]);
                continue;
            }

        }

    }
}