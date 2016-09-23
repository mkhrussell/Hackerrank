package com.kamrul.hackerrank.algo.search;

import java.util.Scanner;

public class CountLuck {
	
	public static void main(String[] args) {
		CountLuck sol = new CountLuck();
		sol.run();
	}

	class Point {
		int x, y;
		public Point(int i, int j) {
			x = i;
			y = j;
		}
	}

	Scanner sc = null;
	int T, nCase;
	
	private void run() {
		sc = new Scanner(System.in);
		T = sc.nextInt();
		for(nCase = 1; nCase <= T; nCase++) {
			takeInput();
			findSolution();
		}
	}

	int N, M, K;
	char[][] forest = null;
	
	Point startPoint = null;
	Point endPoint = null;
	
	private void takeInput() {
		N = sc.nextInt();
		M = sc.nextInt();
		forest = new char[N][M];
		
		for(int i = 0; i < N; i++) {
			String line = sc.next();
			for(int j = 0; j < line.length(); j++) {
				forest[i][j] = line.charAt(j);
				if(forest[i][j] == 'M'){
					startPoint = new Point(i, j);
				}
				
				if(forest[i][j] == '*') {
					endPoint = new Point(i, j);
				}
			}
		}
		
		K = sc.nextInt();
	}
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	int[] dx = {-1, 1,  0, 0};
	int[] dy = { 0, 0, -1, 1};
	boolean[][] visited = null;
	
	boolean isValid(int x, int y) {
		return (x >= 0 && x < N && y >= 0 && y < M && !visited[x][y] && forest[x][y] != 'X');
	}
	
	int optionCount(int x, int y) {
		int count = 0;
		
		for(int di = 0; di < 4; di++) {
			int r = x + dx[di];
			int c = y + dy[di];
			
			if(isValid(r, c)) {
				count++;
			}
		}
		
		return count;
	}
	
	private void findSolution() {
		visited = new boolean[N][M];
		
		if(dfs(startPoint.x, startPoint.y, K) > 0)
			System.out.printf("Impressed%n", nCase);
		else
			System.out.printf("Oops!%n", nCase);
	}
	
	private int dfs(int x, int y, int guessCount) {
		if(visited[x][y])
			return -1;
		
		visited[x][y] = true;
		
		if(x == endPoint.x && y == endPoint.y && forest[x][y] == '*') {
			if(guessCount <= 0) {
				return 1;
			}
		}
		
		int options = optionCount(x, y);
		if(options <= 0)
			return -1;
		
		int ret = -1;
		
		for(int di = 0; di < 4; di++) {
			int r = x + dx[di];
			int c = y + dy[di];			
			
			if(isValid(r, c)) {
				if(options > 1) {
					if(guessCount <= 0)
						return -1;
					
					ret = max(ret, dfs(r, c, guessCount - 1));
				}else {
					ret = max(ret, dfs(r, c, guessCount));
				}				
			}
		}
		
		return ret;
	}
}
