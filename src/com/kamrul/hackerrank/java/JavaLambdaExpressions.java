package com.kamrul.hackerrank.java;

public class JavaLambdaExpressions {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		JLE_MyMath ob = new JLE_MyMath();
		JLE_PerformOperation op;

		boolean ret = false;
		String ans = null;
		
		int ch = 3;
		int num = 292;
		
		if(ch == 1) {
			op = ob.is_odd();
			ret = ob.checker(op, num);
			ans = ret ? "ODD" : "EVEN";
		}else if(ch == 2) {
			op = ob.is_prime();
			ret = ob.checker(op, num);
			ans = ret ? "PRIME" : "COMPOSITE";
		}else if(ch == 3) {
			op = ob.is_palindrome();
			ret = ob.checker(op, num);
			ans = ret ? "PALINDROME" : "NOT PALINDROME";
		}
		
		System.out.println(ans);
	}

}

interface JLE_PerformOperation {
	boolean check(int a);
}

class JLE_MyMath {
	public static boolean checker(JLE_PerformOperation p, int num) {
		return p.check(num);
	}

	public JLE_PerformOperation is_palindrome() {
		return (num) -> {
			String normal = "" + num;
			String reverse = "";
			for(int i = normal.length() - 1; i >= 0; i--) {
				reverse += normal.charAt(i);
			}
			
			return normal.equals(reverse);
		};
	}

	public JLE_PerformOperation is_prime() {
		return (num) -> {
			if(num == 1)
				return false;
			
			if(num == 2)
				return true;
			
			if(num % 2 == 0)
				return false;
			
			int lim = (int) Math.sqrt(num);
			for(int i = 3; i <= lim; i = i + 2) {
				if(num % i == 0)
					return false;
			}
			
			return true;
		};
	}

	public JLE_PerformOperation is_odd() {
		return (num) -> {
			return (num % 2 == 1);
		};
	}
	
	
}