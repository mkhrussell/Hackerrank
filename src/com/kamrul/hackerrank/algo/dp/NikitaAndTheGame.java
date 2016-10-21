package com.kamrul.hackerrank.algo.dp;

import java.math.BigInteger;
import java.util.Scanner;

public class NikitaAndTheGame {

	public static void main(String[] args) {
		NikitaAndTheGame sol = new NikitaAndTheGame();
		sol.run();
	}
	
	void run() {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int n = in.nextInt();
			BigInteger[] nums = new BigInteger[n];
			boolean areAllZero = true;
			for(int i = 0; i < n; i++) {
				nums[i] = in.nextBigInteger();
				areAllZero &= nums[i].equals(BigInteger.ZERO);
			}
			
			if(n == 1){
				System.out.println("0");
			}else {
				if(areAllZero) {
					System.out.println("" + (n - 1));
				}else {
					System.out.println("" + getScore(nums, n, 0, n-1));
				}
			}			
		}
		in.close();
	}
	
	int getScore(BigInteger[] nums, int n, int from, int to) {
		if(from >= to) return 0;
		int result = 0;
		for(int partition = from; partition <= to; partition++) {
			int leftIndex = from, rightIndex = partition + 1;
			
			BigInteger leftSum = BigInteger.ZERO;
			while(leftIndex <= partition) leftSum = leftSum.add(nums[leftIndex++]);
			BigInteger rightSum = BigInteger.ZERO;
			while(rightIndex <= to) rightSum = rightSum.add(nums[rightIndex++]);
			
			if(leftSum.equals(rightSum)) {				
				result = Math.max(
							Math.max(1, 1 + getScore(nums, n, from, partition)),
							Math.max(1, 1 + getScore(nums, n, partition + 1, to))
						);
			}
		}		
		
		return result;
	}
	
}
