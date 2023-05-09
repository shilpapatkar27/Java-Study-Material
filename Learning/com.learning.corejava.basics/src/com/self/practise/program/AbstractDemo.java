package com.self.practise.program;

public class AbstractDemo {

	   public static void main(String [] args) {
	      /* Following is not allowed and would raise error */
		 //Abstraction is abstract; cannot be instantiated
		  // EmployeeAbstraction e = new EmployeeAbstraction("George W.", "Houston, TX", 43);
	     // System.out.println("\n Call mailCheck using Employee reference--");
	      //e.mailCheck();
		   
		   
		   SalaryAbstraction s = new SalaryAbstraction("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		   SalaryAbstraction e = new SalaryAbstraction("John Adams", "Boston, MA", 2, 2400.00);
		      System.out.println("Call mailCheck using Salary reference --");
		      s.mailCheck();
		      System.out.println("\n Call mailCheck using Employee reference--");
		      e.mailCheck();
	   }
	}

