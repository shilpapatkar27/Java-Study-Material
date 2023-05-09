package com.Multi.Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest {

    public static void main(String[] args) throws InterruptedException {
        // Create new thread pool with two threads.
        ExecutorService executorsService= Executors.newCachedThreadPool();
       
        Buffer sharedBufferLocation=new BlockingBufferQueue();
        //System.out.printf(
            //    "Action\t\tValue\tSum of Produced\tSum of consumed%n");
        //System.out.printf(
                //"------\t\t-----\t---------------\t---------------%n%n");
       
        // Execute producer and consumer giving each the access to sharedBufferLocation
        executorsService.execute(new Producer(sharedBufferLocation));
        executorsService.execute(new Consumer(sharedBufferLocation));
       
        executorsService.shutdown();
        executorsService.awaitTermination(2, TimeUnit.MINUTES);
    }

}