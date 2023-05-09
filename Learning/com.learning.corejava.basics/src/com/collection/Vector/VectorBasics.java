package com.collection.Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorBasics {
	 public static void main(String[] args) {
		 
		 	System.out.println("\n**************Add Elements to Vector*************\n");
	        Vector<String> mammals= new Vector<>();

	        // Using the add() method
	        mammals.add("Dog");
	        mammals.add("Horse");
	        // Using index number
	        mammals.add(2, "Cat");
	        System.out.println("Vector: " + mammals);
	        // Using addAll()
	        Vector<String> animals = new Vector<>();
	        animals.add("Crocodile");
	        animals.addAll(mammals);
	        System.out.println("New Vector: " + animals);
	        
	        System.out.println("\n**************Access Vector Elements*************\n");
	        Vector<String> animals1= new Vector<>();
	        animals1.add("Dog");
	        animals1.add("Horse");
	        animals1.add("Cat");

	        // Using get()
	        String element = animals1.get(2);
	        System.out.println("Element at index 2: " + element);

	        // Using iterator()
	        Iterator<String> iterate = animals1.iterator();
	        System.out.print("Vector: ");
	        while(iterate.hasNext()) {
	            System.out.print(iterate.next());
	            System.out.print(", ");
	        }
	        
	        System.out.println("\n**************Remove Vector Elements*************\n");
	        Vector<String> animals11= new Vector<>();
	        animals11.add("Dog");
	        animals11.add("Horse");
	        animals11.add("Cat");

	        System.out.println("Initial Vector: " + animals11);

	        // Using remove()
	        String element1 = animals11.remove(1);
	        System.out.println("Removed Element: " + element1);
	        System.out.println("New Vector: " + animals11);

	        // Using clear()
	        animals11.clear();
	        System.out.println("Vector after clear(): " + animals11);
	        
	        
	        
	    }

}
