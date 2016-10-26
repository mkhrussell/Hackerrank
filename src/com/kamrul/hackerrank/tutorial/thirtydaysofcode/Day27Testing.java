package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

public class Day27Testing {

	public static void main(String[] args) {
		int T = ((int) (Math.random() * 10)) % 5 + 1;
		System.out.println("" + T);
		for(int t = 0; t < T; t++) {
			int N = ((int) (Math.random() * 200)) % 200 + 1;
			while(N < 3) {
				N = ((int) (Math.random() * 200)) % 200 + 1;
			}			
			int K = ((int) (Math.random() * 200)) % N + 1;
			System.out.println(N + " " + K);
			
			System.out.print(getNum() + " ");
			System.out.print("-" + getNum() + " ");
			System.out.print("0 ");
			
			for(int i = 3; i < N; i++) {
				if(isPositive()){
					System.out.print(getNum() + " ");
				}else {
					System.out.print("-" + getNum() + " ");
				}
			}
			System.out.println();
		}		
	}
	
	static boolean isPositive() {
		int n = ((int) (Math.random() * 10));
		return n < 5;
	}
	
	static int getNum() {
		return ((int) (Math.random() * 1000) + 1) % 1001;
	}

}
