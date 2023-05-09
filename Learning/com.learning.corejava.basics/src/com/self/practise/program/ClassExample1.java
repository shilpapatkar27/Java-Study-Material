package com.self.practise.program;

public class ClassExample1 {
	
	//state or field
	public int id;
	private String name;
	
	//behaviour or methods
	public void dispalyStudentName() {
		System.out.println("Hello Shilpa");
		
	}
	
	public void dispalyStudentID() {
		System.out.println(121);
		
	}
	
	
	
	public static void main(String ... args) {
		
		ClassExample1 obj1 = new ClassExample1();
		obj1.dispalyStudentName();
		
		ClassExample1 obj2 = new ClassExample1();
		obj2.dispalyStudentID();

	}
}
