package com.kamrul.hackerrank.algo.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(j >= N - i - 1){
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

/*
0 1 2 3 4 5
          #
*/