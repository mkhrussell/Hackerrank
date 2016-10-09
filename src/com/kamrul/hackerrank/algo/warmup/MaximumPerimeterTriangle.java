package com.kamrul.hackerrank.algo.warmup;

import java.util.*;

public class MaximumPerimeterTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] nums = new long[n];
		for(int i = 0; i < n; i++) {
			nums[i] = in.nextLong();
		}
		in.close();
		
		if(n < 3) {
			System.out.println("-1");
			return;
		}
		
		Arrays.sort(nums);
		
		long maxPerimeter = 0;
		int maxPerimeterStartIndex = -1;
		for(int i = 0; i < n - 2; i++) {
			long perimeter = nums[i] + nums[i+1] + nums[i+2];
			if(nums[i] + nums[i+1] > nums[i+2] && perimeter >= 3) {
				if(perimeter >= maxPerimeter) {
					maxPerimeter = perimeter;
					maxPerimeterStartIndex = i;
				}
			}
		}
		
		if(maxPerimeterStartIndex > -1) {
			System.out.println(nums[maxPerimeterStartIndex] + " " + nums[maxPerimeterStartIndex + 1] + " " + nums[maxPerimeterStartIndex + 2]);
		}else {
			System.out.println("-1");
		}
	}

}
