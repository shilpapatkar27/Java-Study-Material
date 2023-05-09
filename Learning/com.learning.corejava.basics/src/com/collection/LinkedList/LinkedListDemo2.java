package com.collection.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo2 {
	
	public static void main(String[] args){
		
	System.out.println("\n**************Add elements to a LinkedList*************\n");
	 // create linkedlist
    LinkedList<String> animals = new LinkedList<>();
    // add() method without the index parameter
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);

    // add() method with the index parameter
    animals.add(1, "Horse");
    System.out.println("Updated LinkedList: " + animals);
    
    System.out.println("\n************** Access LinkedList elements************\n");
    LinkedList<String> languages = new LinkedList<>();
    // add elements in the linked list
    languages.add("Python");
    languages.add("Java");
    languages.add("JavaScript");
    System.out.println("LinkedList: " + languages);

    // get the element from the linked list
    String str = languages.get(1);
    System.out.print("Element at index 1: " + str);
    
    System.out.println("\n*************Change Elements of a LinkedList************\n");
    LinkedList<String> languages1 = new LinkedList<>();
    // add elements in the linked list
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Java");
    System.out.println("LinkedList: " + languages);

    // change elements at index 3
    languages.set(3, "Kotlin");
    System.out.println("Updated LinkedList: " + languages);
  
    System.out.println("\n*************Remove element from a LinkedList***********\n");
    LinkedList<String> languages11 = new LinkedList<>();
    // add elements in LinkedList
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Kotlin");
    System.out.println("LinkedList: " + languages);

    // remove elements from index 1
    String str1 = languages.remove(1);
    System.out.println("Removed Element: " + str);
    System.out.println("Updated LinkedList: " + languages);
    
    
    System.out.println("\n*************Java LinkedList as Queue***********\n");
    Queue<String> languages111 = new LinkedList<>();
    // add elements
    languages111.add("Python");
    languages111.add("Java");
    languages111.add("C");
    System.out.println("LinkedList: " + languages111);

    // access the first element
    String str11 = languages111.peek();
    System.out.println("Accessed Element: " + str11);

    // access and remove the first element
    String str2 = languages111.poll();
    System.out.println("Removed Element: " + str2);
    System.out.println("LinkedList after poll(): " + languages111);

    // add element at the end
    languages111.offer("Swift");
    System.out.println("LinkedList after offer(): " + languages111);
    
    
    System.out.println("\n*************Iterating through LinkedList***********\n");
    // Creating a linked list
    LinkedList<String> animals1 = new LinkedList<>();
    animals1.add("Cow");
    animals1.add("Cat");
    animals1.add("Dog");
    System.out.println("LinkedList: " + animals1);

    // Using forEach loop
    System.out.println("Accessing linked list elements:");
    for(String animal: animals1) {
        System.out.print(animal);
        System.out.print(", ");
    }
  
	}
}
