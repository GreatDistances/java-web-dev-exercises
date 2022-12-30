package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student mattWicks = new Student("Matt Wicks", 1234, 1, 4.0);

        System.out.println(mattWicks);

    }
}

//    What access modifier restricts access the most for what we need?
//    A:  question poorly worded, what is "for what we need" supposed to refer to?

//    If it is a field, could we restrict the access to private and use getters and setters? -
//    A:  yes.

//    If we do set fields to private, what access level do we have to give our getters and setters?
//    A:  public.