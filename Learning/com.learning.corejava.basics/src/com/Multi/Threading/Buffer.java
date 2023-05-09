package com.Multi.Threading;

//Thread blocking queue
// Buffer interface specifies methods called by producer and consumer

public interface Buffer {
	
    //place int value to buffer
    public void blockingPut(int value) throws InterruptedException;
   
    // Return end value from buffer
    public int blockingGet() throws InterruptedException;
}