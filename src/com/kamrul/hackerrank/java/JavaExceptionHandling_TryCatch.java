package com.kamrul.hackerrank.java;

import java.util.Scanner;

public class JavaExceptionHandling_TryCatch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		
		try {
			int firstNum = Integer.parseInt(first);
			int secondNum = Integer.parseInt(second);
			
			int result = firstNum / secondNum;
			System.out.println("" + result);			
		}catch(NumberFormatException nfe) {
			System.out.println("java.util.InputMismatchException");
		}catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		
		in.close();
	}

}
