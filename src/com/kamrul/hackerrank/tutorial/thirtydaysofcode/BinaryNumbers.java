package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String binaryString = Integer.toBinaryString(num);
		
		int maxNumOne = 0;
		int numOne = 0;
		for(int i = 0; i < binaryString.length(); i++) {
			char ch = binaryString.charAt(i);			
			if(ch == '1') {
				numOne++;
				if(numOne > maxNumOne){
					maxNumOne = numOne;
				}
			}
			else { // ch == '0'
				numOne = 0;
			}			
		}
		
		System.out.println("" + maxNumOne);		
		in.close();
	}

}
