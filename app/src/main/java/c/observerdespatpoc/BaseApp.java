package c.observerdespatpoc;

import android.app.Application;

/**
 * Created by khushal.v on 14-06-2017.
 */

public class BaseApp extends Application {
    Test test;

    @Override
    public void onCreate() {
        super.onCreate();

        test = new Test();
    }

    public Test getObserver(){
        return test;
    }
}
