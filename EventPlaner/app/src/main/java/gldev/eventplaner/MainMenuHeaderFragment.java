package gldev.eventplaner;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Activity;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * Created by Achim on 23.04.2017.
 */

public class MainMenuHeaderFragment extends Fragment {
    // kp was das macht ----------------------------------------
    public static MainMenuHeaderFragment newInstance() {

        return new MainMenuHeaderFragment();
    }
    // -------------------------------------------------------------



    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.mainmenuheaderfragment,
                container, false);

        // Create Button Function for ProfilPic-Button
        final ImageButton ButtonPic =
                (ImageButton) view.findViewById(R.id.HeaderMainMenuProfilPic);
        ButtonPic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClickedPic(v);
            }
        });

        // Create Button Function for ProfilName
        final Button ButtonProfilname =
                (Button) view.findViewById(R.id.HeaderMainMenuProfilName);
        ButtonProfilname.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClickedProfilName(v);
            }
        });

        return view;
    }
    public void buttonClickedPic (View view) {

    }
    public void buttonClickedProfilName (View view) {

    }


}


