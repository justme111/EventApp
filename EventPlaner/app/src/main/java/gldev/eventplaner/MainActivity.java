package gldev.eventplaner;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instantiate some stuff here like view component

        MainMenuHeaderFragment HeadFragment = (MainMenuHeaderFragment)getFragmentManager().findFragmentById(R.id.HeaderMainMenu);


    }
}
