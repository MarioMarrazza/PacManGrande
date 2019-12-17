package model;

import processing.core.PApplet;


/**
 * PacMan Subklasse erbt von der Klasse Entity
 * Hier wird der PacMan gezeichnet und die Bewegung implementiert
 * @author 183641
 *
 */

public class Paco extends Entity{
	int killstreak;
	public int score;
	
	/**
	 * 
	 * @param status
	 * @param color
	 * @param size
	 * @param index
	 */
	public Paco(String status, int color, int size, int index) {
		super(status, color, size, index);
	}
		
	
	public void draw(PApplet window) {
		int columns = window.width / size;
		int x = getIndex() % columns * size;
		int y = getIndex() / columns * size;		
		
		/**
		 * PacMan wird gezeichnet
		 */
		window.stroke(100,100,100);
		window.fill(255,255,0);
		window.circle(x-(size), y-(size), size*0.8f);
	}
}
