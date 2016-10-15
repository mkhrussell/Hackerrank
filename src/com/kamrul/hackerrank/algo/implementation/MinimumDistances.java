package com.kamrul.hackerrank.algo.implementation;

import java.util.Scanner;

public class MinimumDistances {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            A[i] = in.nextInt();
            if(i > 0) {
            	for(int j = i - 1; j >= 0; j--) {
            		if(A[i] == A[j]) {
            			result = Math.min(result, Math.abs(i - j));
            		}
            	}
            }
        }
        in.close();
        if(result != Integer.MAX_VALUE)
        	System.out.println("" + result);
        else
        	System.out.println("-1");
	}

}
