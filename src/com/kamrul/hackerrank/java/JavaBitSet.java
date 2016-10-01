package com.kamrul.hackerrank.java;

import java.util.*;

public class JavaBitSet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();		
		BitSet bs1 = new BitSet(n);
		BitSet bs2 = new BitSet(n);
		
		for(int i = 0; i < m; i++) {
			String operation = in.next();
			int nFirst = in.nextInt();
			int nSecond = in.nextInt();
			
			if(operation.equals("AND")) {
				if(nFirst == 1) {
					bs1.and(bs2);
				}else {
					bs2.and(bs1);
				}
			}else if(operation.equals("OR")) {
				if(nFirst == 1) {
					bs1.or(bs2);
				}else {
					bs2.or(bs1);
				}
			}else if(operation.equals("XOR")) {
				if(nFirst == 1) {
					bs1.xor(bs2);
				}else {
					bs2.xor(bs1);
				}
			}else if(operation.equals("FLIP")) {
				if(nFirst == 1) {
					bs1.flip(nSecond);
				}else {
					bs2.flip(nSecond);
				}
			}else if(operation.equals("SET")) {
				if(nFirst == 1) {
					bs1.set(nSecond);
				}else {
					bs2.set(nSecond);
				}
			}
			
			System.out.println(bs1.cardinality() + " " + bs2.cardinality());
		}
		
		in.close();
	}

}
