package edu.csupomona.cs.cs356.assignment_2;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
	Map<String, User> userManager;
	public UserManager(){
		userManager  = new HashMap<String, User>();
	}
	public void add(String s, User user){
		userManager.put(s, user);
	}
	
	public String getID(String s){
		return userManager.get(s).toString();
	}

}
