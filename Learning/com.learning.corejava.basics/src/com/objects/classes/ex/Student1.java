package com.objects.classes.ex;

class Student1 {
	int id;
	String name;
	
	public Student1(int id, String name) {
	 this.name = name;
	 this.id = id;
	 }
	
	public int getId() {
	return id;
	}
	
	public void setId(int id) {
	this.id = id;
	}
	
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
public boolean equals(Object s1) {

		System.out.println("In equals method of Student class");
		if(s1==null)
			return false;
		if(!(s1 instanceof Student1))
			return false;
		Student1 s = (Student1)s1;
		if(this.id==s.getId() && this.name==s.getName())
			return true;
		else
			return false;
}
		/* If we don't implement hash code then even if Objects are equal in nature
		* their hashcode will not be same(not satisfying the contract)
		*/
public int hashCode() {
	return this.id * 25 + this.name.length();
}
		/* Remember
		1) If two objects are equal, then they must have the same hash code.
		2) If two objects have the same hash code, they may or may not be equal.
		*/
}
