package com.company;

/**
 * Created by Violetta on 10.09.2018.
 */

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {

        TreeMap<String, Integer> map = new TreeMap<>();
        int max = 0;

        Scanner scanner = new Scanner(new File("input.txt"));
        while (scanner.hasNext()) {
            String nextWord = scanner.next().toLowerCase();
            Integer oldCount = map.get(nextWord);
            if (oldCount == null) {
                oldCount = 0;
            }
            if (max < oldCount + 1) {
                max = oldCount + 1;
            }
                map.put(nextWord, oldCount +1);
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }


}
