package com.self.practise.program;


public class copyConstructor{  
    int id;  
    String name;  
    
	    //constructor to initialize integer and string  
	    copyConstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    
	    //constructor to initialize another object  
	    //We can copy the values from one object to another
	    copyConstructor(copyConstructor cc){  
	    id = cc.id;  
	    name =cc.name;  
	    }  
	    
	    
    void display(){
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[]){  
    	copyConstructor cc1 = new copyConstructor(111,"Karan");  
    	copyConstructor cc2 = new copyConstructor(cc1);  
    	cc1.display();  
    	cc1.display();  
   }  
}  