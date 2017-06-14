package c.observerdespatpoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by khushal.v on 14-06-2017.
 *
 * 1st observer for the Subject (Test)
 * Observer needs to implement the method update()
 *   which will be called whenever there is any change in the Subject (test, in this case)
 */

public class MainActivity extends AppCompatActivity implements Observer, View.OnClickListener{

    BaseApp mBase;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBase = (BaseApp) getApplication();
        mBase.getObserver().addObserver(this); //registering the observer
        mButton = (Button)findViewById(R.id.button);
        mButton.setText("Value: "+mBase.getObserver().getName());
        mButton.setOnClickListener(this);
    }

    /*
     * update will be called whenever there is any change in the Subject (test)
     */
    @Override
    public void update(Observable observable, Object o) {
        Toast.makeText(this, "MainAct Notified "+mBase.getObserver().getName(), Toast.LENGTH_SHORT).show();
        mButton.setText("Value "+mBase.getObserver().getName());
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
