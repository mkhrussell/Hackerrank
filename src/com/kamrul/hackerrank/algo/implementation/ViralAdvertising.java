package com.kamrul.hackerrank.algo.implementation;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int countLiked = getCountLiked(n, 5);
		System.out.println("" + countLiked);
		in.close();
	}

	private static int getCountLiked(int n, int m) {
		if(n == 0) {
			return 0;
		}
		
		int count = m/2;
		count += getCountLiked(n - 1, count * 3);
		
		return count;
	}

}
