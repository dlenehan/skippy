package com.deirdre.testproject;


import java.awt.Point;
import java.util.Hashtable;

public class callDice {

	public static void main(String args[]) {
		int direction = 0;
		Dice d1 = new Dice();
		Point start = new Point(0,0);
		Point end = new Point(5,5);
		char[][] grid = new char[7][7];
		Point current = new Point(0,0);
		Kangaroo skippy = new Kangaroo();

		while(current.equals(end)==false ) {
			direction = d1.roll();        
			current = skippy.hop(start, direction, grid);
			start = current;
			if (current.equals(end)) {
				System.out.println("Hurray Skippy's home!");
			}
		}
		Hashtable<String, Integer> hm = d1.getStats();
		Hashtable<String, Double> prcnt = d1.getPerc();
		System.out.println("Total number of hops: " + hm);
		System.out.println("Percentage hops in each direction: " + prcnt);
	}
	public callDice() {


	}
}


