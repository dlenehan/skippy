package com.deirdre.testproject;

import java.util.Enumeration;
import java.util.Hashtable;

public class Dice {

	private int faceValue;
	private int count;
	private int total;
	private final int MAX = 4;
	String dir;

	private Hashtable<String, Integer> statistics;
	private Hashtable<String, Double> percentStatistics;
	Enumeration<String> directions;

	public Dice() {
		faceValue = -1;
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

	public int getFaceValue() {
		return faceValue;
	}

	public Hashtable<String, Double> getPerc() {
		return percentStatistics;
	}

	public Hashtable<String, Integer> getStats() {
		return statistics;
	}

	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		// Store count of throws in each direction so far.

		switch (faceValue) {
		case 1:
			total = ((Integer) statistics.get("North")).intValue();
			statistics.put("North", new Integer(total + 1));
			break;
		case 2:
			total = ((Integer) statistics.get("South")).intValue();
			statistics.put("South", new Integer(total + 1));
			break;
		case 3:
			total = ((Integer) statistics.get("East")).intValue();
			statistics.put("East", new Integer(total + 1));
			break;
		case 4:
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


		return faceValue;
	}

	public void setFaceValue(int value) {
		faceValue = value;
	}

}



