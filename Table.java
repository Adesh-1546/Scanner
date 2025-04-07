package com.assignment.scanner;
//main method called in main class file

public class Table {
	//instance variable
	int num;
	
	//Constructor
	public Table (int num) {
		this.num=num;
	}
	
	//logic method
	public void mytable() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(num + " * "+ i + " = " + num*i);
		}
		System.out.println("--------------");
	}
	

}

