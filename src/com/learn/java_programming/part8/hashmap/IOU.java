package com.learn.java_programming.part8.hashmap;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> list;

    public IOU() {
        this.list = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        list.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom) {
        return list.get(toWhom);
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
