package com.Multi.Threading;

public class Table1 extends Thread {
	Table table = new Table(); 
	int number; 
	
	Table1(Table table, int number){ 
		this.table = table; 
		this.number = number; 
	} 
	
	public void run() { 
		table.printTable(number); 
	} 

}
