package com.kelvin.threads;

public class RunnableMain {
    static void main() {
        System.out.println("Concurrency by implementing runnable");
        //Create new thread object with runnable instance
        Thread thread1=new Thread(new MyRunnable());
        Thread thread2=new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

    }
}
