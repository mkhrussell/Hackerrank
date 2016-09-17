package com.kamrul.hackerrank.java;

import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {
		JavaStringCompare prob = new JavaStringCompare();
		prob.solve();
	}

	private Scanner sc = null;
	private String givenString = null;
	private int subStrLength;
	
	private void solve() {
		sc = new Scanner(System.in);
		givenString = sc.next();
		subStrLength = sc.nextInt();
		
		String minSubString, maxSubString;
		minSubString = maxSubString = givenString.substring(0, subStrLength);
		
		String subString;
		for(int i = 1; i + subStrLength <= givenString.length(); i++) {
			subString = givenString.substring(i, i + subStrLength);

			if(subString.compareTo(minSubString) < 0) {
				minSubString = subString;
			}
			
			if(subString.compareTo(maxSubString) > 0) {
				maxSubString = subString;
			}
		}
		
		System.out.println(minSubString);
		System.out.println(maxSubString);
	}
}
