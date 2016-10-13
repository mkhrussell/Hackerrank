package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class ExceptionsStringToIntegerDay16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		in.close();
		
		try {
			int num = Integer.parseInt(s);
			System.out.printf("%d%n", num);
		}catch(NumberFormatException nfe) {
			System.out.println("Bad String");
		}
	}

}
