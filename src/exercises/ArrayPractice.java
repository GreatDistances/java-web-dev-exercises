package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        // 3.7.1 Array Practice, parts 1+2
        int[] intArray = {1, 1, 2, 3, 5, 8};

        System.out.println("--Print all nubmers in array--");
        for (int i : intArray) { // print all numbers via loop
            System.out.println(i);
        }
        System.out.println("--Print array odd numbers only--");
        for (int i : intArray) { // print all numbers via loop
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }

        // 3.7.1 Array Practice, parts 3-5
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] strArray1 = greenEggs.split(" "); // split array at each space

        System.out.println(Arrays.toString(strArray1)); // check results of split, print full array

        for (String i : strArray1) { // print whitespace delineated array line by line
            System.out.println(i);
        }

        String[] strArray2 = greenEggs.split("\\. "); // split array at each space

        System.out.println(Arrays.toString(strArray2)); // check results of split, print full array

        for (String i : strArray2) { // print . delineated array line by line
            System.out.println(i);
        }

    }


}
