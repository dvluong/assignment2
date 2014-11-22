package edu.csupomona.cs.cs356.assignment_2;

public class FollowerObserver implements Observer{
	private String tweet;
	private String user;
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject grabber;
	
	public FollowerObserver(Subject grabber){
		this.grabber = grabber;
		this.observerID = ++observerIDTracker;
		
		System.out.println("New Follower " + this.observerID);
		
		grabber.register(this);
	}
	public void update(String user, String tweet) {
		this.tweet = tweet;
		printTweets();
	}
	
	public void printTweets(){
		System.out.println(observerID + "\nTweeted: " + tweet);
	}

}
