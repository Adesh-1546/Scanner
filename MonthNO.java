package com.assignment.scanner;
/*
Write a Java program to find the number of days in a month.

Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
 */

public class MonthNO {
	int month ; 
	int year ; 
	
	public MonthNO(int month,int year) {
		this.month = month;
		this.year = year;
		}
	
	public void mydays() {
		switch(month){
        case 1 :
            System.out.println("January :- 31 Days");
            break;
        case 2 : if( year%4==0 ){
            System.out.println("February :- 29 Days");
            break;
        }else {
            System.out.println("February :- 28 Days");
            break;
        }
        case 3 :
            System.out.println("March :- 31 Days");
            break;
        case 4 :
            System.out.println("April:- 30 Days");
            break;
        case 5 :
            System.out.println("May :- 31 Days");
            break;
        case 6 :
            System.out.println("June :- 30 Days");
            break;
        case 7 :
            System.out.println("July :- 31 Days");
            break;
        case 8 :
            System.out.println("August :- 31 Days");
            break;
        case 9 :
            System.out.println("September :- 30 Days");
            break;
        case 10 :
            System.out.println("October :- 31 Days");
            break;
        case 11 :
            System.out.println("November :- 30 Days");
            break;
        case 12 :
            System.out.println("December :- 31 Days");
            break;

        default:
            System.out.println("Enter Valid Number : ");
	}


	}
}