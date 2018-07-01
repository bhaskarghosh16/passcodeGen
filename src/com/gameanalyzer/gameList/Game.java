package com.gameanalyzer.gameList;

public class Game {
	private String gameName;
	private int year;
	private String platform;
	private String publisher;
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
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Game [gameName=" + gameName + ", year=" + year + ", platform=" + platform + ", publisher=" + publisher
				+ "]";
	}
	

}
