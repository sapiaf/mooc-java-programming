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
        return facility.get(storageUnit) != null ? facility.get(storageUnit) : new ArrayList<>();
    }


    public void remove(String storageUnit, String item) {
        ArrayList<String> items = facility.get(storageUnit);
        if (items != null) {
            items.remove(item);
            if (items.isEmpty()) {
                facility.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>(facility.keySet());
        return list;
    }
}
