package com.gameanalyzer.gameList;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;



public class GameList { 
	public List<Game> getAllGames() {
		return allGames;
	}

	public void setAllGames(List<Game> allGames) {
		this.allGames = allGames;
	}

	private List<Game> allGames;


}
