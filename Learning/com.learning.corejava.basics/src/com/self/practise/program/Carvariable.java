package com.self.practise.program;

public class Carvariable {
	
	//The static block is a block of statement inside a Java class that will be executed when a class is first loaded into the JVM. 
	//A static block helps to initialize the static data members.
	static {
		System.out.println("We are in static block");  // static block
	}
	
	
	
	String model;           // object  instance property
	
	
	//static is keyword
	// its class property
	// it can access using class name 
	//Static variable in Java is variable which belongs to the class and initialized only once at the start of the execution. 
	//It is a variable which belongs to the class and not to object(instance ). 
	static int buildYear=2020;    // static variable
	
	
	
	
	//Static method in Java is a method which belongs to the class and not to the object. 
	//A static method can access only static data. 
	//It is a method which belongs to the class and not to the object(instance). 
	//A static method can access only static data. 
	//It cannot access non-static data (instance variables).
	//A static method can call only other static methods and can not call a non-static method from it.
	//A static method can be accessed directly by the class name and doesn’t need any object
	//A static method cannot refer to “this” or “super” keywords in anyway
	
	public static void display() {
		System.out.println("We are in static methods");   // static methods
	}
	
	public int avg() {
		
		// A variable declared inside the body of the method is called local variable. 
		//its scope is local
		//You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
		int temp=10;    // local variable
		fun1();
		return 0;
		
	}	
	private void fun1() {
		// TODO Auto-generated method stub
		
	}
	
	

	public static void main(String[] args) {
		//main method is static, since it must be accessible for an application to run, before any instantiation takes place.
		
		
		//A variable declared inside the class but outside the body of the method, is called an instance variable. 
		//It is called an instance variable because its value is instance-specific and is not shared among instances.
		int a,b;     // instance variable
		
		
		Carvariable cv = new Carvariable();
		cv.model="Audi";
		cv.buildYear=2020;
		
		System.out.println(cv.buildYear);
		System.out.println(Carvariable.buildYear);
		
		
		
	}

}
