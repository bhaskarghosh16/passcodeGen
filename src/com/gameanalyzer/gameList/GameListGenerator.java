package com.gameanalyzer.gameList;


import java.io.FileNotFoundException;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.oracle.tools.packager.Log;

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
		int countSkip =0;
		
			try {

		        Scanner sc = new Scanner(Paths.get("./src/resources/files/gameListMaster.txt"));
					
				//sc.nextLine();sc.nextLine();
		        while (sc.hasNextLine() && limit >0) {
		        	
		            String gameLine = sc.nextLine();
		            try {
		            String name = gameLine.substring(0, gameLine.indexOf('('));
		            
		            String secondtuple = gameLine.substring(gameLine.indexOf('(')+1,gameLine.indexOf(')'));
		           
		            int year = Integer.parseInt(secondtuple.split(",")[0]);
		            String publisher = secondtuple.split(",")[1];
		            gameLine = gameLine.replace(name+"("+secondtuple+")", " ");
		            String platform = gameLine.substring(gameLine.indexOf("(")+1,gameLine.indexOf(")"));
		            Game game = new Game();
		            game.setGameName(name);
		            game.setPublisher(publisher);
		            game.setYear(year);
		            game.setPlatform(platform);
		            System.out.println(game);
		            limit--;
		            }catch(Exception e) {
		            	//Log.getLogger().error(e.getMessage());
		            	countSkip++;
		            	continue;
		            }
		        }
		        sc.close();
		    } 
		    catch (FileNotFoundException e) {
		        e.printStackTrace();
		    }
		    
		System.out.println(countSkip);
		
		return gList;
		
	}

}
