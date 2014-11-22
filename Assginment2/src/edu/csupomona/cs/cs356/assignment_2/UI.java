package edu.csupomona.cs.cs356.assignment_2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class UI {

	private JFrame frame;
	//private static final UI instance = new UI();
	private UserManager man;
	private User user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//run();
	}

	/**
	 * Create the application.
	 */
	public UI(UserManager man, User user) {
		//initialize();
		this.man = man;
		this.user = user;
	}
	
	
//	public static UI getInstance(){
//		return instance;
//	}	

	/**
	 * Initialize the contents of the frame.
	 */
	protected void run(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI(man, user);
					window.initialize();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void initialize() {
		
		System.out.println(man.getID("david"));
		frame = new JFrame(man.getID(user.getUser()));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
				AdminCP.class.getResource("/image/naruto.jpg")));
		frame.getContentPane().setBackground(new Color(0, 204, 255));
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 448, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(214, 21, 210, 33);
		frame.getContentPane().add(textArea);
		JButton btnFollow = new JButton("Follow User");
		btnFollow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnFollow){
					
				}
			}
		});
		btnFollow.setBounds(10, 11, 194, 56);
		frame.getContentPane().add(btnFollow);
		

		DefaultListModel<String> list = new DefaultListModel<String>();
		list.addElement("List View (Current Following)");
		
		JList<String> listFollowers = new JList<String>(list);
		
		listFollowers.setBounds(10, 78, 414, 125);
		frame.getContentPane().add(listFollowers);
		
		
		JButton btnTweet = new JButton("Tweet");
		btnTweet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTweet.setBounds(10, 214, 194, 55);
		frame.getContentPane().add(btnTweet);
		
		JList<String> listTweets = new JList<String>();
		listTweets.setBounds(10, 280, 414, 169);
		frame.getContentPane().add(listTweets);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(214, 226, 210, 33);
		frame.getContentPane().add(textArea_1);
	}
}
