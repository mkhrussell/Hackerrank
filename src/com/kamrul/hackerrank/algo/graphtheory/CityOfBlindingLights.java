package com.kamrul.hackerrank.algo.graphtheory;

import java.util.*;

public class CityOfBlindingLights {

	public static void main(String[] args) {
		CityOfBlindingLights sol = new CityOfBlindingLights();
		sol.run();		
	}
	
	Scanner in;
	
	void run() {
		in = new Scanner(System.in);		
		takeInput();
		calculateMinimumDistances();
		answerQueries();
	}

	int N, M, Q;
	int[][] graph;
	final int INF = 1000000;
	
	void takeInput() {
		N = in.nextInt();
		graph = new int[N][N];
		fillBuildMap(INF);
		
		M = in.nextInt();
		for(int i = 0; i < M; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int r = in.nextInt();

			x = x - 1;
			y = y - 1;
			graph[x][y] = r;
		}		
	}
	
	void calculateMinimumDistances() {
		for(int k = 0; k < N; k++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					graph[i][j] = min(graph[i][j], graph[i][k] + graph[k][j]);
				}
			}
		}
	}

	private void answerQueries() {
		Q = in.nextInt();
		for(int i = 0; i < Q; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			x = x - 1;
			y = y - 1;
			if(graph[x][y] < INF)
				System.out.println("" + graph[x][y]);
			else
				System.out.println("-1");
		}
	}
	
	int min(int a, int b) {
		return a <= b ? a : b;
	}
	
	void fillBuildMap(int value) {
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				graph[i][j] = value;
			}
		}
	}
}