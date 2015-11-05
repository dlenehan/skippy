package com.deirdre.testproject;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceTest<E> {
	
	Dice dice;
	
	@Before
	public void setUp(){
		dice = new Dice();
	}

	@Test
	public void testDice() {
		Direction direction = dice.roll();
		Assert.assertNotNull(direction);
		Assert.assertTrue(direction.name().equalsIgnoreCase("east") 
				|| direction.name().equalsIgnoreCase("west")
				|| direction.name().equalsIgnoreCase("north") 
				|| direction.name().equalsIgnoreCase("south"));

	}
	
	@Test
	public void testStats() {
		for (int i = 0; i < 1000 ; i++){
			dice.roll();
		}
		Hashtable<Direction, Integer> ht = dice.getStats();
		Collection<?> c = ht.values();
		
		int sum = 0;
		
		Iterator<?> it = c.iterator();
		while (it.hasNext()){
			sum += (int) it.next();
		}
		Assert.assertTrue(sum == 1000);
	
	}
	
	@Test
	public void testPerc() {
		for (int i = 0; i < 10; i++){
			dice.roll();
		}
		Hashtable<Direction, Double> pc = dice.getPerc();
		Collection<?> col = pc.values();
		
        double total = 0;
		
		Iterator<?> iter = col.iterator();
		while (iter.hasNext()){
			total += (double) iter.next();
		
		}
		System.out.println("total: " + total);
		Assert.assertTrue(total == 100.0);
}
}
