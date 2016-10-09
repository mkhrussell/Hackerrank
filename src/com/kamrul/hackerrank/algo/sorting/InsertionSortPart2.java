package com.kamrul.hackerrank.algo.sorting;

import java.util.Scanner;

public class InsertionSortPart2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		
		insertionSortPart2(ar);
	}
	
	private static void insertionSortPart2(int[] ar) {
		for(int i = 1; i < ar.length; i++) {
			int key = ar[i];
			int j = i - 1;
			for(; j >= 0 && ar[j] > key; j--) {
				ar[j + 1] = ar[j];
			}
			ar[j + 1] = key;
			
			printArray(ar);
		}
	}
	
	private static void printArray(int[] ar) {
		for(int num : ar) {
			System.out.printf("%d ", num);
		}
		System.out.println();
	}

}
