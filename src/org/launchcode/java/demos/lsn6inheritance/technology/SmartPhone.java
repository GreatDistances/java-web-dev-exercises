package org.launchcode.java.demos.lsn6inheritance.technology;

import java.util.UUID;

public class SmartPhone extends Computer {

    private String brand;
    private int modelNumber;

    // CONSTRUCTOR
    public SmartPhone(String name, int memory, double weight, String brand, int modelNumber) {
        super(name, memory, weight);
        this.brand = brand;
        this.modelNumber = modelNumber;
    }

    // INSTANCE METHODS
    public String ring() {
        if (brand.equals("Apple")) {
            System.out.println("Marimba ringtone");
            return "Apple";
        } else {
            System.out.println("Chimes");
            return "Other";
        }
    }

    // TO STRING
    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", modelNumber=" + modelNumber +
                "} " + super.toString();
    }

    // GETTERS AND SETTERS
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getModelNumber() {
        return modelNumber;
    }
    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

}
