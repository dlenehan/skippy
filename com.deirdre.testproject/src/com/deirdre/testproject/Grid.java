package com.deirdre.testproject;

import java.awt.Point;

public class Grid
{
	
	   private int x, y;   
	   Point bndryPt;
	   boolean success;
	   
	   
	   // Constructors
	   public Grid(int x, int y) {
	      this.x = x;
	      this.y = y;
	   }
	   public Grid() {    // default (no-arg) constructor
	      
	   }
	 
	   // Public getter and setter for private variables
	   public int getX() { 
	      return x; 
	   }
	   public void setX(int x) { 
	      this.x = x; 
	   }
	   public int getY() { 
	      return y; 
	   }
	   public void setY(int y) { 
	      this.y = y; 
	   }
	  
	   
	   public boolean testDirection(Point current,Direction direction)
	{
		success = true;
		if (direction == Direction.NORTH){
			System.out.println("Hopping North. ");
			if (current.x<0 || current.y+1<0
					|| current.x> (this.x-1) || current.y+1 > (this.x - 1)) {
				success = false;}
			
		}
		else if (direction == Direction.SOUTH){
			System.out.println("Hopping South. ");
			if (current.x<0 || current.y-1<0
					|| current.x> (this.x-1) || current.y-1 > (this.x-1)) {
				
				success = false;}
		}
		else if (direction == Direction.EAST){
			System.out.println("Hopping East. ");
			if (current.x+1<0 || current.y<0
					|| current.x+1 > (this.x-1) || current.y > (this.x -1)) {
				
				success = false;}
		}
		else if (direction == Direction.WEST){
			System.out.println("Hopping West. ");
			if (current.x-1<0 || current.y<0
					|| current.x-1> (this.x-1) || current.y > (this.x-1)) {
				success = false;
		}
		}
		
		return success;
	}
	}
