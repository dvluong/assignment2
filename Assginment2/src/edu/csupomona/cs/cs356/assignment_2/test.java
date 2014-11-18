package edu.csupomona.cs.cs356.assignment_2;

public class test {

	public static void main(String[] args) {
		Followers follow = new Followers();
		FollowerObserver obs1 = new FollowerObserver(follow);
		
		follow.setFollow("David");
		follow.setFollow("Kalin");
		follow.setFollow("Kyle");
	}

}
