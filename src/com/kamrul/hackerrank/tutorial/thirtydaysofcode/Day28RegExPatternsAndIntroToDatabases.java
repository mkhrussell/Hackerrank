package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28RegExPatternsAndIntroToDatabases {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pattern = "(.*) (.*)@gmail.com";
		int N = in.nextInt();
		in.nextLine();
		PriorityQueue<String> names = new PriorityQueue<>();
		while(N-- > 0) {
			String line = in.nextLine().trim();			
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(line);
			if(m.find()) {
				names.add(m.group(1));
			}
		}
		while(!names.isEmpty()) {
			System.out.println(names.poll());
		}
		in.close();
	}

}
