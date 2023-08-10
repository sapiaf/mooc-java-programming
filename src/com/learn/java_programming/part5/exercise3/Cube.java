package com.learn.java_programming.part5.exercise3;

public class Cube {
    private final int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }

    public int getEdgeLength() {
        return edgeLength;
    }

    public String toString() {
        return "The length of the edge is " + getEdgeLength() + " and the volume " + volume();
    }
}
