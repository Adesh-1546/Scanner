package com.assignment.scanner;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		Table tb = new Table(num);
		EvenOdd eo = new EvenOdd(num);
		tb.mytable();
		eo.myEO();
		
		
		sc.close();
	}

}
