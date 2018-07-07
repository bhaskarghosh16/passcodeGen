package com.gameanalyzer.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.bson.Document;

import com.gameanalyzer.gameList.Game;
import com.gameanalyzer.gameList.GameList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class MongoDao {
	public  MongoClient mongoClient = new MongoClient("127.0.0.1");
	public  DB db;
	public  DBCollection collection;
	public  DB getDBconnection() {
		
		 db = mongoClient.getDB("dev");
		 Set<String> collections = db.getCollectionNames();
         for (String colName : collections) {
             System.out.println("\t + Collection: " + colName);
         }
         collection = db.getCollection("gameCollection");
         System.out.println(collection);
         //mongoClient.close();
         return db;
        }
	public  DBCollection getDBcollection() {
		
		 db = getDBconnection();
		 
         collection = db.getCollection("gameCollection");
         System.out.println(collection);
         //mongoClient.close();
         return collection;
        }
	
	public  void insertCollection(List<Game> gList) {
		collection = getDBcollection();
		System.out.println(gList.size());
		
		for (Game game : gList)
		{
			try {
			DBObject document = new BasicDBObject(); 
			document.put("title",game.getGameName());
			document.put("publisher",game.getPublisher());
			document.put("platform",game.getPlatform());
			document.put("year", game.getYear());
			document.put("likes", 0);
			DBObject comment = new BasicDBObject(); 
			comment.put("user","Test User" );
			comment.put("message", "Test message");
			comment.put("dateCreated", "2018-07-07");
			document.put("comment",comment);
			System.out.println(document);
			collection.insert(document);
			}catch(MongoException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("Data inserted");
		mongoClient.close();
	}

}
