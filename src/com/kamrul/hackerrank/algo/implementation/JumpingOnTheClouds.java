package com.kamrul.hackerrank.algo.implementation;

/*
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds
 */

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] clouds = new int[n];
		for(int i = 0; i < n; i++) {
			clouds[i] = in.nextInt();
		}
		in.close();		
		
		System.out.println("" + getJumpCount(n, 0, clouds, 0));
	}
	
	static int getJumpCount(int n, int pos,
							int[] clouds, int jumpCount) {
		
		if(pos >= n - 1) {
			return jumpCount;
		}
		
		if(clouds[pos] == 1) {
			return Integer.MAX_VALUE;
		}
		
		return Math.min(
				getJumpCount(n, pos + 1, clouds, jumpCount + 1),
				getJumpCount(n, pos + 2, clouds, jumpCount + 1));		
	}

}
