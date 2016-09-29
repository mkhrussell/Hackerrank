package com.kamrul.hackerrank.java;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();// Line
		HashMap<String, String> phoneBook = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String name = sc.nextLine().trim();
			String number = sc.nextLine().trim();
			phoneBook.put(name, number);
		}
		
		while(sc.hasNextLine()) {
			String name = sc.nextLine().trim();
			if(!name.isEmpty()) {
				String number = phoneBook.get(name);
				if(number != null) {
					System.out.println(name + "=" + number);
				}else {
					System.out.println("Not found");
				}
			}
		}
		sc.close();
	}

}
