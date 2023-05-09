package com.learning.corejava.basics;

/*
 * Class : Collection of data member(instance variable/instance properties) and member function(behavior or methods 
 * in a class)
 * Class is a blue print or class is a template. Class doesn't have existence.(not runtime)
 * e.g.: Car, Cat, Cricketer, Teacher, Product, BankAccount 
 * 
 * Object: Instance of a class or basic runtime entity. It has runtime existence.  
 * Syntax : ClassName objName = new ClassName();
 * 
 *  Keywords rule:
 *  true, false, and null might seem like keywords, 
 *  but they are actually literals; you cannot use them as identifiers in your programs.
 * 
 */
/**
 * This is User define Student class. It contain reference to Address class.
 * @author  Kunal
 * @see     java.lang.Class
 * @since   Jan 2023
 * 
*/

/*
 *  Each class in java is derived from Object class. Object is top most class in java. Also called as Cosmic class.
 *  It contain below methods - toString(), equals(), hashCode(),wait(), notify(), notifyAll(), getClass(),clone() 
 */
public class Student extends Object {
	// Instance variables - per object these variables gets separate memory.
	private String name;
	private int rollNo;
	//private String address;
	// Association -> HAS-A relationship.  Student has Address. Student contain reference of Address.
	private Address address;
	
	
	/* Class Variable / static variables : 
	1. It gets memory only once and not per instance. 
	2. It is accessible by className. E.g.  Student.collegeName.
	3. static is not a constant. Constant can be declare using final
	*/
	private static String collegeName="MIT Pune";

	//Member functions / behavior
	// To call this method you need object of Student class.
	
	/*
	 * This method calculate the average of the subjects
	 */
	double avg() {
		return 0.0;
	}
	
	/**
	 * Method display the Student data.
	 * @return Does not return anything.
	 * 
	 */
	void display() {
		System.out.println("Name:"+this.name +",RollNo:"+this.rollNo+",Address:"+this.address+", CollegeName:"+Student.collegeName);
		
	}
	// When parameterize constructor is implemented then you should add default constructor also. 
	public Student() {
		this.name = null;
		this.rollNo = 0;
		this.address = null;
	}
	
	static void displayCollegeName() {
		System.out.println("College Name:"+Student.collegeName);
	}
	
	/**
	 * Constructor is used to initialize the object. No return type. Same name as class name.
	 * @param n Name of students
	 * @param r
	 * @return As this is constructor it does not return anything.
	 * 
	 */
	public Student(String n,int r,String street,String city, String state, int pin) {
		// this : its a keyword in java. it is a pointer/reference which refer to current object.
		this.name = n;
		this.rollNo = r;
		this.address= new Address();
		this.address.setCity(city);
		this.address.setStreet(street);
		this.address.setState(state);
		this.address.setPin(pin);
		
	}
}

