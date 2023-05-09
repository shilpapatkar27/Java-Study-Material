package com.Multi.Threading;

public class Consumer2 implements Runnable{
	
	ItemQueue itemQueue; 
	
	Consumer2(ItemQueue itemQueue)
	{ 
		this.itemQueue = itemQueue; 
		new Thread(this, "Consumer").start(); 
	} 
	public void run() { 
		while(true) 
		{ 
		itemQueue.getItem(); 
		} 
	} 

}
