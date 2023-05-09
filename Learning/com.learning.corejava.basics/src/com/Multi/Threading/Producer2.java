package com.Multi.Threading;

public class Producer2  implements Runnable {
	
	ItemQueue itemQueue; 
	
	Producer2(ItemQueue itemQueue)
	{ 
		this.itemQueue = itemQueue; 
		new Thread(this, "Producer").start(); 
	} 
	
	public void run() { 
	int i = 0; 
		while(true) 
		{ 
			itemQueue.putItem(i++); 
		} 
	}

}
