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
		private int game = 0;
		private int totalScore;
		private int pacManLives;
		final int tileSize = 20;
		int rows, columns;
		Entity entity;
		Paco paco;
		Tile tile;
		List<Tile> tiles;
		private ArrayList<Entity> kiMonster;
		boolean isWall;
		boolean hasPickUps = false;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Map");
		
	}
	
	/*
	public void createPaco() {
		tiles.get(31).set();
	}
	*/
	
	public void settings() {
		//Fenster wird generiert mit der Grösse 1200x800
		size(600,400);
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
			isWall = walls.contains(i);
			hasPickUps = !isWall;
			
			tiles.add(new Tile(tileSize, i, isWall, hasPickUps));
			}
	}
	
	public void draw() {
		//Fensterfarbe Schwarz
		this.background(0);
		//SPIEL STARTEN VIA KNOPFDRUCK
				if(game==0) {
					fill(255);
					textSize(50);
					text("PRESS ANY KEY TO START THE GAME!",100,450);
						
				}
				//Prüft wenn ein Knopf gedrückt wird und ändert den Status zu game = 1 (spiel gestartet)
				if(keyPressed){
					game=1;
				}
				//hier wird der Code für das Spiel implementiert
				if(game==1) {					
					//Tiles zeichnen
					tiles.forEach(t -> t.draw(this));
					
					Paco paco = new Paco("", 255, 20, 31);
							
					/*
					//Score Text
					fill(255);
					textSize(32);
					text("score", 10,  40);
					*/
					
					/*
					//KIMonster aus ArrayList zeichnen
					for(Entity m: kiMonster) {
						m.draw();
					}
					*/					
				}
				
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
