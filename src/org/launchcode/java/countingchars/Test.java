package org.launchcode.java.countingchars;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        String str = "this is a test String";
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.merge(c,          // key = char
                    1,                  // value to merge
                    Integer::sum);      // counting
        }
        System.out.println("Char Counts:\n" + charCount);

        for (char key : charCount.keySet()) {
            System.out.println(key + ": " + charCount.get(key));
        }
    }
}
