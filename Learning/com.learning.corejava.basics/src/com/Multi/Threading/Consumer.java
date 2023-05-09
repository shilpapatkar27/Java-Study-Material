package com.Multi.Threading;

import java.security.SecureRandom;

public class Consumer implements Runnable {
	
    private static final SecureRandom generator= new SecureRandom();
    private final Buffer sharedBufferLocation; // reference to shared object
   
    public Consumer(Buffer sharedLocation) {
        this.sharedBufferLocation = sharedLocation;
    }
   
    // Store values from 1 to 10 in sharedLocation
    @Override
    public void run() {
        int sum=0;
        for(int count=1;count<=10;count++) {
            try {
                // sleep 0 to 3 sec, read value from buffer and add to the sum
                Thread.sleep(generator.nextInt(3000));// Random sleep
                sum += sharedBufferLocation.blockingGet(); // Set value in buffer                
                //System.out.printf("\t\t\t%2d%n",sum);
            }catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("%n%s %d%n%s%n",
                "Consumer read values total=",sum,"Terminating consumer");

    }
}
