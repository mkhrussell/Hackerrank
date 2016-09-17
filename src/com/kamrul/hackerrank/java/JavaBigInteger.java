package com.kamrul.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		scanner.close();
		
		BigInteger sum = a.add(b);
		BigInteger mul = a.multiply(b);
		
		System.out.println(sum.toString());
		System.out.println(mul.toString());
	}

}
