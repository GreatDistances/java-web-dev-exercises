package org.launchcode.java.countingchars;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Character, Integer> charsHashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myString = scanner.nextLine().toLowerCase();
        // String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charsInString = myString.toCharArray();

        for (int i = 0; i < charsInString.length; i++) {
            charsHashMap.put(charsInString[i], 0);
        }
        //System.out.println(charsHashMap);
        //System.out.println(charsHashMap.size());
        //System.out.println(charsHashMap.keySet());

        for (int j = 0; j < charsInString.length; j++) {
            for (char key : charsHashMap.keySet()) {
                if (charsInString[j] == key) {
                    int thisValue = charsHashMap.get(key);
                    charsHashMap.put(key, thisValue+1);
                    //charsHashMap.merge(key, 1, Integer::sum);
                }
            }
        }
        
        for (char key : charsHashMap.keySet()) {
            System.out.println(key + ": " + charsHashMap.get(key));
        }
    }
}