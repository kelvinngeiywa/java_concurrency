package com.kelvin.threads;

//Implements runnable interface
public class MyRunnable implements Runnable{
    @Override
    public void run(){ //defines task in the run() method
        for(int i=1;i <=5 ;i++){
            System.out.println(Thread.currentThread().getName()+ " printing-- "+i);

            try {
                Thread.sleep(100); //simulate task with a delay
//                System.out.println("***************");

            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: "+ e.getMessage());
            }
        }

    }
}
