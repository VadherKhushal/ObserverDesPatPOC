package c.observerdespatpoc;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by khushal.v on 14-06-2017.
 */
public class Test extends Observable {

    private String name = "Thats my name.";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }
}
