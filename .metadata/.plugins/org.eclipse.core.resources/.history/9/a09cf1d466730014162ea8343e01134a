package edu.csupomona.cs.cs356.assignment_2;

public class test {

	public static void main(String[] args) {
		User user = new User("david");
		user.addObserver(user);
		User user1 = new User("sarmen");
		user1.addObserver(user);
		UserManager test = new UserManager();
		user.followUser(user1);
		user1.followUser(user);
		
		if (user.followers.contains(user1) && user1.followers.contains(user)){
			user.setTweet("hi");
		} else {
			System.out.println("someone isn't stalking someone");
		}
	}

}
