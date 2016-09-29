package com.kamrul.hackerrank.java;

import java.util.*;

class Player {
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player left, Player right) {
		if(left == right)
			return 0;
		
		if(right.score > left.score)
			return 1;
		if(right.score < left.score)
			return -1;
        
        if(right.score == left.score) {
            return -right.name.compareTo(left.name);
        }
		
		return 0;
	}	
}

public class JavaComparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
	}

}
