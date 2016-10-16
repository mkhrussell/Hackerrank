package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day02Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mealCost = sc.nextDouble();
		int tipPercent = sc.nextInt();
		int taxPercent = sc.nextInt();
		
		int totalPrice = (int) Math.round(mealCost + mealCost * (tipPercent + taxPercent)/100);
		
		System.out.printf("The total meal cost is %d dollars.", totalPrice);
		
		sc.close();
	}

}
