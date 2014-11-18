package edu.csupomona.cs.cs356.assignment_2;

import java.util.ArrayList;

public class GrabFollowers implements Subject{

	private ArrayList<Observer> observers;
	private String user;
	private String tweet;
	public GrabFollowers(){
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer newFollower) {
		observers.add(newFollower);
	}

	public void notifyObserver() {
		for (Observer observer : observers){
			observer.update(user, tweet);
		}
	}

	public void setFollow(String user){
		this.user = user;
		notifyObserver();
	}
	
	public void setTweet(String tweet){
		this.tweet = tweet;
		notifyObserver();
	}

}
