package com.kamrul.hackerrank.contest.worldcodesprint7;

import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		SockMerchant sol = new SockMerchant();
		sol.run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] socksWithColor = new int[N];
		int sold = -1;
		int canBeSold = 0;
		for(int i = 0; i < N; i++) {
			socksWithColor[i] = sc.nextInt();
			for(int j = i - 1; j >= 0; j--) {
				if(socksWithColor[j] != sold && socksWithColor[i] == socksWithColor[j]) {
					canBeSold++;
					socksWithColor[i] = sold;
					socksWithColor[j] = sold;
				}
			}
		}
		
		System.out.printf("%d%n", canBeSold);
		
		sc.close();
	}

}
