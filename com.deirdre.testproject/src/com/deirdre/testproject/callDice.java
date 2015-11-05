package com.deirdre.testproject;

import java.awt.Point;
import java.util.Hashtable;

public class callDice {

	public static void main(String[] args) {
		
		Direction direction;
		Point end = new Point(5,5);
		Point current = new Point(0,0);

		
		Dice dice = new Dice();
		Grid gr = new Grid(10,10);
		Kangaroo kangaroo = new Kangaroo();
		
		
		while(current.equals(end)==false ) 
		{
			direction = dice.roll();     
			System.out.println("Dice roll: " + direction);
			if (gr.testDirection(current,direction)==true){
			   current = kangaroo.hop(current,direction);
			        if (current.equals(end)) {
				       System.out.println("Hurray Skippy's home!");
			           }
		    }
			else {System.out.println("Outside the boundary, roll again!");}
		}
			
		Hashtable<Direction, Integer> hm = dice.getStats();
		Hashtable<Direction, Double> prcnt = dice.getPerc();
		System.out.println("Total number of hops: " + hm);
		System.out.println("Percentage hops in each direction: " + prcnt);
	}
	
	}





