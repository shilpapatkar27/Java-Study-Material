package com.Multi.Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {

    public static void main(String[] args) {
        // Integer array will have 6 element.
        SimpleArray sharedSimpleArray = new SimpleArray(6);
       
        // Create two task to write to the shared SimpleArray
        // First writer will start writing from 1 and second with 11
        ArrayWriter writer1= new ArrayWriter(1, sharedSimpleArray);
        ArrayWriter writer2= new ArrayWriter(11, sharedSimpleArray);
       
        //execute the task with an ExecutorService
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(writer1);
        executorService.execute(writer2);
       
        executorService.shutdown();
       
        try {
            // wait the termination of task to finish
            boolean taskend = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if(taskend) {
                System.out.printf("%n Content of SimpleArray:%n");
                System.out.println(sharedSimpleArray);
            }
            else
                System.out.println("Timed out while waiting of the task finished.");
           
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}