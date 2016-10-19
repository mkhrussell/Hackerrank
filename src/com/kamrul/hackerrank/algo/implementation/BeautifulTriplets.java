package com.kamrul.hackerrank.algo.implementation;

/*
 * https://www.hackerrank.com/challenges/beautiful-triplets
 */

import java.util.Scanner;

public class BeautifulTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		
		boolean[] isNumGiven = new boolean[20002];		
		int maxNum = 0;
		for(int k = 0; k < n; k++) {
			int num = in.nextInt();			
			isNumGiven[num] = true;
			if(num > maxNum) {
				maxNum = num;
			}
		}
		
        in.close();
        
        int tripletCount = 0;
        for(int currNum = maxNum - d; currNum - d >= 0; currNum--) {
        	if(isNumGiven[currNum] && isNumGiven[currNum - d] && isNumGiven[currNum + d]) {
        		tripletCount++;
        	}
        }
        
        System.out.println("" + tripletCount);
	}	
}
