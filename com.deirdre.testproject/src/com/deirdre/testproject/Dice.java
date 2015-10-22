package com.deirdre.testproject;

import java.util.Enumeration;
import java.util.Hashtable;


public class Dice {
	private int count;
	private int total;
	private final int MAX = 4;
	Direction direction;

	private Hashtable<Direction, Integer> statistics;
	private Hashtable<Direction, Double> percentStatistics;
	Enumeration<Direction> directions;

	public Dice() {
		count = 0;
		total = 0;
		statistics = new Hashtable<Direction, Integer>();
		statistics.put(Direction.NORTH, new Integer(0));
		statistics.put(Direction.SOUTH, new Integer(0));
		statistics.put(Direction.EAST, new Integer(0));
		statistics.put(Direction.WEST, new Integer(0));

		percentStatistics = new Hashtable<Direction, Double>();
		percentStatistics.put(Direction.SOUTH, new Double(0));
		percentStatistics.put(Direction.NORTH, new Double(0));
		percentStatistics.put(Direction.EAST, new Double(0));
		percentStatistics.put(Direction.WEST, new Double(0));

	}

	
	public Hashtable<Direction, Double> getPerc() {
		return percentStatistics;
	}

	public Hashtable<Direction, Integer> getStats() {
		return statistics;
	}


	
	
    
	
	public Direction roll() {
		Direction direc = Direction.randomDirection();

		switch (direc) {
		case NORTH:
			total = ((Integer) statistics.get(Direction.NORTH)).intValue();
			statistics.put(Direction.NORTH, new Integer(total + 1));
			break;
		case SOUTH:
			total = ((Integer) statistics.get(Direction.SOUTH)).intValue();
			statistics.put(Direction.SOUTH, new Integer(total + 1));
			break;
		case EAST:
			total = ((Integer) statistics.get(Direction.EAST)).intValue();
			statistics.put(Direction.EAST, new Integer(total + 1));
			break;
		case WEST:
			total = ((Integer) statistics.get(Direction.WEST)).intValue();
			statistics.put(Direction.WEST, new Integer(total + 1));
			break;
		default:
			break;

		}

		count = count + 1;
		directions = statistics.keys();
		while (directions.hasMoreElements()) {
			direction = directions.nextElement();
			percentStatistics.put(direction,
					(double) ((Integer) (statistics.get(direction).intValue()) * 100)
					/ count);
		}
		System.out.println();


		return direc;
	}

	


}
