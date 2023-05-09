//13 Jan 2023

package com.learning.corejava.Jan_2023;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		try {
			System.out.println("In Main");
			Scanner in = new Scanner(System.in);						
	        long num=in.nextLong();
	        int flag=0;
	        long startTime=System.currentTimeMillis();
	        System.out.println("Start Time:::::::::::"+startTime);
	        long i;
	        for(i=2;i<=num/2;i++){  // time taken by loop worst O(n/2) and best O(1) 
	            if(num%i==0){
	                flag=1;
	                break;
	            }
	        }
	        if(flag==1){
	            System.out.println("\nNumber is not prime it is divisible by "+i);
	        }else{
	            System.out.println("\nNumber is prime");
	        }
	        long endTime=System.currentTimeMillis();
	        System.out.println("\nEnd Time:::::::::::"+endTime+"\n");
	        System.out.println("\nTotal time taken by For Loop:"+(endTime-startTime)+" milliseconds");
		}catch(Exception e) {
			System.out.println(e);
		}       
	}
}


