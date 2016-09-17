package com.kamrul.hackerrank.java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer> > listOfNumList = new ArrayList<>();
		int N = sc.nextInt();
		for(int n = 0; n < N; n++) {
			ArrayList<Integer> numList = new ArrayList<>();
			int D = sc.nextInt();
			for(int d = 0; d < D; d++) {
				int num = sc.nextInt();
				numList.add(num);
			}
			listOfNumList.add(numList);
		}
		
		int Q = sc.nextInt();
		for(int q = 0; q < Q; q++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			x = x - 1;
			y = y - 1;
			
			if(x >= 0 && x < listOfNumList.size()) {
				if(y >= 0 && y < listOfNumList.get(x).size()) {
					System.out.println("" + listOfNumList.get(x).get(y));
				}else {
					System.out.println("ERROR!");
				}				
			}else {
				System.out.println("ERROR!");
			}
		}
		sc.close();
	}

}
