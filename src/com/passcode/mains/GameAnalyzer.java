package com.passcode.mains;

import java.io.IOException;

import java.util.List;

import com.gameanalyzer.dao.MongoDao;
import com.gameanalyzer.gameList.Game;

import com.gameanalyzer.gameList.GameListGenerator;


public class GameAnalyzer  {
	

	public static void main(String[] args)  {

		MongoDao mongo = new MongoDao();
		
		GameListGenerator gGenerate = new GameListGenerator();
		
		gGenerate.setLimit(149668);
		
		try {
			List<Game> gList = gGenerate.generateListbyLimit();
			//System.out.println(gList);
			mongo.insertCollection(gList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
