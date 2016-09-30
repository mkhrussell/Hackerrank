package com.kamrul.hackerrank.java;

//import java.io.FileInputStream;
import java.util.Scanner;

public class Java1DArrayPart2 {

	public static void main(String[] args) {
		Java1DArrayPart2 sol = new Java1DArrayPart2();
		sol.run();
	}

	final int VALID = 0;
	final int INVALID = 1;
	
	Scanner sc = null;
	
	int T, N, M, nCase;
	int[] givenArray;
	
	private void run() {
//		try {
//			System.setIn(new FileInputStream("input.txt"));
//		}catch(Exception e) {}
		
		sc = new Scanner(System.in);
		T = sc.nextInt();
		for(nCase = 1; nCase <= T; nCase++) {
			takeInput();
			
			possible = false; // Reset
			dfs(0, givenArray);
			if(possible)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}

	int[] dx = null;
	
	boolean isValid(int x) {
		return (x >= 0 && x < N && givenArray[x] == VALID) || x >= N;
	}
	
	private void takeInput() {
		N = sc.nextInt();
		M = sc.nextInt();
		givenArray = new int[N];		
		dx = new int[] {-1, 1, M};
		
		for(int n = 0; n < N; n++) {
			givenArray[n] = sc.nextInt();
		}
	}
	
	boolean possible = false;
	
	void dfs(int pos, int[] array) {
		if(possible)
			return;
		
		if(pos >= N) {
			possible = true;
			return;
		}
		
		if(array[pos] == INVALID)
			return;
		
		array[pos] = INVALID;
		for(int di = 0; di < dx.length; di++) {
			int x = pos + dx[di];
			if(isValid(x)) {
				dfs(x, array);
			}
		}
	}
}
