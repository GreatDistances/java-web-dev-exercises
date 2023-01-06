package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double radius = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a positive number to represent the radius of your circle: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid entry, try again: ");
                scanner.next();
            }
            radius = scanner.nextDouble();
        } while (radius < 0);
        Circle.getArea(radius);
        scanner.close();
    }
}
