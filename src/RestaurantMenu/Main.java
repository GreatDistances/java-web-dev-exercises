package RestaurantMenu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // initialize a menu ArrayList
        ArrayList<Menu> menu1 = new ArrayList<>();

        /* // Menu items manually entered prior to Scanner input method
        MenuItem phoTai = new MenuItem("main", "Pho Tai", "delicious soup", 11.99);
        phoTai.printMenuItem();
        menu1.add(phoTai);

        MenuItem goiCuon = new MenuItem("appetizer", "Goi Cuon", "spring rolls", 7.99, LocalDate.parse("2022-11-01"));
        goiCuon.printMenuItem();
        menu1.add(goiCuon);

        MenuItem cheThai = new MenuItem("dessert", "Che Thai", "Vietnamese fruit cocktail", 9.00, LocalDate.parse("2023-01-01"));
        cheThai.printMenuItem();
        menu1.add(cheThai);
        */

        // USER INPUT CHOICES
        boolean flag = true;
        while (flag) { // infinite loop for user, until user keys in X or x
            Scanner s = new Scanner(System.in);
            System.out.println("Welcome to the menu entry system.\nWould you like to <1> add an item, <2> remove an item, or <3> print the current menu, or <X> exit the system?");
            String input = s.next();
            if (input.equals("1") || input.contains("add") || input.contains("ADD")) {
                Menu.addToMenu(menu1, MenuItem.inputMenuItem());
                Menu.printFullMenu(menu1);
            } else if (input.equals("2") || input.contains("remove") || input.contains("REMOVE")) {
                if (menu1.size() == 0) {
                    Menu.printFullMenu(menu1);
                } else {
                    Menu.printFullMenu(menu1);
                    System.out.println("Please select an item to remove by index number, starting from 1: "); // only removes by index, may need rethinking
                    int removeIndex = (s.nextInt() - 1); // only removes by index, may need rethinking
                    Menu.removeFromMenu(menu1, removeIndex); // only removes by index, may need rethinking
                }
            } else if (input.contains("3") || input.contains("print") || input.contains("PRINT")) {
                Menu.printFullMenu(menu1);
            } else if (input.equals("X") || input.equals("x") || input.contains("exit") || input.contains("EXIT")) {
                flag = false;
                System.out.println("*** EXITING MENU SYSTEM ***");
            } else {
                System.out.println("<Invalid input, please try again.>");
            }
        }
    }
}
