package edu.csupomona.cs.cs356.assignment_2;

import java.util.ArrayList;

public class UserComposite implements Component {
	ArrayList<String> list = new ArrayList<String>();
	private static final UserComposite instance = new UserComposite();
	private UserComposite(){

	}
	public static UserComposite getInstance(){
		return instance;
	}
	public void add(String s) {
		list.add(s);
	}

}
