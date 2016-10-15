package com.kamrul.hackerrank.algo.implementation;

import java.util.Scanner;

public class TheGridSearch {

	public static void main(String[] args) {
		TheGridSearch sol = new TheGridSearch();
		sol.run();
	}

	Scanner in;
	int numCase;
	
	char[][] grid;
	int R, C;
	char[][] pattern;
	int r, c;
	
	private void run() {
		in = new Scanner(System.in);
		int t = in.nextInt();
		for(numCase = 1; numCase <= t; numCase++) {
			takeInput();
			findSolution();
		}
	}

	private void takeInput() {
		R = in.nextInt();
		C = in.nextInt();
		grid = new char[R][C];
		
		for(int row = 0; row < R; row++) {
			String line = in.next();
			for(int col = 0; col < C; col++) {
				grid[row][col] = line.charAt(col);
			}
		}
		
		r = in.nextInt();
		c = in.nextInt();
		pattern = new char[r][c];
		
		for(int row = 0; row < r; row++) {
			String line = in.next();
			for(int col = 0; col < c; col++) {
				pattern[row][col] = line.charAt(col);
			}
		}
	}
	
	private void findSolution() {
		boolean isPatternFound = false;
		outer:
		for(int x = 0; x <= R - r; x++) {
			for(int y = 0; y <= C - c; y++) {
				if(patternFound(x, y)) {
					isPatternFound = true;
					break outer;
				}
			}
		}
		
		if(isPatternFound) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

	private boolean patternFound(int x, int y) {
		boolean matched = true;
		outer:
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(pattern[i][j] != grid[x + i][y + j]){
					matched = false;
					break outer;
				}
			}
		}
		
		return matched;
	}
}
