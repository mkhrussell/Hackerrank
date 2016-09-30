package com.kamrul.hackerrank.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		List<Student> studentList = new ArrayList<Student>();
		
		while(testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		in.close();
		
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student left, Student right) {
				if(right == left)
					return 0;
				
				if(right.getCgpa() > left.getCgpa())
					return 1;
				if(right.getCgpa() < left.getCgpa())
					return -1;
				
				if(right.getCgpa() == left.getCgpa()) {
					if(right.getFname().equals(left.getFname())) {
						return left.getId() - right.getId();
					}
					
					return left.getFname().compareTo(right.getFname());
				}
				
				return 0;
			}
		});
		
		for(Student st: studentList) {
			System.out.println(st.getFname()); // + ", " + st.getCgpa() + "," + st.getId());
		}
	}
}

class Student {
   private int id;
   private String fname;
   private double cgpa;
   
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   
   public int getId() {
      return id;
   }
   
   public String getFname() {
      return fname;
   }
   
   public double getCgpa() {
      return cgpa;
   }
}
