package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?:");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas have been consumed?:");
        double gallons = input.nextDouble();
        double mpg = miles / gallons;
        System.out.println("Your current miles-per-gallon is:" + mpg);
        input.close();
    }
}
