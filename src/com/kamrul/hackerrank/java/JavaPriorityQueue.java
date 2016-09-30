package com.kamrul.hackerrank.java;

import java.util.*;
import java.io.*;

public class JavaPriorityQueue {

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
		}catch(Exception e) {}
		
		Scanner in = new Scanner(System.in);
		int totalEvents = in.nextInt();
		in.nextLine();//
		
		Comparator<Student2> stComparator = new Comparator<Student2>() {			
			@Override
			public int compare(Student2 left, Student2 right) {
				if(right == left)
                    return 0;

                if(right.getCgpa() > left.getCgpa())
                    return 1;
                if(right.getCgpa() < left.getCgpa())
                    return -1;

                if(right.getCgpa() == left.getCgpa()) {
                    int nameCmp = left.getFname().compareTo(right.getFname());                    
                    if(nameCmp != 0)
                    	return nameCmp;
                    else
                    	return left.getToken() - right.getToken();
                }
                
                return 0;                
			}
		};
		
		PriorityQueue<Student2> stQue = new PriorityQueue<>(stComparator);				
		while(totalEvents > 0) {
			String event = in.next();
            if(event.equals("ENTER")) {
                String name = in.next();
                double cgpa = in.nextDouble();
                int token = in.nextInt();
                Student2 st = new Student2(token, name, cgpa);
                stQue.add(st);				
            }else if(event.equals("SERVED")) {
                stQue.poll();
            }			
            totalEvents--;
		}
		
		if(stQue.isEmpty()) {
			System.out.println("EMPTY");					
		}else {
			while(!stQue.isEmpty()) {
				System.out.println(stQue.poll().getFname());
			}
		}		
		in.close();
	}

}

class Student2 {
   private int token;
   private String fname;
   private double cgpa;
   public Student2(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}
