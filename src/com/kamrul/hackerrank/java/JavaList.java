package com.kamrul.hackerrank.java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			numList.add(sc.nextInt());
		}
		
		int Q = sc.nextInt();
		for(int q = 0; q < Q; q++) {
			String command = sc.next();			
			if(command.equals("Insert")) {
				int index = sc.nextInt();
				int value = sc.nextInt();
				numList.add(index, value);
			}else if(command.equals("Delete")) {
				int index = sc.nextInt();
				numList.remove(index);
			}
		}
		
		for(Integer num : numList) {
			System.out.print(num.toString() + " ");
		}
		System.out.println();
		
		sc.close();
	}

}
