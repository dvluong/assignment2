package edu.csupomona.cs.cs356.assignment_2;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Enter Text >");
 
        // create an event source - reads from stdin
        final EventSource eventSource = new EventSource();
 
        // create an observer
        final ResponseHandler responseHandler = new ResponseHandler();
 
        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler);
 
        // starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();
    }
}