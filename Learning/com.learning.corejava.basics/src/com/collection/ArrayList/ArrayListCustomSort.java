package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCustomSort {
	
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		
		ar.add(new Student(601, "Ram", "pune"));
		ar.add(new Student(571, "Kunal", "delhi"));
		ar.add(new Student(491, "Samar", "jaipur"));
		ar.add(new Student(491, "Samir", "jaipur"));
		
		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar, new Sortbyroll());
		System.out.println("\nSorted by rollno");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar, new Sortbyname());
		System.out.println("\nSorted by name");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		}
}


