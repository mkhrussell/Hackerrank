package com.kamrul.hackerrank.algo.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int positiveCount = 0, negativeCount = 0, zeroCount = 0;		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if(num == 0)
				zeroCount++;
			else if(num > 0)
				positiveCount++;
			else if(num < 0)
				negativeCount++;			
		}
		sc.close();
		
		double positiveFraction = (double) positiveCount / N;
		double negativeFraction = (double) negativeCount / N;
		double zeroFraction = (double) zeroCount / N;
		
		System.out.printf("%.6f%n%.6f%n%.6f%n", positiveFraction, negativeFraction, zeroFraction);
	}
}
