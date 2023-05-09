package com.Multi.Threading;


//Call add method that will Add integer to an array shared with other Runnable threads.

public class ArrayWriter implements Runnable{
	
	 private final SimpleArray sharedSimpleArray;
	 private final int startValue;
	 
	 public ArrayWriter(int value,SimpleArray array) {
	     this.startValue = value;
	     this.sharedSimpleArray = array;
	 }

	 public void run() {
	     for (int i=startValue;i<startValue+3;i++) {
	         sharedSimpleArray.add(i); // add element to shared array
	     }
 }
}