package com.self.practise.program;

public class parameterizedConstructor {
	
	public String name;
	public int id;
	public String address;
	
	//Creating parameterized constructor
	parameterizedConstructor(String n,int i, String a){ 
		name= n;
		id=i;
		address=a;
		}
	
	public void  display() {
		System.out.println(name+ " " +id+" "+address);
		
	}
	
	public static void main(String [] args) {
		//Creating object for parameterized constructor and passing values  
		parameterizedConstructor pc = new parameterizedConstructor("shilpa", 23, "pune");
		pc.display();
		
	}
	

}
