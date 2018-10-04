package com.company;

/**
 * Created by Violetta on 10.09.2018.
 */

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {

        TreeMap<String, Integer> map = new TreeMap<>();
        int max = 0;

        Scanner scanner = new Scanner(new File("/Users/Violetta/IdeaProjects/EqualValues/src/com/company/input.txt"));
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

        FileWriter fileWriter = new FileWriter("/Users/Violetta/IdeaProjects/EqualValues/src/com/company/output.txt");
        for (String key : map.keySet()) {
           if (map.get(key) == max) {
             fileWriter.write(key+"\n");

           }
        }

        fileWriter.flush();
    }


}
