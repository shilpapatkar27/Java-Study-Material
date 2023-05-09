package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

/*
 * Array and ArrayList
 *
 * Array : Works with same data type.(add only homogeneous objects). array size is static(you can't incrase
 * the size of the array once its define. compiler should understand the size of an array at compile time only.
 *
 *
 */
	public static void main(String[] args) {
		
	ArrayList aList = new ArrayList();
	//aList = new Vector(); you can't covert it to Vector as aList is declared as ArrayList.
	// Below declaration is more suitable, Program to interface and not to implementation
	// i.e create a reference of supertype and assign memory of subtype.
	
	List aList1 = new ArrayList();
	// ArrayList with only integer object. Initial capacity is 10
	
	ArrayList<Integer> intList = new ArrayList<Integer>();
	//ArrayList with String object with initial capacity 20
	
		ArrayList<String> strList = new ArrayList<String>(20);
		aList.add("Zero");
		aList.add("One");
		aList.add("two");
		aList.add(3);
		aList.add("Four");
		
		System.out.println("0th Element of aList using get(index):"+aList.get(1));
		System.out.println("Complete array List :"+aList);
		
		regularforWay(aList);
		forEachWay(aList);
		iteratorWay(aList);
		
		System.out.println("\nArrayList contains method, check for Four: "+aList.contains("Seven"));
		System.out.println("\nArrayList remove with index method, remove 3: "+aList.remove(3));
		System.out.println("\nArrayList set (replace) with index method: "+aList.set(2,"twoo"));
		
		strList.add("Five");
		strList.add("Seven");
		strList.add("One");
		strList.add("Four");
		strList.add("Nine");
		sortList(strList);
		sortListInReverse(strList);
		customSort(strList);
		
		ArrayList<String> revList = reverseArrayList(strList);
}
	
		static void regularforWay(List a) {
			int i=0;
			System.out.println("\nArraylist using regular for loop");
			for(i=0;i<a.size();i++) {
				System.out.println(a.get(i));
			}
		}
		static void forEachWay(List a) {
			System.out.println("\nArraylist using foreach loop\n");
			for(Object s:a) {
				System.out.println(s);
			}
		}
		
		static void iteratorWay(List a) {
			System.out.println("\nArraylist using iterator\n");
			Iterator it=a.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		static void sortList(List<String> aList) {
			System.out.println("\nSort using Collections");
			System.out.println("Before :"+aList);
			Collections.sort(aList);
			System.out.println("After :"+aList);
		}
		static void sortListInReverse(List<String> aList) {
			System.out.println("\nReverse Sort using Collections");
			System.out.println("Before :"+aList);
			Collections.sort(aList,Collections.reverseOrder());
			System.out.println("After :"+aList);
		}
		static void customSort(List<String> aList) {
			// Implement comparator interface
			System.out.println("\nSort using Comparator");
			System.out.println("Before:"+aList);
			Collections.sort(aList,new MySortComparator());
			System.out.println("After:"+aList);
		}
		static ArrayList<String> reverseArrayList(ArrayList<String> alist) {
			// ArrayList for storing reversed elements
			ArrayList<String> revArrayList = new ArrayList<String>();
			for (int i = alist.size() - 1; i >= 0; i--) {
				// Append the elements in reverse order
				revArrayList.add(alist.get(i));
		}
		//Return the reversed arraylist
			return revArrayList;
			}
		}

	class MySortComparator implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			//o1>o1 it will return positive
			//o1==o2 it will return zero
			//o1<o2 return negative
			return o1.compareTo(o2);
		}

}
