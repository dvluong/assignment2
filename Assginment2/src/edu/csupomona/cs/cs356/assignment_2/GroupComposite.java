package edu.csupomona.cs.cs356.assignment_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupComposite implements Component, Visitor {
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

	public int visitUser() {
		Iterator<Component> it = list.iterator();
		int countUser = 0;
		while (it.hasNext()){
			Object obj = it.next();
			if (obj instanceof User){
				countUser++;
			}
		}		
		return countUser;
	}

	public int visitGroup() {
		Iterator<Component> it = list.iterator();
		int countGroup = 0;
		while (it.hasNext()){
			Object obj = it.next();
			if (obj instanceof GroupComposite){
				countGroup++;
			}		
		}		
		return countGroup;
	}


	public void accept(Visitor visitor) {
		visitor.visitGroup();
	}

}
