package model;

import processing.core.PApplet;

/**
 * @author 183641
 */

public abstract class Entity implements Draw {
	private String status;
	private int color;
	protected int speed;
	protected int size;
	private int index;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * 
	 * @param status
	 * @param color
	 * @param size
	 * @param index
	 */
	// Konstruktor um Klassenvariablen zu inizialisieren
	public Entity(String status, int color, int size, int index) {
		this.status = status;
		this.setSize(20);
		this.setColor(color);
		this.index = index;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}