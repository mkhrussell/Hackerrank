package com.kamrul.hackerrank.java;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next();        
        sc.close();
        
        boolean flag = true;
        for(int i = 0, j = A.length() - 1; flag && i < A.length() / 2; i++, j--) {
        	flag = A.charAt(i) == A.charAt(j);
        }
        
        if(flag)
        	System.out.println("Yes");
        else
        	System.out.println("No");
	}

}
