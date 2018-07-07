package com.gameanalyzer.dao;

import java.util.Set;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoDao {
	
	public static DB db;
	public static DBCollection collection;
	public static void connectToDB() {
		MongoClient mongoClient = new MongoClient("127.0.0.1");
		 db = mongoClient.getDB("dev");
		 Set<String> collections = db.getCollectionNames();
         for (String colName : collections) {
             System.out.println("\t + Collection: " + colName);
         }
         collection = db.getCollection("gameCollection");
         System.out.println(collection);
         //mongoClient.close();
        }
	public static void insertCollection(GameList gList) {
		connectToDB();
		DBObject document = new BasicDBObject(); 
		document.put("title","TestGame");
		document.put("publisher","TestPublisher");
		document.put("platform","TestPlatform");
		document.put("year", 2018);
		document.put("likes", 0);
		DBObject comment = new BasicDBObject(); 
		comment.put("user","Test User" );
		comment.put("message", "Test message");
		comment.put("dateCreated", "2018-07-07");
		document.put("comment",comment);
		collection.insert(document);
		System.out.println("Data inserted");
	}

}
