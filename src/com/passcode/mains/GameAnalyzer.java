package com.passcode.mains;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.gameanalyzer.gameList.GameList;
import com.gameanalyzer.gameList.GameListGenerator;


public class GameAnalyzer {

	public static void main(String[] args) throws ClassNotFoundException {

		GameListGenerator gGenerate = new GameListGenerator();
		
		gGenerate.setLimit(10);
		
		try {
			GameList gList = gGenerate.generateListbyLimit();
			FileOutputStream f = new FileOutputStream(new File("myGamesList.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(gList);
			o.close();
			f.close();
			
//			FileInputStream fi = new FileInputStream(new File("myGamesList.txt"));
//			ObjectInputStream oi = new ObjectInputStream(fi);
//
//			// Read objects
//		GameList gL = (GameList) oi.readObject();
//			
//
//			System.out.println(gL);
//		
//
//			oi.close();
//			fi.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
