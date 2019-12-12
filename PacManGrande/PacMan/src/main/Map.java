package main;


import java.util.ArrayList;
import java.util.List;

import model.Entity;
import model.Paco;
import model.Tile;
import processing.core.PApplet;
import tools.MapReader;

public class Map extends PApplet{	
	//Status Variable für Spielstart / Ende / Pause
		//private int game = 0;
		private int totalScore;
		private int lives;
		final int tileSize = 20;
		int rows, columns;
		Entity entity;
		Paco paco;
		Tile tile;
		List<Tile> tiles;
		private ArrayList<Entity> kiMonster;
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Map");
		
	}	
	
	public void settings() {
		//Fenster wird generiert mit der Grösse 1200x800
		size(1200,800);
	}
	
	/**
	 * Funktion die den Index in der console ausgibt wenn man ein Tile anklickt
	 */
	public void mouseClicked() {
		int tileIndex = mouseX / tileSize + (mouseY / tileSize) * columns;
		System.out.println(tileIndex);
	}	
	
	public void setup() {
		
		/**
		 * hier wird das File paco_map.txt eingelesen und basierend auf die indexes im File
		 * entschieden welche Indexes als Walls gelten
		 */
		List<Integer> walls = MapReader.getMap("resource/paco_map.txt");
		
		rows = height / tileSize;
		columns = width / tileSize;
		tiles = new ArrayList<Tile>();
		for (int i=0; i < rows * columns; i++) {
			boolean isWall = walls.contains(i);
			/*Schleife die Prüft ob ein Tile ein PickUp besitzt oder nicht, wenn ja score addieren sonst nichts
			boolean hasPickUps = false;
			if(hasPickUps == true) {
				paco.score = paco.score + 100;
			}
			else {
				paco.score = paco.score + 0;
			}
			*/
			tiles.add(new Tile(tileSize, i, isWall/*, hasPickUps*/));		}
	}
	
	public void draw() {		
		//Änder die Farbe des Fensters auf Schwarz
		this.background(0);		
		
		//Tiles zeichnen
		tiles.forEach(t -> t.draw(this));
		
		/* HIER MÜSSTEN DIE PACOS UND MONSTER GEZEICHNET WERDEN
		paco.drawPaco();
		monster.drawMonster1();
		monster.drawMonster2();
		monster.drawMonster3();
		*/
		
		/*
		//Score Text
		fill(255);
		textSize(32);
		text("score", 10,  40);
		*/
		
		/*
		//KIRobis aus ArrayList zeichnen
		for(Entity m: kiMonster) {
			m.draw();
		}
		*/
		
		
		/*
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
		*/
	}
	
	/*
	public void keyPressed() {
		//println(keyCode);
		switch(keyCode) {
		case UP: entity.moveUp(); break;
		case DOWN: entity.moveDown(); break;
		case RIGHT: entity.moveRight(); break;
		case LEFT: entity.moveLeft(); break;
		}
	}
	*/
}
