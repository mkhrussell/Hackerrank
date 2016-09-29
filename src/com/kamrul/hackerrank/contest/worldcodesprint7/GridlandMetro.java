package com.kamrul.hackerrank.contest.worldcodesprint7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GridlandMetro {

	public static void main(String[] args) {
		GridlandMetro sol = new GridlandMetro();
		sol.run();
	}
	
	class TrainTrack {
		long row, start, end;
		long length;
		
		public TrainTrack(long row, long start, long end) {
			this.row = row;
			this.start = start;
			this.end = end;
			length = Math.abs(end - start) + 1;
		}
	}
	
	class Row {
		ArrayList<TrainTrack> trainTracks = new ArrayList<>();
		void addTrack(TrainTrack track) {
			trainTracks.add(track);
		}
	}

	Scanner sc;
	long N, M, K, totalSpots;
	ArrayList<Row> rowsWithTracks = new ArrayList<>();
	Map<Long, Integer> rowToIndexMap = new HashMap<>();
		
	void run() {
		sc = new Scanner(System.in);
		takeInput();
		solve();
	}

	void takeInput() {
		N = sc.nextLong();
		M = sc.nextLong();
		K = sc.nextLong();
		
		totalSpots = N * M;
		
		rowsWithTracks.clear();
		rowToIndexMap.clear();
		
		for(int k = 0; k < K; k++) {
			Long row = sc.nextLong();
			long start = sc.nextLong();
			long end = sc.nextLong();
			
			row--;			
			start--;
			end--;
			
			if(start > end) {
				long tmp = start;
				start = end;
				end = tmp;
			}			
			
			TrainTrack track = new TrainTrack(row, start, end);
			Integer rowIndex = rowToIndexMap.get(row);
			
			Row currentRow = null;
			if(rowIndex == null) {
				currentRow = new Row();
				currentRow.addTrack(track);
				
				rowsWithTracks.add(currentRow);
				rowIndex = rowsWithTracks.indexOf(currentRow);
				
				rowToIndexMap.put(row, rowIndex);
			}else {
				currentRow = rowsWithTracks.get(rowIndex);
				currentRow.addTrack(track);
			}
		}
	}
	
	void solve() {
		
		long result = 0;		
		
		for(Row row : rowsWithTracks) {
			
			boolean[] processingDone = new boolean[row.trainTracks.size()];			
			for(int i = 0; i < row.trainTracks.size(); i++) {
				TrainTrack track = row.trainTracks.get(i);
				
				if(!processingDone[i]) {					
					processingDone[i] = true;
					result += track.length;
					
					// Find overlapped
					for(int j = 0; j < row.trainTracks.size(); j++) {
						TrainTrack otherTrack = row.trainTracks.get(j);
						
						if(!processingDone[j]) {
							
							// Full overlapped
							if(otherTrack.start >= track.start && otherTrack.end <= track.end) {
								processingDone[j] = true;
							}
							// Partial overlapped
							else if(otherTrack.start > track.start && otherTrack.start <= track.end && otherTrack.end > track.end) {
								result += Math.abs(otherTrack.end - track.end);
								processingDone[j] = true;
							}
						}
					}
				}
			}
		}				
		
		result = totalSpots - result;		
		System.out.println("" + result);
	}

}