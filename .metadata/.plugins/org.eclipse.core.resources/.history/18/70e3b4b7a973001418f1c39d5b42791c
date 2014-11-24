package edu.csupomona.cs.cs356.assignment_2;

import java.util.Observable;
import java.util.Observer;  /* this is Event Handler */
 
public class ResponseHandler implements Observer {
    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            String resp = (String) arg;
            System.out.println("\nReceived Response: " + resp );
        }
    }
}
