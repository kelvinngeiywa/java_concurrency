package com.kelvin.synchronization;

public class SynchronizedMethodCounter {
    private  int count=0;

    //Synchronized to ensure thread safe updates to count - if not the final count might be less than expected
    //Synchronized keyword ensures the final count will be consistent in every execution
    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return this.count;
    }
}
