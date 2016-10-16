package com.kamrul.hackerrank.tutorial.thirtydaysofcode;

import java.util.HashMap;
import java.util.Scanner;

public class Day08DictionariesAndMaps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<>();
		
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            Integer phone = map.get(s);
            if(phone == null) {
            	System.out.println("Not found");
            }else {
            	System.out.println(s + "=" + phone);
            }
            
        }
        in.close();
	}

}
