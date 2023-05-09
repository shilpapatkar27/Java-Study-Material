package com.Strings;

//count the total number of characters in a string

public class CharcterCount {
	public static void main (String [] args) {
		
		String string="Hello Shilpa ! How are you";
		int count=0;
		
		
		for(int i=0;i<string.length();i++) 
		{
			 if(string.charAt(i) != ' ')    
	                count++;
		}
		System.out.println(count);
	}

}
