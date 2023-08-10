package com.learn.java_programming.part5.exercise1;

public class Timer {
    private ClockHand seconds;
    private ClockHand hSeconds;
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hSeconds = new ClockHand(100);
    }
    public void advance() {
        this.hSeconds.advance();
        if (this.hSeconds.getValue() == 0) {
            this.seconds.advance();
        }

    }
    public String toString() {
        return seconds + ":" + hSeconds;
    }

}
