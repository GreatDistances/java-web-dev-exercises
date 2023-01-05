package org.launchcode.java.demos.lsn6inheritance.technology;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmartPhoneTest {

    @Test
    public void ring() {
        SmartPhone testPhone = new SmartPhone("test phone", 32, 1.1, "Kyocera", 23);
        assertEquals(testPhone.ring(), "Other");
    }
}