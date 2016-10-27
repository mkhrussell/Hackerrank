package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day26NestedLogic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int actualReturnDay = in.nextInt();
		int actualReturnMonth = in.nextInt();
		int actualReturnYear = in.nextInt();
		
		int expectedReturnDay = in.nextInt();
		int expectedReturnMonth = in.nextInt();
		int expectedReturnYear = in.nextInt();
		
		int fine = 0;		
		if(actualReturnYear == expectedReturnYear && actualReturnMonth == expectedReturnMonth && actualReturnDay <= expectedReturnDay) {
			fine = 0;
		} else if(actualReturnYear == expectedReturnYear && actualReturnMonth == expectedReturnMonth && actualReturnDay > expectedReturnDay) {
			fine = 15 * (actualReturnDay - expectedReturnDay);
		} else if(actualReturnYear == expectedReturnYear && actualReturnMonth > expectedReturnMonth) {			
			fine = 500 * (actualReturnMonth - expectedReturnMonth);
		} else if(actualReturnYear > expectedReturnYear) {
			fine = 10000;
		}
		System.out.println("" + fine);
		
		in.close();
	}

}
