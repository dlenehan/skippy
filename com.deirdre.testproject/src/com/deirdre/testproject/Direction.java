package com.deirdre.testproject;

import java.util.Random;


public enum Direction {
    NORTH, EAST, SOUTH, WEST;
    private static Random rnd = new Random();
 
    static public Direction randomDirection() {
        return Direction.values()[rnd.nextInt(4)];
    }


}