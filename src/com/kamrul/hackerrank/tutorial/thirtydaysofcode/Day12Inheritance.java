package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person {
	private int[] testScores;
	
	public Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}
	
	public char calculate() {
		double avgScore = 0.0;
		for(int i = 0; i < testScores.length; i++) {
			avgScore += (double) testScores[i];
		}
		avgScore = avgScore / testScores.length;
		
		char gradeChar = ' ';
		if(avgScore >= 90.0 && avgScore <= 100.0) {
			gradeChar = 'O';
		}else if(avgScore >= 80.0 && avgScore < 90.0) {
			gradeChar = 'E';
		}else if(avgScore >= 70.0 && avgScore < 80.0) {
			gradeChar = 'A';
		}else if(avgScore >= 55.0 && avgScore < 70.0) {
			gradeChar = 'P';
		}else if(avgScore >= 40.0 && avgScore < 55.0) {
			gradeChar = 'D';
		}else if(avgScore < 40.0) {
			gradeChar = 'T';
		}
		
		return gradeChar;
	}
}

public class Day12Inheritance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}

}



