package com.gameanalyzer.gameList;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class GameList implements Serializable {
	private List<Game> allGames;

	public List<Game> getAllGames() {
		return allGames;
	}

	public void setAllGames(List<Game> allGames) {
		this.allGames = allGames;
	}

	@Override
	public String toString() {
		
		return "GameList [allGames Count=" + allGames.size() + "]";
	}
	
	
	

}
