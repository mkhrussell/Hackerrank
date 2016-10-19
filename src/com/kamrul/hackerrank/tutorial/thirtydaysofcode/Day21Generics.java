package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

public class Day21Generics {

	public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Day21Generics.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
        
        
    }
	
	public static <Element> void printArray(Element[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}		
    }
}
