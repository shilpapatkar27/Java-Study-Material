package com.homework.Jan2023;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=4;
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				System.out.println("Given number is prime");
			}
			else {
				System.out.println("Given number is not  prime");
			}
		}
	}

}
