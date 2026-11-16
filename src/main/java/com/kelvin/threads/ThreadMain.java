package com.kelvin.threads;

public class ThreadMain {
    static void main() {
        System.out.println("Welcome to our concurrency class!!");
        MyThread thread=new MyThread();
        MyThread thread1= new MyThread();

        //Start() method initiates the thread, invoking run() method of MyThread class in a separate execution path
        thread.start(); //start() method initiates the thread, invoking run() method in a separate  execution path
        thread1.start();

        //Output will show combined execution of thread and thread1 demonstrating concurrent behaviour
    }
}
