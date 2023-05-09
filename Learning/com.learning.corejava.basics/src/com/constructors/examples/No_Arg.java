package com.constructors.examples;

public class No_Arg {
	
	int i;

	  // constructor with no parameter
	  private No_Arg() {
	    i = 5;
	    System.out.println("No Argument Constructor is called");
	  }

	  public static void main(String[] args) {

	    // calling the constructor without any parameter
		  No_Arg obj = new No_Arg();
	    System.out.println("Value of i: " + obj.i);
	  }

}
