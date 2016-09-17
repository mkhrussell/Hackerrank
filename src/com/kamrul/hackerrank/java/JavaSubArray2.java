package com.kamrul.hackerrank.java;

import java.util.Scanner;

public class JavaSubArray2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		
		int numNegativeArray = 0;
		for(int startIndex = 0; startIndex < N; startIndex++) {
			int sum = 0;
			for(int size = 1; startIndex + size <= N; size++) {
				sum += nums[startIndex + size - 1];
				if(sum < 0) {
					numNegativeArray++;
				}
			}
		}
		
		System.out.println("" + numNegativeArray);
	}
}
