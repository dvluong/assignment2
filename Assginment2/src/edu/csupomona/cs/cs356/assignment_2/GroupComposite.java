package edu.csupomona.cs.cs356.assignment_2;

import java.util.ArrayList;
import java.util.List;

public class GroupComposite implements Component {
	List<Component> list = new ArrayList<Component>();
	String group;
	List<GroupComposite> groups = new ArrayList<GroupComposite>();
	public GroupComposite(String newGroup) {
		group = newGroup;
	}

	public String getGroup() {
		return group;
	}

	public void add(Component user) {
		list.add(user);
	}
	
	public void add(GroupComposite group){
		groups.add(group);
	}

}
