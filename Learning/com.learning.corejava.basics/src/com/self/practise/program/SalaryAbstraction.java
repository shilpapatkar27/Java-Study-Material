package com.self.practise.program;

public class SalaryAbstraction extends EmployeeAbstraction{
	private double salary;   // Annual salary
	   
	   public SalaryAbstraction(String name, String address, int number, double salary) {
	      super(name, address, number);
	      setSalary(salary);
	   }
	   
	   public void mailCheck() {
	      System.out.println("Within mailCheck of Salary class ");
	      System.out.println("Mailing check to " + getName() + " with salary " + salary);
	   }
	 
	   public double getSalary() {
	      return salary;
	   }
	   
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	   }
	   
	   public double computePay() {
	      System.out.println("Computing salary pay for " + getName());
	      return salary/52;
	   }
	}