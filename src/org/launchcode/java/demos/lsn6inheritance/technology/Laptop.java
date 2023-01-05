package org.launchcode.java.demos.lsn6inheritance.technology;

import java.util.UUID;

public class Laptop extends Computer {

    private String brand;
    private int year;

    // CONSTRUCTOR
    public Laptop(String name, int memory, double weight, String brand, int year) {
        super(name, memory, weight);
        this.brand = brand;
        this.year = year;
    }

    // INSTANCE METHODS
    public int saveToDisk(int fileSize) {
        int memory = getMemory();
        if (memory - fileSize > 0) {
            System.out.println("File Saved.");
            return (memory - fileSize);
        } else {
            System.out.println("File not saved.");
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                "} " + super.toString();
    }

    // GETTERS AND SETTERS
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
