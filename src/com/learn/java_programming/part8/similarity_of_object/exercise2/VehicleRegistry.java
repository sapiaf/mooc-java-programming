package com.learn.java_programming.part8.similarity_of_object.exercise2;

import java.util.HashMap;

public class VehicleRegistry {
    HashMap<LicensePlate, String> licensePlates;

    public VehicleRegistry() {
        this.licensePlates = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (licensePlates.get(licensePlate) == null) {
            licensePlates.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return licensePlates.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (licensePlates.get(licensePlate) != null) {
            licensePlates.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : licensePlates.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        for (String owner : licensePlates.values()) {
            System.out.println(owner);
        }
    }
}
