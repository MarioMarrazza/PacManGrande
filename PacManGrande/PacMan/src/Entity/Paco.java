package Entity;

import java.awt.Color;

import javax.swing.text.AttributeSet.ColorAttribute;

import processing.core.PApplet;


/**
 * @author 183641
 */

public class Paco extends Entity implements Draw {
	public Paco(String status, int color, int speed, int size, int xEnt, int yEnt, PApplet window) {
		super(status, color, speed, size, xEnt, yEnt, window);
		// TODO Auto-generated constructor stub
	}
	int killstreak;
	
	
	/*
	public Paco(int killstreak){
		super(speed, size, color, xEnt, yEnt);
	}
	*/
	
	public void draw() {
		//Draw Paco
		
	}
	
	//Funktion Bewegung  
		public void moveUp() {
			setyEnt(PApplet.max(0, getyEnt() - getSpeed())); // oder if(y > 0) {y = y - speed} 
			//this.y = 150;
		}
		public void moveDown() {
			setyEnt(PApplet.min(window.height, getyEnt() + getSpeed()));  
		}
		public void moveLeft() {
			setxEnt(PApplet.max(0, getxEnt() - getSpeed()));  
		}
		public void moveRight() {
			setxEnt(PApplet.min(window.width, getxEnt() + getSpeed())); 
		}
}
