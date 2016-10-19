package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.Scanner;

public class Day22BinarySearchTrees {
	
	class Node{
	    Node left,right;
	    int data;
	    
	    Node(int data){
	        this.data = data;
	        left = right = null;
	    }
	}
	
	public int getHeight(Node root){
		int left = 0, right = 0;
		if(root.left != null) {
			left++;
			left += getHeight(root.left);
		}
		
		if(root.right != null) {
			right++;
			right += getHeight(root.right);
		}
		
		return Math.max(left, right);
	}
	
	public Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        
        Node cur;
        if(data <= root.data){
            cur = insert(root.left, data);
            root.left = cur;
        } else {
            cur = insert(root.right, data);
            root.right = cur;
        }
        
        return root;
    }
	
	public void run() {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        Node root = null;
        while(T-- > 0){
            int data = sc.nextInt();
            root = insert(root, data);
        }
        sc.close();
        
        int height=getHeight(root);
        System.out.println(height);
	}
	
	public static void main(String[] args) {
		Day22BinarySearchTrees sol = new Day22BinarySearchTrees();
		sol.run();
	}
}
