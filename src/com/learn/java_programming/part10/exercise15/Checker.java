package com.learn.java_programming.part10.exercise15;

public class Checker {
    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean allVowels(String string) {
        if (string.matches("[aeiou]*")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean timeOfDay(String string) {
        if (string.matches("([0-2][0-3]|[10-23]):([0-5][0-9]|[10-59]):([0-5][0-9]|[10-59])$")) {
            return true;
        } else {
            return false;
        }
    }
}
