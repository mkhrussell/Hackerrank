package com.kamrul.hackerrank.java;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> stack = new Stack<>();
		while(sc.hasNext()) {
			stack.clear(); // Reset previous result
			
			String input = sc.next();		
			boolean balanced = true;
			
			for(int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if(ch == '[' || ch == '{' || ch == '(')
					stack.push(ch);
				else if(!stack.isEmpty() && (ch == ']' || ch == '}' || ch == ')')) {
					if(stack.peek() == '[' && ch == ']')
						stack.pop();
					else if(stack.peek() == '{' && ch == '}')
						stack.pop();
					else if(stack.peek() == '(' && ch == ')')
						stack.pop();
					else {
						balanced = false;
						break;
					}
				}else {
					balanced = false;
					break;
				}
			}
			
			if(!stack.isEmpty()) {
				balanced = false;
			}
			
			System.out.println("" + balanced);
		}
		
		sc.close();
	}

}
