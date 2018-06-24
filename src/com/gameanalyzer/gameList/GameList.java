package com.gameanalyzer.gameList;

import java.util.HashMap;
import java.util.List;

public class GameList {
	private List<HashMap<String,Integer>> gamesWithYear;
	public List<HashMap<String, Integer>> getGamesWithYear() {
		return gamesWithYear;
	}
	public void setGamesWithYear(List<HashMap<String, Integer>> gamesWithYear) {
		this.gamesWithYear = gamesWithYear;
	}
	private String gameName;
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	@Override
	public String toString() {
		return "GameList [gamesWithYear=" + gamesWithYear + "]";
	}
	
	

}
