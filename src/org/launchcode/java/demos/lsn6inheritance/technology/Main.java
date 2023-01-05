package org.launchcode.java.demos.lsn6inheritance.technology;

public class Main {
    public static void main(String[] args) {


        System.out.println("- - - - -");
        Computer genericComputer = new Computer();
        System.out.println(genericComputer);
        System.out.println("- - - - -");

        Laptop macbookPro16 = new Laptop("Macbook Pro 16", 1000, 5.6, "Apple", 2021);
        System.out.println(macbookPro16);
        macbookPro16.saveToDisk(1001);
        macbookPro16.saveToDisk(99);
        System.out.println("- - - - -");

        SmartPhone iPhone12Mini = new SmartPhone("iPhone 12 Mini", 128, 1, "Apple", 12);
        System.out.println(iPhone12Mini);
        iPhone12Mini.ring();
        System.out.println("- - - - -");

        SmartPhone galaxy10 = new SmartPhone("Galaxy 10", 64, 1, "Samsung", 10);
        System.out.println(galaxy10);
        galaxy10.ring();
        System.out.println("- - - - -");

        System.out.println(galaxy10.getIdNumber());
        System.out.println(genericComputer.getIdNumber());



    }
}
