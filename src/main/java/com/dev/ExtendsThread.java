package com.dev;

import org.apache.log4j.Logger;

public class ExtendsThread extends Thread {
    private final Counter counter;
    private final Logger logger = Logger.getLogger(ExtendsThread.class);

    public ExtendsThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() != counter.getCountTo()) {
            counter.incrementCounter();
            logger.info("ExtendsThread : " + counter.getCounter());
        }
    }
}
