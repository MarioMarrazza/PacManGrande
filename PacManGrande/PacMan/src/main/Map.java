package main;


import java.util.ArrayList;

import Entity.Entity;
import Entity.Paco;
import processing.core.PApplet;

public class Map extends PApplet{	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Map");
		
		
	}
	
	// Hello Mario this is Kevin from the future. If you read this Ligma balls
	
	
	//Status Variable für Spielstart / Ende / Pause
	private int game = 0;
	private int totalScore;
	private int lives;
	Paco paco;
	Entity entity;
	private ArrayList<Entity> kiMonster;
	ArrayList<Tile> tiles;
	Tile tile;
	
	
	public void settings() {
		//Fenster wird generiert mit der Grösse 1200x800
		size(1200,800);
	}
	
	public void setup() {
		entity = new Entity (sketchOutputPath(), 0xffd38ca8, 20, 80, 20, 20, this);
		tile = new Tile();
		//ArrayList mit kiMonster füllen
		kiMonster= new ArrayList<Entity>();
		for(int i = 0; i < 3; i++) {
			kiMonster.add(new Entity(sketchOutputPath(), 0xffd38ca8, 20, 80, 20, 20, this));
		}
	}
	
	
	/**
	 * Funktion zum erzeugen eines Tiles (merhfach verwendbar)
	 */
	private void setupTiles() {
		int tileSize = 50;
		int tilesX = width/tileSize;
		int tilesY = height/tileSize;
		tiles = new ArrayList<Tile>();
		//Tiles werden basierend auf x und y  Position erzeugt solange bis das komplette Fenster voll mit tiles ist
		for (int i = 0; i <  tilesX*tilesY; i++) {
			int xPos = (i%tilesX)*50;
			int yPos = (i/tilesX)*50;
			//Tiles werden in die ArrayList hinzugefügt
			tiles.add(new Tile());
		}
	}
	
	public void draw() {		
		//Änder die Farbe des Fensters auf Schwarz
		this.background(0);
		
		//Funktionsaufruf der drawTiles Funktion
		tile.drawTile(this);		
		background(0);
		
		
		fill(255);
		textSize(32);
		text("score", 10,  40);
		entity.draw();
		//KIRobis aus ArrayList zeichnen
		for(Entity m: kiMonster) {
			m.draw();
		}
		
		
		
		
		/**
		//SPIEL STARTEN VIA KNOPFDRUCK
		if(game==0) {
			background(0);
			text("PRESS ANY KEY TO START THE GAME!",100,450);
			textSize(50);
		}
		//Prüft wenn ein Knopf gedrückt wird und ändert den Status zu game = 1 (spiel gestartet)
		if(keyPressed){
			game=1;
		}
		//hier wird der Code für das Spiel implementiert
		if(game==1) {
			
		}
		**/
	}
	
	public void keyPressed() {
		//println(keyCode);
		switch(keyCode) {
		case UP: entity.moveUp(); break;
		case DOWN: entity.moveDown(); break;
		case RIGHT: entity.moveRight(); break;
		case LEFT: entity.moveLeft(); break;
		}
	}

}
