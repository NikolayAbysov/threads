package com.dev;

public class Counter {
    private int counter;
    private int countTo;

    Counter(int counter, int countTo) {
        this.counter = counter;
        this.countTo = countTo;
    }

    void incrementCounter() {
        counter++;
    }

    int getCounter() {
        return counter;
    }

    int getCountTo() {
        return countTo;
    }
}
