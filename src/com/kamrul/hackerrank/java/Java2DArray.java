package com.kamrul.hackerrank.java;

import java.util.Scanner;

public class Java2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int grid[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        /*
         2 4 4
           2
         1 2 4
         */
        
        int[] dx = {
        -1, -1, -1,
             0,
        +1, +1, +1 };
         
        int[] dy = {
        -1, 0, +1,
            0,
        -1, 0, +1 };
        
        int maxSum = Integer.MIN_VALUE;
        for(int i = 1; i < 6 - 1; i++) {
        	for(int j = 1; j < 6 - 1; j++) {
        		int sum = 0;
        		for(int k = 0; k < 7; k++) {
        			sum += grid[i+dx[k]][j+dy[k]];
        		}
        		if(sum > maxSum) {
        			maxSum = sum;
        		}
        	}
        }
        System.out.println("" + maxSum);
	}

}
