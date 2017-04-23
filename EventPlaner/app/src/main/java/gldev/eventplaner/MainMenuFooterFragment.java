package gldev.eventplaner;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Achim on 23.04.2017.
 */

public class MainMenuFooterFragment extends Fragment {


    public static MainMenuFooterFragment newInstance() {
        return new MainMenuFooterFragment();
    }

    //3
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mainmenufooterfragment, container, false);
    }



}




