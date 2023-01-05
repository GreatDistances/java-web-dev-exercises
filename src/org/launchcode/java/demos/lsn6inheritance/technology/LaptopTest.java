package org.launchcode.java.demos.lsn6inheritance.technology;

import org.junit.Test;

import static org.junit.Assert.*;

public class LaptopTest {

    @Test
    public void saveToDisk(){
        Laptop laptop = new Laptop("Chromebook",256, 3.0, "Google", 2020);
        assertEquals(laptop.saveToDisk(257), -1, .001);
        assertEquals(laptop.saveToDisk(255), 1);
    }


}