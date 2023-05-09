package com.self.practise.program;


//create child class for Minikeyword  
class superKeywordTest extends Minikeyword  {  
	
 // default constructor  
	superKeywordTest()  
	{  
	     // calling base class constructor  
	     super();  
	     System.out.println("The size of the Minikeyword is XXL.");  
	}  
	
	 
	 public static void main(String[] args)  
	 {  
	     // call default constructor of the superKeywordTest  
		 superKeywordTest skt = new superKeywordTest();
	     System.out.println("Inside Main");  
	 }  
}  
