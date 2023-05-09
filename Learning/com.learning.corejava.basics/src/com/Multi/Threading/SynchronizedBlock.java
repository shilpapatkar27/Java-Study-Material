package com.Multi.Threading;

import java.util.List;

public class SynchronizedBlock {
	
	String name = ""; 
	 public int count = 0; 
	 
	 public void addName(String name, List<String> namesList){ 
		 
	 synchronized(this){ 
		 this.name = name; 
		 count++; 
		 } 
		 namesList.add(name); 
	 } 
	 
	 public int getCount(){ 
		 return count; 
	 } 

}
