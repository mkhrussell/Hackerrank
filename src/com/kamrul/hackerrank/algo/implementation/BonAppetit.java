package com.kamrul.hackerrank.algo.implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		BonAppetit bonApetit = new BonAppetit();
		bonApetit.run();
	}

	Scanner in;
	
	void run() {
		in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] itemCosts = new int[n];
		long sumOfCosts = 0L;
		for(int i = 0; i < itemCosts.length; i++){
			itemCosts[i] = in.nextInt();
			sumOfCosts += (long) itemCosts[i];
		}
		
		long chargedByBrian = in.nextLong();
		long fullChargedByBrian = chargedByBrian * 2;
		if((sumOfCosts - (long) itemCosts[k]) == fullChargedByBrian) {
			System.out.println("Bon Appetit");
		}else {
			System.out.printf("%d%n", itemCosts[k] / 2);
		}
	}

}
