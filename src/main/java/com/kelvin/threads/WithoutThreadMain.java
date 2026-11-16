package com.kelvin.threads;

public class WithoutThreadMain {
    static void main() {
        System.out.println("Without thread implementation");
        WithoutThread withoutThread1= new WithoutThread();
        WithoutThread withoutThread2=new WithoutThread();

        withoutThread1.run();
        withoutThread2.run();
    }
}
