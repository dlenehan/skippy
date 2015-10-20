package com.deirdre.testproject;

import java.util.Enumeration;
import java.util.Hashtable;


public class Dice {
	private int count;
	private int total;
	private final int MAX = 4;
	String dir;

	private Hashtable<String, Integer> statistics;
	private Hashtable<String, Double> percentStatistics;
	Enumeration<String> directions;

	public Dice() {
		count = 0;
		total = 0;
		statistics = new Hashtable<String, Integer>();
		statistics.put("North", new Integer(0));
		statistics.put("South", new Integer(0));
		statistics.put("East", new Integer(0));
		statistics.put("West", new Integer(0));

		percentStatistics = new Hashtable<String, Double>();
		percentStatistics.put("North", new Double(0));
		percentStatistics.put("South", new Double(0));
		percentStatistics.put("East", new Double(0));
		percentStatistics.put("West", new Double(0));

	}

	
	public Hashtable<String, Double> getPerc() {
		return percentStatistics;
	}

	public Hashtable<String, Integer> getStats() {
		return statistics;
	}


	
	
    
	
	public Direction roll() {
		Direction direc = Direction.randomDirection();
		System.out.println("Direction rolled is: " + direc);
		// Store count of throws in each direction so far.

		switch (direc) {
		case NORTH:
			total = ((Integer) statistics.get("North")).intValue();
			statistics.put("North", new Integer(total + 1));
			break;
		case SOUTH:
			total = ((Integer) statistics.get("South")).intValue();
			statistics.put("South", new Integer(total + 1));
			break;
		case EAST:
			total = ((Integer) statistics.get("East")).intValue();
			statistics.put("East", new Integer(total + 1));
			break;
		case WEST:
			total = ((Integer) statistics.get("West")).intValue();
			statistics.put("West", new Integer(total + 1));
			break;
		default:
			break;

		}

		count = count + 1;
		directions = statistics.keys();
		while (directions.hasMoreElements()) {
			dir = (String) directions.nextElement();
			percentStatistics.put(dir,
					(double) ((Integer) (statistics.get(dir).intValue()) * 100)
					/ count);
		}
		System.out.println();


		return direc;
	}

	


}
