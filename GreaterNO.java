package com.assignment.scanner;

public class GreaterNO {
	int num1,num2,num3;
	
	public GreaterNO(int num1, int num2, int num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	public void great() {
		if (num1 > num2)
			   if (num1 > num3)
			    System.out.println("The greatest: " + num1);
			   
			  if (num2 > num1)
			   if (num2 > num3)
			    System.out.println("The greatest: " + num2);
			   
			  if (num3 > num1)
			   if (num3 > num2)
			    System.out.println("The greatest: " + num3);
	}

}
