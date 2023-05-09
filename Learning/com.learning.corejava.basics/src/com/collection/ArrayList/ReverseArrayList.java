package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//reverse the list without using temp list ?

public class ReverseArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,3,4,6,7,8,10));
		System.out.println(a);
		
		for(int i=0;i<a.size();i++) {
			a.add(i, a.remove(a.size()-1));
			}
		System.out.println(a);
	}
}