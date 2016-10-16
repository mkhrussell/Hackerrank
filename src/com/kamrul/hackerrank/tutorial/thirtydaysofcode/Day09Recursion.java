package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day09Recursion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("" + factorial(n));
		in.close();
	}

	private static int factorial(int n) {
		if(n <= 0)
			return 1;
		
		return n * factorial(n - 1);		
	}
}
