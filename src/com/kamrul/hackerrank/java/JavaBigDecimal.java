package com.kamrul.hackerrank.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String[] s = new String[n+2];
		for(int i = 0; i < n; i++) {
			s[i] = scanner.next();
		}
		scanner.close();
		
		String[] newS = new String[n];
		System.arraycopy(s, 0, newS, 0, n);
		
		Arrays.sort(newS, new Comparator<String>() {
			@Override
			public int compare(String left, String right) {
				BigDecimal leftDecimal = new BigDecimal(left);
				BigDecimal righDecimal = new BigDecimal(right);

				return righDecimal.subtract(leftDecimal).signum();
			}
		});		
		System.arraycopy(newS, 0, s, 0, n);
		
		for(int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}

}
