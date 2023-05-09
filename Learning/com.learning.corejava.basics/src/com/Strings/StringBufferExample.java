package com.Strings;

public class StringBufferExample {
	public static void main(String[] args) {
		
	// Its a thread-safe
	StringBuffer sb=new StringBuffer("Hello SB"); // capacity 16 + length of parameter
	
	System.out.println("Capacity :"+sb.capacity());
	sb.append("I am learning Java"); // increase the capacity by (current*2)+2.
	
	System.out.println(sb);
	sb.insert(8, "!!"); // You can insert substring into the string useing StringBuffer
	
	System.out.println(sb);
	System.out.println("Capacity :"+sb.capacity());
	}
}