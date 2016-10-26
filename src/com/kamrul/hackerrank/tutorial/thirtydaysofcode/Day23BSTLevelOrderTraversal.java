package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23BSTLevelOrderTraversal {

	public static void main(String[] args) {
		Day23BSTLevelOrderTraversal bstLevelOrder = new Day23BSTLevelOrderTraversal();
		bstLevelOrder.run();
	}
	
	class Node{
	    Node left, right;
	    int data;
	    
	    Node(int data) {
	        this.data = data;
	        left = right = null;
	    }
	}
	
	public Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }        
        
        Node cur;
        if(data <= root.data) {
            cur = insert(root.left, data);
            root.left = cur;
        } else {
            cur = insert(root.right, data);
            root.right = cur;
        }
        
        return root;
    }
	
	public void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node u = queue.poll();
			System.out.print(u.data + " ");
			if(u.left != null) queue.add(u.left);
			if(u.right != null) queue.add(u.right);
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while(T--> 0){
            int data = sc.nextInt();
            root = insert(root,data);
        }
        sc.close();
        
        levelOrder(root);
	}

}
