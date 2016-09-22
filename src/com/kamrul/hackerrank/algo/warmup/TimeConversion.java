package com.kamrul.hackerrank.algo.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputTimeString = sc.next();
		sc.close();
		
		int hourValue = Integer.parseInt(inputTimeString.substring(0, inputTimeString.indexOf(':')));
		String minSecondString = inputTimeString.substring(inputTimeString.indexOf(':'), inputTimeString.length() - 2);
		String amPmString = inputTimeString.substring(inputTimeString.length() - 2);
		
		StringBuilder twentyFourFormatTimeString = new StringBuilder();
		if(amPmString.equals("AM")) {
			if(hourValue == 12){
				twentyFourFormatTimeString.append("00");
				twentyFourFormatTimeString.append(minSecondString);
			}else {
				twentyFourFormatTimeString.append(inputTimeString.substring(0, inputTimeString.length() - 2));
			}
		}else {
			hourValue = (hourValue % 12 + 12) % 24;
			twentyFourFormatTimeString.append(String.format("%02d%s", hourValue, minSecondString));
		}
		
		System.out.println(twentyFourFormatTimeString.toString());
	}

}
