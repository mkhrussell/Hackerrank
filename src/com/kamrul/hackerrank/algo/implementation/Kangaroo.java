package com.kamrul.hackerrank.algo.implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long x1 = scanner.nextLong();
		long v1 = scanner.nextLong();
		
		long x2 = scanner.nextLong();
		long v2 = scanner.nextLong();
		scanner.close();
		
		if(v1 == v2 && x1 == x2) {
			System.out.println("YES");
		}else if((v1 == v2 && x1 != x2) || (v1 > v2 && x1 > x2) || (v1 < v2 && x1 < x2)) {
			System.out.println("NO");
		}else {
			long d1 = x1, d2 = x2;
			long i = 1;
			while(true) {
				d1 += i * v1;
				d2 += i * v2;
				
				if(d1 == d2) {
					System.out.println("YES");
					break;
				}else if((v1 > v2 && d1 > d2) || (v1 < v2 && d1 < d2)) {
                    System.out.println("NO");
                    break;
                }
			}
		}
    }
}
