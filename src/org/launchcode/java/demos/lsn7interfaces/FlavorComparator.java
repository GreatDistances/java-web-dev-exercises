package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        if (o1.getAllergens().size() > o2.getAllergens().size()) {
            return 1;
        } else if (o1.getAllergens().size() < o2.getAllergens().size()) {
            return -1;
        } else {
            return 0;
        }
    }

    /*
    @Override
    public int compare(Flavor o1, Flavor o2) {
        return o1.getName().compareTo(o2.getName());
        // return 0; // return 0 is default generated code, needs to be replaced.
    }
     */


}
