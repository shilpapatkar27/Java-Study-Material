package com.Multi.Threading;

public class SampleThreadTest {
	public static void main(String[] args) { 
		
		SampleThread threadObject1 = new SampleThread(); 
		SampleThread threadObject2 = new SampleThread(); 
		
		threadObject1.setName("first"); 
		threadObject2.setName("second"); 
		
		threadObject1.setPriority(4); 
		threadObject2.setPriority(Thread.MAX_PRIORITY);
		
		threadObject1.start(); 
		threadObject2.start(); 
		} 


}
