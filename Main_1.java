package com.assignment.scanner;
import java.util.Scanner;

public class Main_1 {
	
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		   
		  System.out.print("Input the 1st number: ");
		  int num1 = sc.nextInt();
		   
		  System.out.print("Input the 2nd number: ");
		  int num2 = sc.nextInt();
		   
		  System.out.print("Input the 3rd number: ");
		  int num3 = sc.nextInt();
		  sc.close();
		  
		  GreaterNO gn = new GreaterNO(num1, num2, num3);
		  gn.great();

}
}
