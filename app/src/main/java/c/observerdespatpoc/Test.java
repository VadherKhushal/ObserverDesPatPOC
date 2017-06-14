package c.observerdespatpoc;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by khushal.v on 14-06-2017.
 *
 * Observer Pattern
 * Subject(or observable) class, any changes to this object will ne notified to all the observers of this calss
 */
public class Test extends Observable {

    private String name = "Thats my name.";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged(); //to indicate that change has happened
        notifyObservers(); // to notify the observers aboout the change, update method will be called in the observer calss
    }
}
