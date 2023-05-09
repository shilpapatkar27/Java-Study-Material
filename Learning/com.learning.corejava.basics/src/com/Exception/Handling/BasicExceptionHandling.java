package com.Exception.Handling;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * Error : it is something which you can't handle. e.g JVM memory full.
 * Exception:An exception is a problem that arises during the execution of a program.
 * Exception Handling : can handle and continue the program. 
 * Top most class : Exception, Top Most interface: Throwable.
 *
 */
public class BasicExceptionHandling {
	/*
    * Two types of Exception
    * 1. Checked exception ( Compile time) e.g ClassNotFound, IOException
    * 2. Unchecked exception (Runtime) e.g ArithmeticException, ArrayIndexOutOfBound
    *
    */
	
	public static void main(String args[]) {
        // Runtime exception example
        int i=10;
        int j=0;
       
        //int divRes = i/j; // handle, otherwise program will stop from here.
       
        // Compile time exception example. How to handle. try/catch or throws.
        try {
            FileInputStream ir=new FileInputStream("text.txt");
            ir.read();
        }catch(IOException e) {
            System.out.println("file exception occured");
            e.getStackTrace();
        }
        
        try {
            handleExceptionwithThrows();
        }catch(Exception ioEx) {
            System.out.println("Exception from function:"+ioEx.getMessage());
        }
      
       
    }

	static void handleExceptionwithThrows() throws IOException{
        FileInputStream ir=new FileInputStream("abc.txt");
        ir.read();        
       
    }
}

