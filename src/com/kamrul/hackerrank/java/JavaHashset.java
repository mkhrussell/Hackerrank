package com.kamrul.hackerrank.java;

import java.util.Scanner;
import java.util.HashSet;

public class JavaHashset {	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
		
		class Pair {
			private String pair_left = null;
			private String pair_right = null;
			
			public Pair(String pair_left, String pair_right) {
				this.pair_left = pair_left;
				this.pair_right = pair_right;
			}
			
			@Override
			public boolean equals(Object that) {
				if(that == this)
					return true;
				
				if(!(that instanceof Pair))
					return false;
				
				Pair thatPair = (Pair) that;
				if(thatPair.pair_left.equals(this.pair_left) && thatPair.pair_right.equals(this.pair_right))
					return true;
				else
					return false;
			}
			
			private int hash(Object... objects) {
				return java.util.Arrays.deepHashCode(objects);			
			}
			
			@Override
			public int hashCode() {
				return hash(this.pair_left, this.pair_right);
			}
			
		}
		
        HashSet<Pair> pairSet = new HashSet<>();
        for (int i = 0; i < t; i++) {
            pairSet.add(new Pair(pair_left[i], pair_right[i]));
            System.out.println("" + pairSet.size());
        } 

        s.close();
	}

}
