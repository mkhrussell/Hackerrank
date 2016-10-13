package com.kamrul.hackerrank.algo.implementation;

/*
 * https://www.hackerrank.com/challenges/repeated-string
 */

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        in.close();
        
        findCountInOriginal(s);
        
        long countInInfinite = (n / s.length()) * countInOriginal[s.length() - 1];
        long fractionStringLength = n - (n / s.length()) * s.length();
        if(fractionStringLength > 0) {
        	countInInfinite  += countInOriginal[(int)fractionStringLength - 1];
        }
        
        System.out.printf("%d%n", countInInfinite);
	}
	
	static int[] countInOriginal = new int[101];
	
	static void findCountInOriginal(String s) {
		if(s.charAt(0) == 'a')
			countInOriginal[0] = 1;
		
		for(int i = 1; i < s.length(); i++) {
			countInOriginal[i] += countInOriginal[i - 1];
			if(s.charAt(i) == 'a') {
				countInOriginal[i]++;
			}
		}
	}
}
