package com.kamrul.hackerrank.contest.sears_dots_n_arrows;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeMap;

public class ModifiedFibonacciNumber {

	public static void main(String[] args) {
		ModifiedFibonacciNumber solution = new ModifiedFibonacciNumber();
		solution.run();
	}

	void run() {
		bibMap.put(BigInteger.ZERO, BigInteger.ONE);
		bibMap.put(BigInteger.ONE, BigInteger.ONE);
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger m = in.nextBigInteger();
		BigInteger[] nums = new BigInteger[n];
		
		BigInteger sum = BigInteger.ZERO;
		for(int i = 0; i < n; i++) {
			nums[i] = in.nextBigInteger();
			sum = sum.add(nums[i]);
		}
		
		BigInteger result = bib(nums[0]);
		for(int i = 1; i < n; i++) {
			result = result.add(bib(nums[i]));
			result = result.add(bib(nums[i - 1].add(nums[i])));
		}
		result = result.add(bib(sum));
		result = result.mod(m);
		System.out.println(result.toString());		 
		
		in.close();
	}
	
	BigInteger TWO = new BigInteger("2");
	BigInteger ONE = BigInteger.ONE;
	TreeMap<BigInteger, BigInteger> bibMap = new TreeMap<>();
	
	BigInteger bib(BigInteger curr) {
		BigInteger result = bibMap.get(curr);
		if(result != null)
			return result;
		result = bib(curr.subtract(ONE)).add(bib(curr.subtract(TWO))).add(ONE);
		bibMap.put(curr, result);		
		return result;
	}

}
