package com.kelvin.threads;

public class MyThread extends Thread{ //MyThread class extends Thread
    @Override   //overriding the run method

    public void run(){ // MyThread class defines task in the run() method
        for(int i=1;i <=5 ;i++){
            System.out.println(Thread.currentThread().getName()+ " printing-- "+i);

            try {
                Thread.sleep(500);
//                System.out.println("***************");

            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: "+ e.getMessage());
            }
        }
    }

}
