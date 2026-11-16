package com.kelvin.synchronization;

public class SynchronizedMethodMain {
    static void main() throws InterruptedException {
        System.out.println("Synchronization section!!");
        SynchronizedMethodCounter counter= new SynchronizedMethodCounter();

        Runnable task=()->{
            for(int i=1;i<=1000;i++){
                counter.increment();

            }

        };
        Thread thread1=new Thread(task);
        Thread thread2=new Thread(task);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Final count: "+counter.getCount());

    }
}
