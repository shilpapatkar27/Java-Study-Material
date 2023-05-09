package com.Multi.Threading;

/*Example to demonstrate how unsynchronized method is not thread
safe.
Example will create a two thread that will write the integer data
to shared array. One thread will try to write 1,2,3(start with 1) and second
will try to write 11,12,13(Thread initialize to start at 11). Eventually one
may override other’s data.
*/

import java.security.SecureRandom;
import java.util.Arrays;

// class that will write the data into an array.

public class SimpleArray {
	
    private final static SecureRandom sRandom= new SecureRandom();
    private int arr[]; //shared array
    private int writeInx = 0; //shared index for next int to writeInx
   
    public SimpleArray(int size){
        arr = new int[size];
    }
   
    public void add(int value){
        int position= writeInx;
       
        try {
            Thread.sleep(sRandom.nextInt(500));    
        }
        // This is checked exception and must be handle.
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        arr[position]=value;
        System.out.printf("%s wrote %2d to element %d \n",Thread.currentThread().getName(),value,position);
        // May be it will happen that one thread will add value to array and then other thread will override that value.
        ++writeInx;  // increment index of element to be written next time.
        System.out.printf("Next write index : %d \n",writeInx);
    }
   
    public String toString() {
        return Arrays.toString(arr);
    }
}
