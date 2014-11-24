package edu.csupomona.cs.cs356.assignment_2;
/**
 * CS 356: Objected Oriented Programming 
 * Professor: Yu Sun
 *
 * Project 2
 *
 * <The user class stores a list of users and tweets. Implements Observer pattern.>
 *
 * David V Luong
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class User extends Observable implements Component, Observer {

	String user;
	List<User> followers = new ArrayList<User>();
	List<User> following = new ArrayList<User>();
	List<String> tweet = new ArrayList<String>();

	private static final User instance = new User();

	public User() {

	}

	public static User getInstance() {
		return instance;
	}

	public User(String newUser) {
		user = newUser;
	}

	public String getUser() {
		return user;
	}

	public String toString() {
		return user;
	}

	public void addFollower(User user) {
		followers.add(user);
	}

	public void followUser(User userId) {
		User userToFollow = userId;
		this.following.add(userToFollow);
		setChanged();
		notifyObservers(userToFollow);
		clearChanged();
	}

	public void sendTweet(String tweets) {
		tweet.add(tweets);
		setChanged();
		notifyObservers(tweets);
		clearChanged();
	}

	public void update(User user, String follower, String tweets, UserManager UM) {
		
		for (int a = 0; a < UM.uiMap.size(); a++) {
			if (UM.getKeysArrayUI(follower)) {
				if(UM.getUI(follower).listT == null){
					UM.getUI(follower).listT = new DefaultListModel<String>();
				}
				if (UM.getUI(follower).listTweets == null){
					UM.getUI(follower).listTweets = new JList<String>(UM.getUI(follower).listT);
				}
				
				if (UM.getUI(follower).frame == null){
					UM.getUI(follower).frame = new JFrame(follower);
				}
				UM.getUI(follower).listT.addElement(user + " tweeted: " + tweets);
				UM.getUI(follower).listTweets = new JList<String>(UM.getUI(follower).listT);
				UM.getUI(follower).listTweets.setModel(UM.getUI(follower).listT);
				SwingUtilities.updateComponentTreeUI(UM.getUI(follower).frame);

				System.out.println("this was called");
			}

		}

	}

	public void accept(Visitor visitor) {
		visitor.visitUser();
	}

	public void update(Observable arg0, Object arg1) {
		if (arg1 instanceof String && arg0 instanceof User) {
			String resp = (String) arg1;
			System.out.println((User) arg0 + " tweeted: " + resp);
		}
		else if (arg0 instanceof User && arg1 instanceof User) {
			System.out.println((User) arg0 + " followed " + arg1);
		}
	}
}