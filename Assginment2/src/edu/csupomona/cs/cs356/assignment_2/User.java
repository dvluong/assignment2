package edu.csupomona.cs.cs356.assignment_2;

import java.util.ArrayList;

import java.util.List;

import java.util.Observable;
import java.util.Observer;

public class User extends Observable implements Component, Observer {

	String user;
	List<User> followers = new ArrayList<User>();
	List<User> following = new ArrayList<User>();
	List<String> tweet = new ArrayList<String>();
	
	private static final User instance = new User();
	public User(){
		
	}
	
	public static User getInstance(){
		return instance;
	}	
	
	public User(String newUser) {
		user = newUser;
	}

	public String getUser() {
		return user;
	}
	
	public String toString(){
		return user;
	}

	public void addFollower(User user){
		followers.add(user);
	}
	public void followUser(User userId){		
		User userToFollow = userId;
		this.following.add(userToFollow);
		setChanged();
		notifyObservers(userToFollow);
		clearChanged();
		addFollower(userToFollow);
	}
	
	public void setTweet(String tweets){
		tweet.add(tweets);
		setChanged();
		notifyObservers(tweets);
		clearChanged();
	}
	
	public void update(Observable arg0, Object arg1) {
		if (arg1 instanceof String && arg0 instanceof User){
			String resp = (String) arg1;
            System.out.println((User) arg0 + " tweeted: " + resp );
		} else if (arg0 instanceof User){
			System.out.println((User) arg0 + " followed someone.");
		}
	}
}