package com.self.practise.program;

public class defaultConstructor1 {
	
	public String name;
	public int id;
	
	//Creating default constructor and displaying the default values
	public defaultConstructor1() {
		System.out.println(id+""+name);
		
	}
	
	//In the above class,you are not creating any constructor so compiler provides you a default constructor. 
	//Here 0 and null values are provided by default constructor.
	public void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String [] args) {
		defaultConstructor1 dc1 = new defaultConstructor1();
		dc1.display();
		
	}

}
