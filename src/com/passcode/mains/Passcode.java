package com.passcode.mains;


import java.util.Date;
import java.util.Random;

public class Passcode {
	private String gameName;
	private int year;
	private final char[] specialCharSet = {'!','@','#','$','%','^','&','*'};
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		Random random = new Random();
		Date now = new Date();
		int num = random.nextInt(8);
		return "Test Github Jenkins Integration";
		//return this.getGameName()+specialCharSet[num]+this.getYear()+" -- Built via jenkins : "+now;
	}
	
	 
}
