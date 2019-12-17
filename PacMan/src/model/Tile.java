package model;

import java.util.ArrayList;

import PickUps.PickUp;
import processing.core.PApplet;

/**
 * @author 183641
 */

public class Tile extends PApplet{
	private String type;
	boolean isWall;
	boolean hasPickUps;
	Entity entity;
	PickUp item;
	int size;
	int index;
	
	public Tile(int size, int index, boolean isWall, boolean hasPickUps) {
		this.size = size;
		this.index = index;
		this.isWall = isWall;
		this.hasPickUps = hasPickUps;
		/**
		 * @param tileSize
		 * @param index
		 * @param isWall
		 * @Param hasPickUps
		 */
	}
	
	public void draw(PApplet window){
		/**
		 * Spalten Berechnung anschlissend anhand index und Spalten die x und y Position
		 * der jeweiligen Tiles berechnet.
		 */
		int columns = window.width / size;		
		int x = index % columns * size;
		int y = index / columns * size;		
		
		/**
		 * Layer wird erstellt um darauf bestimmte Objekt zu "übermalen"
		 */
		window.pushMatrix();
		window.translate(x, y);
		window.stroke(0);
		window.strokeWeight(1);
		window.fill(55);
		
		if(isWall) {
			window.fill(0,0,0);	
		}
		
		window.rect(0,0,size,size);	
		
		if(hasPickUps) {
			window.fill(200,150,150);
			window.ellipse(size/2, size/2, size/2, size/2);
		}
		
		window.popMatrix(); //merge neuen Layer mit existierendem
	}
}
