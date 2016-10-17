package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day20Sorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		
		// Track number of elements swapped during a single array traversal
	    int numberOfSwaps = 0;
		for (int i = 0; i < n; i++) {		    		    
		    for (int j = 0; j < n - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		            swap(a, j, j + 1);
		            numberOfSwaps++;
		        }
		    }		    
		    // If no elements were swapped during a traversal, array is sorted
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}
		
		System.out.printf("Array is sorted in %d swaps.%n", numberOfSwaps);
		System.out.printf("First Element: %d%n", a[0]);
		System.out.printf("Last Element: %d%n", a[n-1]);
	}

	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
