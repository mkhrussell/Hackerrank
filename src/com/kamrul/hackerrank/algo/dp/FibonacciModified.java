package com.kamrul.hackerrank.algo.dp;

/*
 * https://www.hackerrank.com/challenges/fibonacci-modified
 */

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciModified {
	
	private static BigInteger MINUS_ONE = BigInteger.ONE.negate();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger t1 = in.nextBigInteger();
		BigInteger t2 = in.nextBigInteger();
		int n = in.nextInt();
		in.close();
		
		BigInteger[] fiboDp = new BigInteger[n + 5];
		Arrays.fill(fiboDp, MINUS_ONE);
		fiboDp[0] = t1;
		fiboDp[1] = t2;
		
		System.out.println(fibo(n, fiboDp).toString());
	}
	
	private static BigInteger fibo(int n, BigInteger[] fiboDp) {
		n = n - 1; // fiboDp array is indexed from 0 to n - 1
		if(n < 2) {
			return fiboDp[n];
		}
		
		if(fiboDp[n].equals(MINUS_ONE)) {
			for(int i = 2; i <= n; i++) {
				if(fiboDp[i].equals(MINUS_ONE)) {
					fiboDp[i] = fiboDp[i - 2].add(fiboDp[i - 1].multiply(fiboDp[i - 1]));
				}
			}
		}
		
		return fiboDp[n];		
	}

}
