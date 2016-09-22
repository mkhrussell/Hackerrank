package com.kamrul.hackerrank.algo.warmup;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] array = new int[N];
		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		// 1 2 3 : K = 0
		// 3 1 2 : K = 1 
		// 2 3 1 : K = 2

		// K = 2
		// (3 + 0 - K) % 3 == 1
		// (3 + 1 - K) % 3 == 2
		// (3 + 2 - K) % 3 == 0
		
		int k = K % N;
		for(int q = 0; q < Q; q++) {
			int m = sc.nextInt();
			if(k > m)
				System.out.println("" + array[N + m - k]);
			else
				System.out.println("" + array[m - k]);
		}		
		sc.close();
	}

}

/*
0 1 2 3 4 5

(5 + 2) % 6 = 1

(i + K) % N = a

After 1:
array[i] = array[i - 1]

*/