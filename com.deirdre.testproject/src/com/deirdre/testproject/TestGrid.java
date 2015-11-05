package com.deirdre.testproject;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGrid {
	
Dice dice;
Grid grid;
Point current;
int a = 10;
int b = 10;
	
	@Before
	public void setUp(){
		dice = new Dice();
		grid = new Grid(a,b);	}

	@Test
	public void testGrid() {
		
		
			for (int x=0; x < a; x++){
				 for (int y=0; y<b; y++){
					 ;
					 Direction direction = dice.roll();
					 current = new Point(x,y);
					 System.out.println("current point: " + current);
					Assert.assertTrue(grid.testDirection(current,direction)==true
					|| grid.testDirection(current,direction)==false);
				 }
		}
		
			}
}
