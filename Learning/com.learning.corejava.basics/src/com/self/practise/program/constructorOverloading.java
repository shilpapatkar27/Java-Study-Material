package com.self.practise.program;

public class constructorOverloading {
	
	public String name;
	public int id;
	public String address;
	
	//Creating default constructor
	constructorOverloading(){
		System.out.println(name+ " " +id+" "+address);
		
	}
	
	//Creating two arg constructor  
	constructorOverloading(String n,int i){
		name= n;
		id=i;
	}
	
	//Creating three arg constructor 
	constructorOverloading(String n,int i, String a){
		name= n;
		id=i;
		address=a;
		}
	
	void display() {
		System.out.println(name+ " " +id+" "+address);
	}
	
		public static void main(String [] args) {
			constructorOverloading cv1 = new constructorOverloading();
			constructorOverloading cv2 = new constructorOverloading("Kunal",123);
			cv2.display();
			constructorOverloading cv3 = new constructorOverloading("shilpa", 23, "pune");
			cv3.display();
			
		}
	

}
