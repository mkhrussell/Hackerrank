package com.kamrul.hackerrank.algo.dp;

/*
 * https://www.hackerrank.com/challenges/maxsubarray
 */

import java.util.Scanner;

public class TheMaximumSubarray {

	public static void main(String[] args) {
		TheMaximumSubarray sol = new TheMaximumSubarray();
		sol.run();
	}

	Scanner in;
	
	int n;
	int[] nums;
	int cntigusMaxSum;
	int nonCntigusMaxSum;
	
	void run() {
		in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0) {
			n = in.nextInt();
			nums = new int[n];
			
			int maxNum = 0;
			for(int i = 0; i < n; i++) {
				nums[i] = in.nextInt();
				if(i == 0) maxNum = nums[i];
				else if(nums[i] > maxNum) maxNum = nums[i];
			}

			if(maxNum < 0) {// Max Number is negative so all numbers are negative.
				cntigusMaxSum = nonCntigusMaxSum = maxNum;
			} else {
				cntigusMaxSum = kadanesAlgo();
				nonCntigusMaxSum = sumOfAllPositives();
			}
						
			System.out.println(cntigusMaxSum + " " + nonCntigusMaxSum);
		}
		in.close();
	}

	// This is modified Kadane's Algorithm works on all negative numbers also
	private int kadanesAlgo() {
		int max = nums[0];
		int sum = nums[0];
		for(int i = 1; i < n; i++) {
			sum = Math.max(nums[i], sum + nums[i]);
			max = Math.max(max, sum);
		}
		return max;
	}
	
	private int sumOfAllPositives() {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(nums[i] > 0) sum += nums[i];
		}
		return sum;
	}
}
