package RestaurantMenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private static String restaurantName = "Delicious Food Restaurant"; // MW - was forced to make this static by printFullMenu() method.  ???
    private static LocalDate menuDate = LocalDate.parse("2000-01-01"); // MW - was forced to make this static by printFullMenu() method.  ???

    // Constructor - Default
    public Menu() {
    }

    // Constructor - Full
    public Menu(String restaurantName, LocalDate menuDate) {
        this.restaurantName = restaurantName;
        this.menuDate = menuDate;
    }

    // GETTERS AND SETTERS
    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    public LocalDate getMenuDate() {
        return menuDate;
    }
    public void setMenuDate(LocalDate menuDate) {
        this.menuDate = menuDate;
    }

    // Update Menu Date
    public static void setMenuDate(ArrayList menu, LocalDate currentMenuDate) { // MW should this be static? When not static, it breaks addToMenu() and removeFromMenu()
    }

    // Add item to Menu
    public static ArrayList addToMenu(ArrayList menu, MenuItem menuItem) { // MW should this be static?

        if (menu.toString().contains(menuItem.toString())) {
            System.out.println("** DUPLICATE ITEM ENTERED, REMOVING LAST ITEM ENTERED **");
            menu.remove(menuItem);
            return menu;
        }
        menu.add(menuItem);
        if (menuItem.getDateAdded().isAfter(menuDate)) {
            menuDate = menuItem.getDateAdded();
        }
        return menu;
    }

    // Remove item from Menu
    public static ArrayList removeFromMenu(ArrayList menu, int menuItemIndex) { // MW should this be static?
        menu.remove(menuItemIndex);
        menuDate = LocalDate.now();
        return menu;
    }

    // Print full menu
    public static void printFullMenu(ArrayList menu) {
        System.out.println("Welcome to " + restaurantName.toUpperCase());
        if (menuDate.isEqual(LocalDate.parse("2000-01-01"))) {
            System.out.println("* Menu not yet instantiated *");
        } else {
            System.out.println("Menu last updated: " + menuDate);
        }
        if (menu.size() == 0) {
            System.out.println("* NO ENTRIES IN MENU *\n");
        } else {
            for (int i = 0; i < menu.size(); i++) {
                int counter = i + 1;
                System.out.print("#" + counter + ":\n");
                System.out.println((menu.get(i).toString())); // MW only prints objects
                // MenuItem.printMenuItem(menu.get(i)); // MW does not work, what am I doing wrong here ?
            }
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Menu{" +
                "restaurantName='" + restaurantName + '\'' +
                ", menuDate=" + menuDate +
                '}';
    }

}
