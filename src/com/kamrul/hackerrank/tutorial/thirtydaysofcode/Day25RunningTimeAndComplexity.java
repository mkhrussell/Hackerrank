package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day25RunningTimeAndComplexity {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			long num = in.nextLong();
			String ans = "Not prime";
            if(num == 1L) {
                ans = "Not prime";
            }else if(num == 2L) {
                ans = "Prime";
            }else {
                if((num % 2L) == 0L) {
                    ans = "Not prime";
                }else {
                    ans = "Prime";
                    long mid = (long) Math.sqrt((double)num);
                    for(long oddNum = 3L; oddNum <= mid; oddNum += 2L) {
                        if((num % oddNum) == 0L) {
                            ans = "Not prime";
                            break;
                        }
                    }
                }                
            }
            System.out.println(ans);
		}
		in.close();		
	}
}
