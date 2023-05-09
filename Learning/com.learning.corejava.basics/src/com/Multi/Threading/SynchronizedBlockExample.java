package com.Multi.Threading;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlockExample {
	
	public static void main (String[] args) 
	 { 
		SynchronizedBlock namesList_1 = new SynchronizedBlock(); 
		SynchronizedBlock namesList_2 = new SynchronizedBlock(); 
		
	 List<String> list = new ArrayList<String>(); 
	 namesList_1.addName("Rama", list); 
	 namesList_2.addName("Seetha", list); 
	 namesList_2.addName("shilpa", list); 
	 
	System.out.println("Thread1: " + namesList_1.name + ", " + 
	namesList_1.getCount() + "\n"); 
	
	System.out.println("Thread2: " + namesList_2.name + ", " + 
	namesList_2.getCount() + "\n"); 
	 }
}
