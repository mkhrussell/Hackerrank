package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();
		
		/*
		 x x x
		   x 
		 x x x
		 */
		int dx[] = {
				-1, -1, -1,
				     0,
				+1, +1, +1
				};
		int dy[] = {
				-1, 0, +1,
				    0,
				-1, 0, +1
				};
		
		int maxSum = Integer.MIN_VALUE;
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				int sum = 0;
				for(int dIndx = 0; dIndx < 7; dIndx++) {
					sum += arr[i + dx[dIndx]][j + dy[dIndx]];
				}
				if(sum > maxSum){
					maxSum = sum;
				}
			}
		}
		System.out.println("" + maxSum);
	}

}
