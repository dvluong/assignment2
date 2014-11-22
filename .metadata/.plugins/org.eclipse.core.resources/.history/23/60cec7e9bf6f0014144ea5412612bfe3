package edu.csupomona.cs.cs356.assignment_2;

import java.util.Observable;
import java.util.Observer;

class MessageBoard extends Observable {
  private String message;

  public String getMessage() {
    return message;
  }

  public void changeMessage(String message) {
    this.message = message;
    setChanged();
    notifyObservers(message);
  }

  public static void main(String[] args) {
    MessageBoard board = new MessageBoard();
    Student bob = new Student();
    Student joe = new Student();
    board.addObserver(bob);
    board.addObserver(joe);
    board.changeMessage("More Homework!");
    board.changeMessage("How does this work?");
  }
}

class Student implements Observer {
  public void update(Observable o, Object arg) {
    System.out.println("Message board changed: " + arg);
  }
}
