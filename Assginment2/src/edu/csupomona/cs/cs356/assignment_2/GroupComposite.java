package edu.csupomona.cs.cs356.assignment_2;

import java.util.ArrayList;

public class GroupComposite implements Component {
	ArrayList<Component> list = new ArrayList<Component>();
	String group;

	public GroupComposite(String newGroup) {
		group = newGroup;
	}

	public String getGroup() {
		return group;
	}

	public void add(Component group) {
		list.add(group);
	}

}
