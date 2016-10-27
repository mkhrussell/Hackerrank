package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day24MoreLinkedLists {
	
	class Node {
		int data;
		Node next;
		Node(int d) {
	        data = d;
	        next = null;
	    }
	}
	
	public Node insert(Node head, int data) {
        Node p = new Node(data);			
        if(head == null)
            head = p;
        else if(head.next == null)
            head.next = p;
        else {
            Node start = head;
            while(start.next != null)
                start = start.next;
            start.next = p;

        }
        
        return head;
    }
	
	public void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while(T--> 0) {
		    int ele = sc.nextInt();
		    head = insert(head, ele);
		}
		
		head = removeDuplicates(head);
		display(head);
		sc.close();
	}
	
	public Node removeDuplicates(Node head) {
		if (head == null) {
	        return null;
	    }
	    
	    Node start = head;
	    Node parent = null;
	    while (start != null) {
	        parent = start;
	        Node picked = parent.next;
	        while (picked != null) {
	            if (start.data == picked.data) {
	                parent.next = picked.next;
	                picked = parent.next;
	            } else {
	                parent = parent.next;
	                picked = picked.next;
	            }
	        }
	        start = start.next;
	    }
	    
	    return head;
	}

	public static void main(String[] args) {
		Day24MoreLinkedLists moreLinkedList = new Day24MoreLinkedLists();
		moreLinkedList.run();
	}

}
