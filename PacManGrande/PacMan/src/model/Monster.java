package model;

import Entity.Entity;
import processing.core.PApplet;

/**
 * @author 183641
 */

public class Monster extends Entity {
	
	public Monster(String status, int color, int speed, int size, int xEnt, int yEnt, PApplet window) {
		super(status, color, speed, size, xEnt, yEnt, window);
		// TODO Auto-generated constructor stub
	}

	private String status;
	private int evilTime;
	private int sadTime;
	
	public void draw() {
		//Draw Monsters
		
	}
	
}
