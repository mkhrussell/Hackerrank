package com.kamrul.hackerrank.algo.string;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/camelcase
 */

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		int wordCount = 0;
		if(s.length() >= 1) {
			wordCount++;
			for(int i = 0; i < s.length(); i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					wordCount++;
				}			
			}
		}
		System.out.printf("%d%n", wordCount);
	}

}
