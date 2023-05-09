package com.objects.classes.ex;

public class HashcodeEqualsTest {
	 public static void main(String[] args) {
		 
		 Student s1 = new Student(1,"Kunal");
		 Student s2 = new Student(1,"Kunal");
	
	
		 System.out.println("S1 hashcode = "+ s1.hashCode());
		 System.out.println("S2hashcode = "+ s2.hashCode());
		 System.out.println("Equality between s1 and s2= "+ s1.equals(s2));
	 
	 }
}
