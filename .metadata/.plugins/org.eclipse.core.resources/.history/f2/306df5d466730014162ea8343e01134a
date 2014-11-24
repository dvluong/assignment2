package edu.csupomona.cs.cs356.assignment_2;

import java.util.ArrayList;
import java.util.List;

public class GroupComposite implements Component {
	List<Component> list = new ArrayList<Component>();
	String group;
	private static final GroupComposite instance = new GroupComposite();
	public GroupComposite(){
		
	}
	
	public static GroupComposite getInstance(){
		return instance;
	}
	public GroupComposite(String newGroup) {
		group = newGroup;
	}

	public String getGroup() {
		return group;
	}

	public void add(Component component) {
		list.add(component);
	}

}
