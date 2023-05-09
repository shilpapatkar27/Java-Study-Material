package com.collection.Iterators;

import java.util.Enumeration; 
import java.util.Vector; 
public class EnumerationTest { 
	public static void main(String[] args) 
	{ 
		// Create object of vector class without using generic. 
			Vector v = new Vector(); 
	
		// Add ten elements of integer type using addElement() method. 
			 for(int i = 0; i <= 5; i++)
			 { 
			      v.addElement(i); 
			   } 
			 System.out.println(v);//print all elements at a time[0, 1, 2, 3, 4, 5] 
			 
		// Get elements one by one. So, will require Enumeration concept. 
		// Create object of Enumeration by calling elements() method of vector class using object reference variable v. 
		// At the beginning, e (cursor) will point to index just before the first element in v. 
			 
		Enumeration e = v.elements(); 
	
		// Checking the next element availability using reference variable e and while loop. 
		while(e.hasMoreElements())
		{ 
			// Moving cursor to next element. 
			Object o = e.nextElement(); 
			Integer i = (Integer)o; // Here, Type casting is required because the return type of nextElement() method is an object. Therefore, it's compulsory to require type casting. 
			System.out.println(i); 
	   	} 
     }
 }
