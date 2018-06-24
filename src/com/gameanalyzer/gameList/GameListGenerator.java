package com.gameanalyzer.gameList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GameListGenerator {
	private int limit;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public GameList generateListbyLimit() throws IOException {
		int limit = this.getLimit();
		GameList gList = new GameList();
		List<HashMap<String, Integer>> games;
		games = gList.getGamesWithYear();
			if (games == null)
			{
				games = new ArrayList<HashMap<String, Integer>>();
			}
			//File file = new File();

		    try {

		        Scanner sc = new Scanner(Paths.get("src/gameList.txt"));

		        while (sc.hasNextLine() && limit >0) {
		            String name = sc.nextLine();
		            HashMap<String, Integer> thisgame = new HashMap<>();
		            thisgame.put(name, 1970);
		            games.add(thisgame);
		            limit--;
		        }
		        sc.close();
		    } 
		    catch (FileNotFoundException e) {
		        e.printStackTrace();
		    }
		    gList.setGamesWithYear(games);
			
		
		
		return gList;
		
	}

}
