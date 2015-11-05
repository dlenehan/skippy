package com.deirdre.testproject;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

public class TestKangaroo {

	Kangaroo kangaroo;
	Point current;
	Dice dice;
	int x,y;
	
	
	@Before
	public void setUp() throws Exception {
		
		kangaroo = new Kangaroo();
		current = new Point(0,0);
		dice = new Dice();
		
	}

	@Test
	public void testHop() {
		Direction direction = dice.roll();
		System.out.println("Direction " + direction);
		current = kangaroo.hop(current, direction);
		assertNotNull(current);
	}
	
	@Test
	public void testNorth(){
		Direction direction = Direction.NORTH;
		current = kangaroo.hop(current, direction);
		assertTrue(current.x ==0 && current.y == 1);
	}
	
	@Test
	public void testSouth(){
		Direction direction = Direction.SOUTH;
		current = kangaroo.hop(current, direction);
		assertTrue(current.x ==0 && current.y == -1);
	}
		
	@Test
	public void testEast(){
		Direction direction = Direction.EAST;
		current = kangaroo.hop(current, direction);
		assertTrue(current.x ==1 && current.y == 0);
	}
	
	@Test
	public void testWest(){
		Direction direction = Direction.WEST;
		current = kangaroo.hop(current, direction);
		assertTrue(current.x ==-1 && current.y == 0);
	}
	}


