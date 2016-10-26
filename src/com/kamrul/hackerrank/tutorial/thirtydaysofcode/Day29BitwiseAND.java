package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day29BitwiseAND {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T--> 0) {
			int N = in.nextInt();
			int K = in.nextInt();
			int result = 0;
			for(int a = 1; a < N; a++) {
				for(int b = a + 1; b <= N; b++) {
					int c = a & b;
					if(c < K && c > result) {
						result = c;
					}
				}
			}
			System.out.println("" + result);
		}
		in.close();
	}

}
