package com.passcode.mains;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.gameanalyzer.dao.MongoDao;
import com.gameanalyzer.gameList.GameList;
import com.gameanalyzer.gameList.GameListGenerator;


public class GameAnalyzer {

	public static void main(String[] args) throws ClassNotFoundException {

		MongoDao mongo = new MongoDao();
		mongo.insertCollection();
		/*GameListGenerator gGenerate = new GameListGenerator();
		
		gGenerate.setLimit(10);
		
		try {
			GameList gList = gGenerate.generateListbyLimit();
			FileOutputStream f = new FileOutputStream(new File("myGamesList.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(gList);
			o.close();
			f.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
