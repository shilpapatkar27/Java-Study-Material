//18 Jan 2023

package com.learning.corejava.Jan_2023;

//by default java.lang is imported.
/*
 *  Each program converts to process. Each process has a stack.
 */
public class StudentTest {

	/* public: class should be accessible to the JVM.
	 * static method: will be invoke by JVM without creating the object. StudentTest.main()
	 * 
	 */
	public static void main(String[] args) {

		// Class within same package need not to import.
		// Objects created by new gets created inside Heap Area
		// S1 and S2 are local variables because they declared inside the function.
		Student s1=new Student();  // Constructor gets invoke automatically. If we dont implement it then JVM add it.
		
		Student s2=new Student("Sagar",100,"Camp","Pune","MH",41102);
		
		s1.display();
		s2.display();
		
		
		// H.W: Declare three subject sub1, sub2, sub3 and calculate avg of each student.
		// H.W: Define another class called as Address containing attributes - street, city, state, pin
		
		// At the end when function execution gets completed the local variables gets destroyed. But objects doesn't. 
		// GC : garbage collection collect out/free the object memory. 
		
		
	}

}
