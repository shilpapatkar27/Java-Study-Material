package com.self.practise.program;


//Base class or Parent class
public class AnimalsuperKeyword1 {
	
	public  String animalType;
	
}
	
	// Dog is child class of AnimalsuperKeyword1
	 class Dog extends AnimalsuperKeyword1{
		
	    //default constructor  
		Dog(){
			String animalType="White";
			System.out.println("Dog color is :" +super.animalType);
			
		}
				 
}

