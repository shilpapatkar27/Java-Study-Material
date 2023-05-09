package com.self.practise.program;

// parent class
class superKeyword{  
    // data member of superKeyword class  
    String size = "L";    
      
}  
// create child class of superKeyword(parent class)  
class Minikeyword extends superKeyword{  
	
    //default constructor  
	Minikeyword()  
    {  
        // data members of the Minikeyword class  
        String size = "S";    
        System.out.println("The Minikeyword size is "+super.size); // calling parent class(base class) data member  
        System.out.println("The Minikeyword size is "+size);  
    }  
}  
