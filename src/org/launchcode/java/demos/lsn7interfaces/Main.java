package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getTopping();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // Comparator comparator = new FlavorComparator(); // this works, but below can be combined into single statement in next to-do

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        flavors.sort(new FlavorComparator()); // single line of code replaces use of above to-do

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        //System.out.println("--Flavor sort, A-Z--");
        System.out.println("--Flavor sort, allergen count, low to high--");
        for (Object flavor : flavors) {
            System.out.println(flavor);
        }

        cones.sort(new ConeComparator());

        System.out.println("--Cone price sort, low to high--");
        for (Object cone : cones) {
            System.out.println(cone);
        }

        // BONUS
        toppings.sort(new ToppingComparator());

        System.out.println("--Topping sort, A-Z--");
        for (Object topping : toppings) {
            System.out.println(topping);
        }

    }
}
