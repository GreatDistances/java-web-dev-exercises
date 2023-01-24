package RestaurantMenu;

import java.awt.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MenuItem extends Menu {

    // INSTANCE VARIABLES
    private String category;  // appetizer, main course, dessert
    private String itemName;
    private String itemDescription;
    private Double itemPrice;
    private LocalDate dateAdded;
    final static LocalDate today = LocalDate.now(); // final variable to establish today's date
    private Boolean isNew;

    // Constructor for items added today
    public MenuItem(String category, String itemName, String itemDescription, Double itemPrice) {
        this.category = category;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.dateAdded = today; // inserts today's date
        this.isNew = true; // if item is added today, item is new
    }

    // Constructor for previous date-added items
    public MenuItem(String category, String itemName, String itemDescription, Double itemPrice, LocalDate dateAdded) {
        this.category = category;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.dateAdded = dateAdded; // allows user input of date
        this.isNew = isNew(dateAdded);
    }

    public MenuItem(String restaurantName, LocalDate menuDate, String category, String itemName, String itemDescription, Double itemPrice, LocalDate dateAdded) {
        super(restaurantName, menuDate);
        this.category = category;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.dateAdded = dateAdded;
    }

    // GETTERS AND SETTERS
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public Double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public LocalDate getDateAdded() {
        return dateAdded;
    }
    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    // isNew method
    public Boolean isNew(LocalDate dateAdded) {
        if ((today.minusDays(60)).isBefore(dateAdded)) {
            return true;
        }
        return false;
    }

    // inputMenuItem method
    public static MenuItem inputMenuItem() { // MW should this be static ???
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an item category (main, appetizer, dessert): ");
        String newCategory = s.nextLine();
        System.out.println("Enter an item name: ");
        // MW - need to add a way to check if item name already exists in menu
        String newItemName = s.nextLine();
        System.out.println("Enter an item description: ");
        String newItemDescription = s.nextLine();
        System.out.println("Enter an item price: ");
        while (!s.hasNextDouble()) { // validate entry of numbers only
            System.out.println("Invalid input - please try again and input numbers only: ");
            s.next();
        }
        Double newItemPrice = s.nextDouble();
        System.out.println("Is this menu item new today? (enter N to manually enter date, or any other key to continue): ");
        String newToday = s.next();
        if (newToday.equals("n") || newToday.equals("N")) {
            System.out.println("Enter the date this menu item was added, in format YYYY-MM-DD: ");
            // MW - need validation of date format entry here, program will crash with bad input presently
            // MW - need validation that entered date is not in future
            LocalDate newDateAdded = LocalDate.parse(s.next());
            MenuItem newMenuItem = new MenuItem(newCategory, newItemName, newItemDescription, newItemPrice, newDateAdded);
            newMenuItem.printMenuItem();
            System.out.println("*** Thank you, the above item has been added to the menu. *** \n");
            return newMenuItem;
        }
        MenuItem newMenuItem = new MenuItem(newCategory, newItemName, newItemDescription, newItemPrice);
        newMenuItem.printMenuItem();
        System.out.println("*** Thank you, the above item has been added to the menu. Updated menu list below. *** \n");
        return newMenuItem;

    }

    // PRINT MENU ITEM (works)
    public String printMenuItem() {
        if (isNew) {
            //System.out.print("" + category.toUpperCase() + "\n" + itemName + "\n" + itemDescription + "\n" + "$" + itemPrice + "\n" + "*NEW ITEM!*" + "\n\n");
            return("" + category.toUpperCase() + " -- " + itemName + " -- " + itemDescription + "\n" + "$" + itemPrice + "\n" + "* NEW ITEM! *" + "\n");
        }
        //System.out.print("" + category.toUpperCase() + "\n" + itemName + "\n" + itemDescription + "\n" + "$" + itemPrice + "\n");
        return("" + category.toUpperCase() + " -- " + itemName + " -- " + itemDescription + "\n" + "$" + itemPrice + "\n");
    }

    @Override
    public String toString() {
        return printMenuItem();
        //return "" + category.toUpperCase() + " -- " + itemName + " -- " + itemDescription + "\n" + "$" + itemPrice + "\n" + isNew(dateAdded);
        /*
        return "MenuItem{" +
                "category='" + category + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemPrice=" + itemPrice +
                ", dateAdded=" + dateAdded +
                ", isNew=" + isNew +
                "} " + super.toString();
         */
    }
}
