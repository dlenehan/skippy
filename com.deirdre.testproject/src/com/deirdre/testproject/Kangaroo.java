package com.deirdre.testproject;

import java.awt.Point;


public class Kangaroo {

	Point bndryPt;
	int x;
	int y;


	public Point hop(Point current, int direction, char[][] grid) {


		if (direction == 1){
			System.out.println("Hopping North. ");
			if (current.x<0 || current.y+1<0
					|| current.x> (grid.length -1) || current.y+1 > (grid.length - 1)) {
				bndryPt = new Point(current.x, current.y+1);
				System.out.println("Oops, hit the boundary: " + "(" + bndryPt.x +","+ bndryPt.y +")");}
			else {
				current = new Point(current.x, current.y+1);
				System.out.println("Hopped to " + "(" + current.x + ","+ current.y + ")");}
		}
		else if (direction == 2) {
			System.out.println("Hopping South. ");
			if (current.x<0 || current.y-1<0
					|| current.x> (grid.length -1) || current.y-1 > (grid.length - 1)) {
				bndryPt = new Point(current.x, current.y-1);
				System.out.println("Oops, hit the boundary: " + "(" + bndryPt.x+","+bndryPt.y+")");}
			else {
				current = new Point(current.x, current.y-1);
				System.out.println("Hopped to " + "(" + current.x + ","+ current.y + ")");}

		}
		else if (direction == 3) {
			System.out.println("Hopping East. ");
			if (current.x+1<0 || current.y<0
					|| current.x+1 > (grid.length -1) || current.y > (grid.length - 1)) {
				bndryPt = new Point(current.x+1, current.y);
				System.out.println("Oops, hit the boundary: " + "(" + bndryPt.x +","+ bndryPt.y +")");}
			else {
				current = new Point(current.x+1, current.y);
				System.out.println("Hopped to " + "(" + current.x + ","+ current.y + ")");}
		}
		else if (direction == 4) {
			System.out.println("Hopping West. ");
			if (current.x-1<0 || current.y<0
					|| current.x-1> (grid[current.y].length -1) || current.y > (grid[current.x-1].length - 1)) {
				bndryPt = new Point(current.x-1, current.y);
				System.out.println("Oops, hit the boundary: " + "(" + bndryPt.x +","+ bndryPt.y +")");}
			else
			{ current = new Point(current.x-1, current.y);
			System.out.println("Hopped to " + "(" + current.x + ","+ current.y + ")");}
		}
		return current;

	}

}





