package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day13AbstractClasses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String title=sc.nextLine();
	    String author=sc.nextLine();
	    int price=sc.nextInt();
	    sc.close();
	    Book new_novel=new MyBook(title, author, price);
	    new_novel.display();
	}

}

abstract class Book
{
	String title;
    String author;
    Book(String t, String a) {
        title=t;
        author=a;
    }
    abstract void display();
}

class MyBook extends Book {
	int price;
	
	public MyBook(String t, String a, int p) {
		super(t, a);
		this.price = p;
	}

	@Override
	void display() {
		System.out.printf("Title: %s%nAuthor: %s%nPrice: %d%n", title, author, price);		
	}
}
