package com.Exception.Handling;

public class CustomException extends Exception{
	   
    String msg;
    
    public CustomException(String msg) {
    	
    	super(msg); //call parent constructor
        this.msg = msg;
        //System.out.println(msg);
    }    
}