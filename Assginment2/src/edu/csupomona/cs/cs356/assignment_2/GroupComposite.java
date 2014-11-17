package edu.csupomona.cs.cs356.assignment_2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GroupComposite implements Component{
	ArrayList<String> list = new ArrayList<String>();
	private static final GroupComposite instance = new GroupComposite();
	private GroupComposite(){
		
	}
	public static GroupComposite getInstance(){
		return instance;
	}
	public void add(String s){
		list.add(s);
	}
	public void dataMessage() {
		for (int a = 0; a < list.size(); a++){
			JOptionPane.showMessageDialog(null, "List of Groups: " + list.get(a));
		}
	}
}
