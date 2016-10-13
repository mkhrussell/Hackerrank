package com.kamrul.hackerrank.algo.string;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/mars-exploration
 */

public class MarsExploration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		int changeCount = 0;
		for(int i = 0; i < s.length(); i++) {
			int j = i % 3;
			if(((j == 0 || j == 2) && s.charAt(i) != 'S') || (j == 1 && s.charAt(i) != 'O')) {
				changeCount++;
			}
		}
		
		System.out.printf("%d%n", changeCount);
	}

}
