package com.collection.LinkedList;

import java.util.*;  

public class LinkedListDemo {  
	
 public static void main(String args[]){  
  
	  LinkedList<String> langList=new LinkedList<String>();  
		  langList.add("Java");  
		  langList.add("CPP");  
		  langList.add("Python");  
		  langList.add("R-lang");  
		  System.out.println("Print the newly created LinkedList:");
  
		  Iterator<String> itr=langList.iterator();  
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }  
  
		  // Adding an element at the specific position  
		  langList.add(1, "React");  
		  System.out.println("After add(int index, E element) method: "+langList);
		  
		  // Adding an element at the first position  
		  langList.addFirst("Angular");  
		  System.out.println("After invoking addFirst(E e(i.e 'Angular')) method: "+langList);  
		  
		  //Adding an element at the last position  
		  langList.addLast("AWS-Cloud");  
		  System.out.println("After invoking addLast(E e(i.e 'AWS-Cloud')) method: "+langList);
		  
		  //Removing specific element from arraylist  
		  langList.remove("CPP");  
		  System.out.println("After invoking remove(object) method-removed 'CPP': "+langList); 
		  
		  //Removing element on the basis of specific position  
		  langList.remove(0);  
		  System.out.println("After invoking remove(index) method- removed at index 0: "+langList);
		  
		  langList.removeFirst();
		  System.out.println("After invoking removeFirst() method"+langList);  
		  
		  langList.removeLast();
		  System.out.println("After invoking removeLast() method"+langList);
  
		  langList.add("Java-Spring");
		  langList.add("Java-Spring");
		  langList.add("Java-Spring");
		  langList.add("Java-Spring");
		  
		  System.out.println("After invoking add('Java_Spring') method 4 times"+langList);
		  
		  langList.remove("Java-Spring");
		  System.out.println("After invoking remove('Java_Spring') method:"+langList);
		  
		  langList.removeFirstOccurrence("Java-Spring");
		  System.out.println("After invoking removeFirstOcurrence() method"+langList);
		  
		  langList.removeLastOccurrence("Java-Spring");
		  System.out.println("After invoking removeLastOcurrence() method"+langList);
		  
		  System.out.println("Print the LinkedList in reverse Order");
		  reverseLinkedList(langList);
		  
		 }
 
		 static void reverseLinkedList(LinkedList langList) {
			 Iterator itr =langList.descendingIterator();
				 while(itr.hasNext()){  
					 System.out.println(itr.next());  
				 } 
 }
}
