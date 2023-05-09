package com.Multi.Threading;

public class ItemQueue {
	int item; 
	boolean valueSet = false; 
	
	synchronized int getItem() 
		{ 
			while (!valueSet) 
				try 
				{ 
					wait(); 
				} catch (InterruptedException e) 
				{ 
					System.out.println("InterruptedException caught"); 
				} 
					System.out.println("Consummed:" + item);
					valueSet = false; 
				try 
				{ 
				Thread.sleep(1000); 
				} catch (InterruptedException e) 
				{ 
				System.out.println("InterruptedException caught"); 
				} 
					notify(); 
					return item; 
				} 
	
	synchronized void putItem(int item) { 
		while (valueSet) 
		try 
			{ 
				wait(); 
			} catch (InterruptedException e) 
			{ 
				System.out.println("InterruptedException caught"); 
			} 
				this.item = item; 
				valueSet = true; 
				System.out.println("Produced: " + item); 
			try 
			{ 
				Thread.sleep(1000); 
			} catch (InterruptedException e) 
			{ 
				System.out.println("InterruptedException caught"); 
			} 
				notify(); 
		} 

}
