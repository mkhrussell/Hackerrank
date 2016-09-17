package com.kamrul.hackerrank.java;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        int len = A.length() + B.length();
        System.out.println("" + len);
        if(A.compareTo(B) > 0) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
        
        String tmpA = "" + A.charAt(0);
        tmpA = tmpA.toUpperCase();
        if(A.length() > 1)
        	tmpA = tmpA + A.substring(1, A.length());
        
        String tmpB = "" + B.charAt(0);
        tmpB = tmpB.toUpperCase();
        if(B.length() > 1)
        	tmpB = tmpB + B.substring(1, B.length());
        System.out.println(tmpA + " " + tmpB);
	}

}
