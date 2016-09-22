package com.kamrul.hackerrank.algo.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int diagonalSumOne = 0, diagonalSumTwo = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				int num = sc.nextInt();
				if(i == j)
					diagonalSumOne += num;
				
				if(i + j ==  N - 1)
					diagonalSumTwo += num;
			}
		}
		sc.close();
		System.out.printf("%d%n", Math.abs(diagonalSumOne - diagonalSumTwo));		
	}
}

/*
    0 1 2 3 4 5
----------------
0 | 0 1 2 3 4 5
1 | 0 1 2 3 4 5
2 | 0 1 2 3 4 5
3 | 0 1 2 3 4 5
4 | 0 1 2 3 4 5
5 | 0 1 2 3 4 5

*/