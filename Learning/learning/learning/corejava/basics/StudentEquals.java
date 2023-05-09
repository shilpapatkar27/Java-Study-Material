package com.learning.corejava.basics;

public class StudentEquals {
	String name;
	int rollNo;
	
	public static void main(String... args) {
		StudentEquals e1=new StudentEquals("Kunal",100);
		
		StudentEquals e2=new StudentEquals("Kunal",100);
		
		StudentEquals e3=e2; //e2 and e3 have same reference.
		
		String s1="Kunal";
		String s2="Kunal";
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		// == check compare the references.
		if(e1==e2) { // will be false as e1 and e2 gets different memory location / both have different reference 
			System.out.println("e1==e2 is true");
		}
		else
		{
			System.out.println("e1==e2 is false");
		}
		// Default equals method from Object class doesn't compare the content of the class, it only checks the reference)
		// In-case you want to compare the object value for equality using equals method then override equals() from Object class.
		if(e1.equals(e2)) {
			System.out.println("e1.equals(e2) is true");
		}
		else
		{
			System.out.println("e1.equals(e2) is false");
		}

		if(e2.equals(e3)) {
			System.out.println("e2.equals(e3) is true");
		}
		else
		{
			System.out.println("e2.equals(e3) is false");
		}
		
		if(s1.equals(s2)) {
			System.out.println("String s1.equals(s2) is true");
		}else {
			System.out.println("String s1.equals(s2) is false");
		}
	}
	public StudentEquals(String name, int rollNo) {
		//super();
		this.name = name;
		this.rollNo = rollNo;
	}
	
	// Method signature(prototype or method declaration(name, and parameter, return type).
	@Override // override Object's equals() method.
	public boolean equals(Object e) {
		if(this == e)
			return true;
		else if(e instanceof StudentEquals){
			StudentEquals temp = (StudentEquals)e;
			if(this.name==temp.name && this.rollNo == temp.rollNo)
				return true;
		}
		return false;
	}
}
