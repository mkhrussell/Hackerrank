package com.kamrul.hackerrank.algo.implementation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int clouds[] = new int[n];
        for(int cIndx=0; cIndx < n; cIndx++){
            clouds[cIndx] = in.nextInt();
        }
        in.close();
        
        System.out.printf("%d%n", getRemainingEnergy(n, k, clouds, 0, 100));
	}

	private static int getRemainingEnergy(int n, int k, int[] clouds, int i, int energy) {
		if(energy < 0) { // Energy is negative, no need to run further
			return Integer.MIN_VALUE;
		}
		
		if(i > 0 && (i % n == 0)) { // Back to '0th' position
			return energy;
		}
		
		if(i > n) {
            i = i % n; // Reset 'i' for stopping integer overflow
        }
		
		int ret = Integer.MIN_VALUE;		
		if(clouds[(i + k) % n] == 0) { // Normal cloud
			ret = Math.max(ret, getRemainingEnergy(n, k, clouds, i + k, energy - 1));
		}else { // Thunder cloud
			ret = Math.max(ret, getRemainingEnergy(n, k, clouds, i + k, energy - 3));
		}		
		return ret;
	}

}
