package com.kelvin.threads;

public class WithoutThread {
    public void run(){
        for(int i=1;i <=5 ;i++){
            System.out.println(i+" printing!!");
//            System.out.println("---------------");
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: "+ e.getMessage());
            }
        }
    }
}
