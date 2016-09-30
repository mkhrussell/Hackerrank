package com.kamrul.hackerrank.java;

//import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import java.util.HashSet;

public class JavaDequeue {

	public static void main(String[] args) {
//		try {
//			System.setIn(new FileInputStream("input.txt"));
//		}catch (Exception e) {}
		
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		
		HashSet<Integer> numSet = new HashSet<>();
		int max = Integer.MIN_VALUE;
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			numSet.add(num);			
			if(deque.size() == m) {				
				max = Math.max(max, numSet.size());				
				int rmv = deque.remove();
				if(!deque.contains(rmv)) {
					numSet.remove(rmv);
				}				
			}
		}
		System.out.println("" + max);
		
		in.close();
	}

}
