package com.learn.java_programming.part8.grouping_data;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        facility.putIfAbsent(unit, new ArrayList<>());
        facility.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> contents = facility.get(storageUnit);
        if (contents == null) {
            return new ArrayList<>();
        }
        return contents;
    }


    public void remove(String storageUnit, String item) {
        ArrayList<String> contents = facility.get(storageUnit);
        if (contents != null) {
            contents.remove(item);

            if (contents.isEmpty()) {
                facility.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> nonEmptyUnits = new ArrayList<>();
        for (String unit : facility.keySet()) {
            if (!facility.get(unit).isEmpty()) {
                nonEmptyUnits.add(unit);
            }
        }
        return nonEmptyUnits;
    }
}
