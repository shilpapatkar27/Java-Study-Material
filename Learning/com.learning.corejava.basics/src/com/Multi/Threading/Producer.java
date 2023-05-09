package com.Multi.Threading;

import java.security.SecureRandom;

public class Producer implements Runnable {
	
    private static final SecureRandom generator= new SecureRandom();
    private final Buffer sharedBufferLocation; // reference to shared object
   
    public Producer(Buffer sharedLocation) {
        this.sharedBufferLocation = sharedLocation;
    }
   
    // Store values from 1 to 10 in sharedLocation
    @Override
    public void run() {
        int sum=0;
        for(int count=1;count<=10;count++) {
            try {
                Thread.sleep(generator.nextInt(3000));// Random sleep
                sharedBufferLocation.blockingPut(count); // Set value in buffer
                sum += count;
                //System.out.printf("\t%2d%n",sum);
            }catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("Producer done producing%nTerminating producer%n");

    }
}