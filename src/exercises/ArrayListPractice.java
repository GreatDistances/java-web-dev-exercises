package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        // 3.7.2 ArrayList Practice
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);
        intArrayList.add(6);
        intArrayList.add(7);
        intArrayList.add(8);
        intArrayList.add(9);
        intArrayList.add(10);

        sumEven(intArrayList); // 30

        ArrayList<String> strArrayList1 = new ArrayList<>();
        strArrayList1.add("rotor");
        strArrayList1.add("piston");
        strArrayList1.add("oil filter");
        strArrayList1.add("chain");
        strArrayList1.add("handlebars");

        printFive(strArrayList1); // rotor, chain

        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        ArrayList<String> greenEggsArrayList = new ArrayList<>(Arrays.asList(greenEggs.split(" ")));

        printFive(greenEggsArrayList);

    }

    public static void sumEven(ArrayList<Integer> arrList) {
        int sum = 0;
        for (int i : arrList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void printFive(ArrayList<String> arrList) {
        for (String i : arrList) {
            if (i.length() == 5) {
                System.out.println(i);
            }
        }
    }


}
