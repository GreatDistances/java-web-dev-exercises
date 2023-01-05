package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {

        HouseCat heathcliff = new HouseCat("Heathcliff", 5);


        System.out.println(heathcliff.purr());
        heathcliff.eat();
        System.out.println(heathcliff.isTired());
        System.out.println(heathcliff.isSatisfied());
        System.out.println(heathcliff.noise());

        HouseCat tabby = new HouseCat("Tabby");
        System.out.println(tabby.getWeight());
        System.out.println(tabby.noise());
    }
}
