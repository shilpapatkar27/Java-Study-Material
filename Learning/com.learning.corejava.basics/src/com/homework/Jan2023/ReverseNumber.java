/*number = 1234
remainder = 1234 % 10 = 4
reverse = 0 * 10 + 4 = 0 + 4 = 4
number = 1234 / 10 = 123
*/


package com.homework.Jan2023;

public class ReverseNumber {
	public static void main(String ... args) {
		int number = 1234, reverse=0;
		while (number!= 0) {
			int remainder = number % 10;
			reverse= reverse * 10 + remainder;
			number = number / 10 ;
			
		}
		
		System.out.println("The reverse no is :"+reverse);
	}

}
