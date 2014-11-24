package edu.csupomona.cs.cs356.assignment_2;

import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		User user = new User("david");
		GroupComposite group = new GroupComposite("Root");
		group.add(user);
		group.add(group);
		GroupComposite group2 = new GroupComposite("group5");
		group.add(group2);
		user.addObserver(user);
		User user1 = new User("raina");
		user1.addObserver(user);
		UserManager test = new UserManager();
		user.followUser(user1);
		user1.followUser(user);
		test.add("david", user);
		
		Iterator<User> it = user.followers.iterator();
		while (it.hasNext()){
			User obj = it.next();
			System.out.println(obj.getUser());
			if (user.followers.contains(obj)){
				user.sendTweet("hi");
			}
		}
		user.accept(group);
		System.out.println(group.visitGroup());
	}

}
