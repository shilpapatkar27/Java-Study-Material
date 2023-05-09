package com.Multi.Threading;

public class Table_ThreadSynchronizationExample {
	public static void main(String[] args) { 
		
		Table table = new Table(); 
		
		Table1 thread_1 = new Table1(table, 5); 
		Table2 thread_2 = new Table2(table, 10); 
		
		thread_1.start(); 
		thread_2.start(); 
		}

}
