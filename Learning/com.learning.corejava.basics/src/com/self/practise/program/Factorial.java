package com.self.practise.program;

//4! = 4*3*2*1 = 24  

public class Factorial {
	public static void main(String [] args) {
		int i;
		
		int num=4;
		
		for( i=1;i<=num;i++) {
			int fact = 1;
			fact=fact*i;
			System.out.println(+fact);
		}
		
	}

}
