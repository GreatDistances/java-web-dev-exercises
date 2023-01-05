package org.launchcode.java.demos.lsn6inheritance.technology;

public abstract class AbstractEntity {

    static int idNumber = 1000;

    public AbstractEntity() {
    }

    public AbstractEntity(int idNumber) {
        this.idNumber = getIdNumber();
    }

    public static int newIdNumber() {
        idNumber++;
        return idNumber;
    }

    public static int getIdNumber() {
        return idNumber;
    }
}
