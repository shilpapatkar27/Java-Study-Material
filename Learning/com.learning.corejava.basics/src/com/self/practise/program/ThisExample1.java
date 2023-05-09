package com.self.practise.program;


class ThisExample1 {  
    
    // initialize instance and static variable   
    int num1 = 5;  
    static int num2 = 10;  
      
    // default constructor of class ThisExample1  
    ThisExample1()  
    {  
        // invoking current class constructor  
        this(5);  
        System.out.println("We are insie of the default constructor.");  
        System.out.println("The value of num1 = "+num1);  
    }  
  
    ThisExample1(int num1)  
    {  
        this.num1 = num1; // override value of the current class instance variable  
        System.out.println("We are inside of the parameterized constructor.");  
        System.out.println("The value of num2 = "+num2);  
    }  
    public static void main(String[] args)  
    {  
        // invoking constructor of the current class  
        new ThisExample1();  
        System.out.println("Inside Main");  
    }  
}  