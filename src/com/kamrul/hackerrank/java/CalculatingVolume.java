package com.kamrul.hackerrank.java;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

public class CalculatingVolume {
	
	public static void main(String[] args) {
		DoNotTerminate.forbidExit();
		try {
			Calculate cal = new Calculate();
			int T = cal.get_int_val();
			while (T--> 0) {
				double volume = 0.0;
				int ch = cal.get_int_val();
				if (ch == 1) {
					int a = cal.get_int_val();
					volume = Calculate.do_calc().get_volume(a);
				}else if (ch == 2) {
					int l = cal.get_int_val();
					int b = cal.get_int_val();
					int h = cal.get_int_val();
					volume = Calculate.do_calc().get_volume(l, b, h);
				}else if (ch == 3) {
					double r = cal.get_double_val();
					volume = Calculate.do_calc().get_volume(r);
				}else if (ch == 4) {
					double r = cal.get_double_val();
					double h = cal.get_double_val();
					volume = Calculate.do_calc().get_volume(r, h);
				}
				cal.output.display(volume);
			}
		}catch (NumberFormatException e) {
			System.out.print(e);
		}catch (IOException e) {
		    e.printStackTrace();
		}
		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	} //end of main
} //end of Solution

class Calculate {
	private Scanner in = null;
	public Output output = new Output();
	
	public Calculate() {
		in = new Scanner(System.in);
	}
	
	public int get_int_val() throws IOException{
		if(in == null)
			throw new IOException();
		
		int ret = in.nextInt();
		if(ret <= 0) {
			throw new NumberFormatException("All the values must be positive\n");
		}
		return ret;		
	}
	
	public double get_double_val() throws IOException {
		if(in == null)
			throw new IOException();
		
		double ret = in.nextDouble();
		if(ret <= 0) {
			throw new NumberFormatException("All the values must be positive\n");
		}
		return ret;
	}
	
	public static Calculate do_calc() {		
		return new Calculate();
	}
	
	public double get_volume(int a) {
		return (double) (a * a * a);
	}
	
	public double get_volume(int l, int b, int h) {
		return (double) (l * b * h);
	}
	
	double get_volume(double r) {
		return (Math.PI * r * r * r *  2) / 3; 
	}
	
	double get_volume(double r, double h) {
		return Math.PI * r * r * h;		
	}
	
	class Output {
		void display(double volume) {
			System.out.printf("%.3f%n", volume);
		}
	}
}

/**
 *This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 *
 */
class DoNotTerminate {
	@SuppressWarnings("serial")
	public static class ExitTrappedException extends SecurityException {}
	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
} //end of Do_Not_Terminate
