package Entity;

import model.Draw;
import processing.core.PApplet;

/**
 * @author 183641
 */

public class Entity implements Draw {
	private String status;
	private int color;
	protected int speed;
	private int size;
	protected int xEnt;
	protected int yEnt;
	PApplet window;

	//Konstruktor um Klassenvariablen zu inizialisieren
	public Entity(String status, int color, int speed, int size, int xEnt, int yEnt, PApplet window) {
		this.status = status;
		this.setSpeed(20);
		this.setSize(20);
		this.setxEnt(xEnt);
		this.setyEnt(yEnt);
		this.setColor(color);
		this.window = window;
	}

	public void draw() {
		window.fill(color);
		window.stroke(color);
		window.circle(xEnt-(size), yEnt-(size), size);
	}
	
	//Funktion Bewegung
		public void moveUp() {
			this.yEnt = PApplet.max(0, yEnt - speed); // oder if(y > 0) {y = y - speed} 
			//this.y = 150;
		}
		public void moveDown() {
			this.yEnt = PApplet.min(window.height, yEnt + speed);  
		}
		public void moveLeft() {
			this.xEnt = PApplet.max(0, xEnt - speed);  
		}
		public void moveRight() {
			this.xEnt = PApplet.min(window.width, xEnt + speed); 
		}


	public int getColor() {
		return color;
	}


	public void setColor(int color) {
		this.color = color;
	}


	public int getxEnt() {
		return xEnt;
	}


	public void setxEnt(int xEnt) {
		this.xEnt = xEnt;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	protected int getyEnt() {
		return yEnt;
	}


	public void setyEnt(int yEnt) {
		this.yEnt = yEnt;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}