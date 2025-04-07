package com.assignment.scanner;
import java.util.Scanner;

public class Main_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Month Number from 1 to 12");
        int month = sc.nextInt();
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        
        MonthNO mn = new MonthNO(month, year);
        mn.mydays();
        sc.close();
	}

}
