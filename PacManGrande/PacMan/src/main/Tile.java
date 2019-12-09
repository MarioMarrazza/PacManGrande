package main;

import java.util.ArrayList;

import Entity.Entity;
import PickUps.PickUp;
import processing.core.PApplet;

/**
 * @author 183641
 */

public class Tile extends PApplet implements Draw{
	private String type;
	private int xTile;
	private int yTile;
	boolean istBegehbar;
	Entity entity;
	PickUp item;
	PApplet window;
	
	
	//private ArrayList<Tile> tiles;
	
	

	//Funktion um Tiles zu "überzeichnen"
	public void drawTile(PApplet window) {
		this.window = window;
		for (int i = 0; i < 60; i++) {			
			for (int j = 0; j < 40; j++) {
				window.rect(i * ((window.width)/60), j * ((window.height)/40), (window.width)/60, (window.width)/40);	
			}			
		}
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		/*
		 * 
		 */
		//In dieser DrawFunktion sollen nun die begehbaren und nicht begehbaren Tiles gezeichnet werden
		//Dies wird durch Berechnung der Position des Tiles gemacht
		
		
	}
	
	/*
	//Draw Funktionsaufruf
	public void draw() {
		for(Tile t : tiles) {
			drawTile();
			
		}
	}
	*/
	
	
	
	
	
	
}
