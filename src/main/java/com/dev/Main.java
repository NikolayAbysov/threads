package com.dev;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0, 100);
        ExtendsThread extendsThread = new ExtendsThread(counter);
        ImplementsRunnable implementsRunnable = new ImplementsRunnable(counter);
        Thread implementsRunnableThread = new Thread(implementsRunnable);
        extendsThread.start();
        implementsRunnableThread.start();
    }
}
