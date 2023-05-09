package com.Strings;

public class CountVowelConsonant {
	
	public static void main(String args[]) {
		
		int vowelCount=0, consonantCount=0;
		String s1="Hello All,I am Shilpa Patkar";
		
		//Converting entire string to lower case to reduce the comparisons    
		s1 = s1.toLowerCase();
		
		//Checking vowels
		for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)== 'a' || s1.charAt(i)== 'e' || s1.charAt(i)== 'i' || s1.charAt(i)== 'o' || s1.charAt(i)== 'u') {    
					vowelCount++;
					       
				} 
				else if(s1.charAt(i) >= 'a' && s1.charAt(i)<='z') {      
	                //Increments the consonant counter    
					consonantCount++;    
	            }    
			}
			System.out.println(vowelCount);
			System.out.println(consonantCount);
	}

}



