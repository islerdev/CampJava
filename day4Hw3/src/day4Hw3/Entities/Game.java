package day4Hw3.Entities;

import day4Hw3.Abstract.Entity;

public class Game implements Entity {
	private int id;
	private int gameId;
	private String gameName;
	private double gamePrice;
	
	public Game() {
		
	}
	
	public Game(int id, int gameId, String gameName, double gamePrice) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
}
