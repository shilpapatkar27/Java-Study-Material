package com.collection.ArrayList;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Vector;

	/*
	* Resizable-array implementation of the List interface.
	*/
	public class ArrayListBasics {
		
	public static void main(String[] args) {
			// Integer a=10; // primitive to wrapper.
			ArrayList myList = new ArrayList(); // default capacity(length or size) is 10
			myList.add(10); // int 10 will be converted to Integer wrapper class.
			myList.add(20);
			myList.add(30);
			myList.add(40);
			myList.add(50);
			myList.add(60);
			myList.add(70);
			myList.add(80);
			
			myList.add(90);
			myList.add(100); // size/capacity will be increase
			myList.add(110);
			myList.add("ONE");
			myList.add("Two");
			myList.add("Three");
			
	System.out.println(myList);
	System.out.println("ArrayList size :"+myList.size());
	System.out.println("Element at index 0:"+myList.get(0)); // array[0]
	System.out.println("Element at index 2:"+myList.get(2)); // array[2]
	System.out.println("Element at index 10:"+myList.get(10)); // array[10]
	//System.out.println("Element at index 50:"+myList.get(50)); // array[10]
	System.out.println("Does ArrayList contains 30??: "+myList.contains(30));
	System.out.println("Does ArrayList contains 300??: "+myList.contains(300));
	System.out.println("Remove element at index 5:"+myList.remove(5));
	System.out.println("ArrayList after remove :"+myList);
	System.out.println("ArrayList travel : ");
	
	
	for(int i=0;i<myList.size();i++) 
	{
		System.out.println(myList.get(i));
	}
	
	// Define the ArrayList with specific type of element. E.g. If ArrayList will have only int.
	// Below ArrayList will hold only integer.
	
	ArrayList<Integer> intList = new ArrayList<Integer>();
	intList.add(101);
	intList.add(102);
	intList.add(103);
	intList.add(104);
	
	//print ArrayList using for each
	System.out.println("\nInteger arraylist printed using for-each loop");
	for(Integer i:intList) 
	{
		System.out.println(i);
	}
	
	ArrayList<Integer> studRoll=new ArrayList<Integer>();
	studRoll.addAll(intList);
	studRoll.add(105);
	studRoll.add(106);
	
	System.out.println("Stud Roll Numbers :"+studRoll);
	// ArrayList Constructor
	
	ArrayList<String> strList = new ArrayList<String>(); // Initial size will be 10
	
	ArrayList<String> strList1 = new ArrayList<String>(100); // Initial size/capacity will be 100
	//Another way to define the ArrayList using interface reference.
	// Imp: We can't create object of an interface
	//List aList=new List(); //not valid- should not create interface object.
	
	List aList= new ArrayList<Integer>();
	
	/*
	* Difference between below statements
	ArrayList<Integer> intList = new ArrayList<Integer>();
	List aList= new ArrayList<Integer>();
	intList can't be converted to other list implementation type.
	aList can be converted to other List implementation type like ArrayList, Vector and LinkedList
*/
	aList = new Vector<Integer>();
	// intList = new Vector<Integer>(); //error in this list as intList cant convert to Vector.
}
	

}
