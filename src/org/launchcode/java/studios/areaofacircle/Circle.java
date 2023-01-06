package org.launchcode.java.studios.areaofacircle;

public class Circle {

    public static double getArea(double radius) {
        double area;

        if (radius < 0) {
            System.out.println("Invalid entry.");
            area = -1;
        } else {
            area = Math.PI * Math.pow(radius, 2);
            System.out.printf("The area of the circle with radius: " + radius + " is " + area);
        }
        return area;
    }
}
