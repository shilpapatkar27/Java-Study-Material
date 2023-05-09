//13 Jan 2023



package com.learning.corejava.Jan_2023;

import java.util.Scanner;
/*
 * 1/1! + 2/2!...+ n/n!
 * 
 */
public class FactSeries {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        float sum=0;
        long startTime=System.currentTimeMillis();
        for(int i=1;i<=n;i++){
            sum=sum+((float)i/(float)factorial(i));
        }
        System.out.println("Sum is: "+sum);
       
        long endTime=System.currentTimeMillis();
        System.out.println("\nTotal time taken by For Loop:"+(endTime-startTime)+" milliseconds");
    }
    static long factorial(int n){
        long fact=1;
        if(n==1){
            return fact;
        }else{
            for(int j=1;j<=n;j++){
                fact=fact*j;
            }
        }
        return fact;    
	}
}
