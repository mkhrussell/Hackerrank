package com.kamrul.hackerrank.algo.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0L;
        for(int n = 0; n < N; n++) {
            sum += sc.nextLong();
        }
        sc.close();
        System.out.printf("%d%n", sum);
	}

}
