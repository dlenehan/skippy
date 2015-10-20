package com.deirdre.testproject;

import java.awt.Point;

public class Kangaroo {

	int x;
	int y;
	Point newloc;

	Kangaroo()
	{

	}

	public Point hop(Point current, Direction direction){

		if (direction == Direction.NORTH){
			newloc = new Point(current.x, current.y+1);

		}
		else if (direction == Direction.SOUTH){
			newloc = new Point(current.x, current.y-1);
		}
		else if (direction == Direction.EAST){
			newloc = new Point(current.x+1, current.y);

		}
		else if (direction == Direction.WEST){
			newloc = new Point(current.x-1, current.y);

		}
		return newloc;
	}
}