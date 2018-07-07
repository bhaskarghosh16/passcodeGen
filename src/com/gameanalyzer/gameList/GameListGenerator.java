package com.gameanalyzer.gameList;


import java.io.FileNotFoundException;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

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
	
	public List<Game> generateListbyLimit() throws IOException {
		int limit = this.getLimit();
		List<Game> gList = new ArrayList<>();
		
		
			try {

		        Scanner sc = new Scanner(Paths.get("./src/resources/files/gameListMaster.txt"));
					
				//sc.nextLine();sc.nextLine();
		        while (sc.hasNextLine() && limit >0) {
		        	String name="";int year = -1;
		        	String gameLine = sc.nextLine();
		        	String publisher ="";
		        	String platform="";
		        	try {
		        		String secondtuple ="";
		        		if(gameLine.indexOf('(') != -1)
		        			{
		        			name = gameLine.substring(0, gameLine.indexOf('('));
		        			secondtuple = gameLine.substring(gameLine.indexOf('(')+1,gameLine.indexOf(')'));
		        			try {
		        				year = Integer.parseInt(secondtuple.split(",")[0]);
		        			}
		        			catch(NumberFormatException e) {
		        				year =-1;
		        			}
		        			
		        			publisher = secondtuple.split(",")[1];
		        			gameLine = gameLine.replace(name+"("+secondtuple+")", " ");
		        			platform = gameLine.substring(gameLine.indexOf("(")+1,gameLine.indexOf(")"));
		        			}
		        		else 
		        			name = sc.nextLine();
		        		
		        		Game game = new Game();
		        		game.setGameName(name);
		        		game.setPublisher(publisher);
		        		game.setYear(year);
		        		game.setPlatform(platform);
		        		gList.add(game);
		        		System.out.println(game);
		        		limit--;
		        	}catch(Exception e) {
		        		
		        	}
		        }
		        sc.close();
		    } 
		    catch (FileNotFoundException e) {
		        e.printStackTrace();
		    }
		    
		
		
		return gList;
		
	}

}
