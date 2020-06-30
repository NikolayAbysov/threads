package com.dev;

import org.apache.log4j.Logger;

public class ImplementsRunnable implements Runnable {
    private final Counter counter;
    private final Logger logger = Logger.getLogger(ExtendsThread.class);

    public ImplementsRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCounter() != counter.getCountTo()) {
            counter.incrementCounter();
            logger.info("ImplementsRunnable : " + counter.getCounter());
        }
    }
}
