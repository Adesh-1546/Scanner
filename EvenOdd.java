package com.assignment.scanner;

public class EvenOdd {
	//instance variable
	int num;
	
	//constructor
	public EvenOdd(int num1) {
		this.num=num1;
	}
	
	//method
	public void myEO(){
		if(num%2==0) {
			System.out.println("Number entered is Even");
		}else {
			System.out.println("Number entered is Odd");
		}
		System.out.println("---------------");
	}

}
