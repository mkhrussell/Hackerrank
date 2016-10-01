package com.kamrul.hackerrank.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        
        Locale usLocale = new Locale("en", "us");
        NumberFormat nfmtUs = NumberFormat.getCurrencyInstance(usLocale);        
        String usString = nfmtUs.format(payment);
        System.out.println("US format = " + usString);
        
        Locale inLocale = new Locale("en", "in");
        NumberFormat nfmtIn = NumberFormat.getCurrencyInstance(inLocale);        
        String inString = nfmtIn.format(payment);        
        System.out.println("India format = " + inString);
        
        scanner.close();
	}

}
