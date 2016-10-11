package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
	}

}

class Difference {
	private int[] elements;
  	public int maximumDifference;
  	
  	public Difference(int[] a) {
  		this.elements = a;  		
  	}
  	
  	public void computeDifference() {
  		if(elements == null)
  			return;  			
  		if(elements.length <= 1)
  			return;
  		
  		int diff = 0;
  		for(int i = 0; i < elements.length - 1; i++) {
  			for(int j = i + 1; j < elements.length; j++) {
  				diff = Math.abs(elements[i] - elements[j]);
  				maximumDifference = Math.max(maximumDifference, diff);
  			}
  		}  		
  	}
}