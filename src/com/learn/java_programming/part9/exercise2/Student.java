package com.learn.java_programming.part9.exercise2;

public class Student extends Person{
    private int credit;
    public Student(String name, String address) {
        super(name, address);
        this.credit = 0;
    }
    public void study() {
        credit++;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t" + "Study credits " + credit;
    }
}
