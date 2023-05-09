package com.collection.Vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {
	
	public static void main(String[] args) {
		
		Vector<String> langVector=new Vector<String>();  
		langVector.add("Java");  
		langVector.add("CPP");  
		langVector.add("Python");  
		langVector.add("R-lang");
			
		System.out.println("Print the complete vector object: "+langVector);
		System.out.println("Capacity of the vector:"+langVector.capacity());
		System.out.println("Does vector has CPP :"+langVector.contains("CPP"));
		System.out.println("get the element at index 3:"+langVector.get(3));
		System.out.println("get the index of 'Python'"+langVector.indexOf("Python"));
		System.out.println("set method to replace java->JAVA"+langVector.set(0, "JAVA"));

		// In iterator you can travel the collection as well as remove the elements from it.
		// Using Enumeration You can't do the modification(add/remove) inside collection. 	
		// getting the Enumeration object over Vector 
		
	          Enumeration enumeration = Collections.enumeration(langVector);
	          System.out.println("printing each enumeration constant by enumerating through the Vector:");
	          while (enumeration.hasMoreElements())
	          {
	            System.out.println(enumeration.nextElement());
	          }		
	   }
	}
