package com.kamrul.hackerrank.java;

import java.util.Scanner;

public class JavaSubArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		
		int numNegativeArray = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				int sum = 0;
				for(int k = i; k <= j; k++) {
					sum += nums[k];
				}
				if(sum < 0) {
					numNegativeArray++;
				}
			}
		}
		
		System.out.println("" + numNegativeArray);
	}
}
