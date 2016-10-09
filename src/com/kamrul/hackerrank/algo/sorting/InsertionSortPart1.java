package com.kamrul.hackerrank.algo.sorting;

import java.util.Scanner;

public class InsertionSortPart1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++) {
			ar[i]=in.nextInt();
		}
		in.close();
		
		insertIntoSorted(ar);
	}
	
	private static void printArray(int[] ar) {
		for(int n: ar) {
			System.out.print(n+" ");
		}
		System.out.println("");
	}
	
	public static void insertIntoSorted(int[] ar) {
		for(int i = ar.length - 1; i > 0; i--) {
			int key = ar[i];
			int j = i - 1;
			for(; j >= 0 && ar[j] > key; j--) {
				ar[j + 1] = ar[j];
				printArray(ar);
			}
	        ar[j + 1] = key;
	    }
		printArray(ar);
	}

}
