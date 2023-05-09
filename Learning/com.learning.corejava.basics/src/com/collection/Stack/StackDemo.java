package com.collection.Stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		 
		// Create Integer type stack
		Stack<Integer> stacks = new Stack<>();
	
		// Create String type stack
		Stack<String> stacks1 = new Stack<>();
		
		System.out.println("\n***********push() Method*********\n");
		Stack<String> animals= new Stack<>();
		// Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);
        
        System.out.println("\n***********pop() Method*********\n");
        Stack<String> animals1= new Stack<>();
        // Add elements to Stack
        animals1.push("Dog");
        animals1.push("Horse");
        animals1.push("Cat");
        System.out.println("Initial Stack: " + animals1);

        // Remove element stacks
        String element = animals1.pop();
        System.out.println("Removed Element: " + element);
        
        
        System.out.println("\n***********peek() Method*********\n");
        Stack<String> animals11= new Stack<>();

        // Add elements to Stack
        animals11.push("Dog");
        animals11.push("Horse");
        animals11.push("Cat");
        System.out.println("Stack: " + animals11);

        // Access element from the top
        String element1 = animals11.peek();
        System.out.println("Element at top: " + element1);

        System.out.println("\n***********search() Method*********\n");
        Stack<String> animals111= new Stack<>();

        // Add elements to Stack
        animals111.push("Dog");
        animals111.push("Horse");
        animals111.push("Cat");
        System.out.println("Stack: " + animals111);

        // Search an element
        int position = animals111.search("Horse");
        System.out.println("Position of Horse: " + position);
        
        
        System.out.println("\n***********empty() Method*********\n");
        Stack<String> animals1111= new Stack<>();

        // Add elements to Stack
        animals1111.push("Dog");
        animals1111.push("Horse");
        animals1111.push("Cat");
        System.out.println("Stack: " + animals1111);

        // Check if stack is empty
        boolean result = animals1111.empty();
        System.out.println("Is the stack empty? " + result);
	
	 }
}
