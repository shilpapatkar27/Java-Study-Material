package com.self.practise.program;


//// H.W: Declare three subject sub1, sub2, sub3 and calculate avg of each student.

public class StudentMarks {
	public String name;
	public int rollNo;
	public String address;
	private int sub1;
	private int sub2;
	private int sub3;
	
	
	public StudentMarks(String name, int rollNo, String address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	
	public StudentMarks() {
		// TODO Auto-generated constructor stub
	}

	public void displayStudDetails(int rollNo, String name, String address) {
		  System.out.println("RollNo:"+rollNo+", Name:"+name+", Address:"+address);
		
	}
	
	public void setSubjectMarks(int sub1,int sub2,int sub3) {
		this.sub1= sub1;
		this.sub2= sub2;
		this.sub3= sub3;	
	}
	
	public void avg(int sub1,int sub2,int sub3) {
		int totalMarks= sub1+sub2+sub3/3;
		System.out.println(+totalMarks);
		
	}
	
	public static void main(String[] args) {
		
		StudentMarks studobj1 = new StudentMarks();
		studobj1.displayStudDetails(1,"Shilpa","Pune");
		//studobj1.setSubjectMarks(56, 45, 40);
		studobj1.avg(56, 45, 40);
		
		StudentMarks studobj2 = new StudentMarks();
		studobj2.displayStudDetails(2,"Kunal","Mumbai");
		studobj2.avg(50, 50, 50);
	}

}
