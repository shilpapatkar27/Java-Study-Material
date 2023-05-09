//19 Jan 2023

package com.learning.corejava.Jan_2023;

/* 
 * Access specifier is use to decide the access or scope of the variable or function or class
 * We have 4 access specifiers in java : public, private, protected, default.
 * 
 * Encapsulation : Wrapping/binding of data member & functions together.
 * Abstraction : Hiding the data and expose the necessary functionality. Hide Internal functionality.   
 *  
 */
public class AccessSpecifiers { // class can be either public, private, default, final or abstract
	
	int number; //default access   
	private String name; // private access - within the class only. Can't access name outside this class.
	public String message; // public access : can be accessible from anywhere. 
	
	double calculateBill(String[] list) {
		// For local variables only 'final' keyword is allowed.
		double total = 14000; // bill generate based on list.
		calculateGst(14000);
		return total;
	}
	
	// Abstraction : can be achieve using public, private, protected and default.  
	private void calculateGst(int i) {
		// logic for GST		
	}

	
}
