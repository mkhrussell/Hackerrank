package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day04ClassVsInstance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person_ClassVsInstance p = new Person_ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
	}
}

class Person_ClassVsInstance {
	private int age;
	
	public Person_ClassVsInstance(int initialAge) {
		if(initialAge >= 0) {
			this.age = initialAge;
		}else {
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
		}
	}
	
	public void yearPasses() {
		age++;
	}
	
	public void amIOld() {
		String ans = "";
		if(age < 13) {
			ans = "You are young.";
		}else if(age >= 13 && age < 18) {
			ans = "You are a teenager.";
		}else {
			ans = "You are old.";
		}
		
		System.out.println(ans);
	}
}