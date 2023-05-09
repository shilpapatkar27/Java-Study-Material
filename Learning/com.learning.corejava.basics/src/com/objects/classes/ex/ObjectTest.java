package com.objects.classes.ex;

public class ObjectTest {
	
public static void main(String[] args) {
	
		Student1 obj1=new Student1(1,"Ramesh");
		Student1 obj2=new Student1(2,"Suresh");
		Student1 obj3=new Student1(1,"Ramesh");
	/*
	-If we don't override equals() method in Student1 class then the default equals method from the
	 Object class check the reference of the object e.g return (obj1 == obj2);
	-Try commenting equals method. If do so then the below equality will return false as both bj1 and
	 obj2 have different reference (as they are created by new)
	*/
		
		System.out.println("obj1.equals(obj3) : "+obj1.equals(obj3));
		System.out.println("Obj1 hashCode:"+obj1.hashCode());
		System.out.println("Obj2 hashCode:"+obj2.hashCode());
		System.out.println("Obj2 hashCode:"+obj3.hashCode()+"\n");
		Student1 s1=new Student1(5,"Kedar");
		Student1 s2=s1;
		System.out.println("Hash Code of S1:"+s1.hashCode());
		System.out.println("Hash Code of S1:"+s2.hashCode());
	}
}
