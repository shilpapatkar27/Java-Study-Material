package com.Multi.Threading;

public class ProducerConsumer {
	
	public static void main(String args[]) { 
		ItemQueue itemQueue = new ItemQueue(); 
		new Producer2(itemQueue); 
		new Consumer2(itemQueue); 
		}

}
