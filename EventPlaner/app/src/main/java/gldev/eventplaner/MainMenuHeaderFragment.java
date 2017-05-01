package gldev.eventplaner;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageButton;


/**
 * Created by Achim on 23.04.2017.
 */

public class MainMenuHeaderFragment extends Fragment implements View.OnClickListener {


    TextView EventText;
    ImageButton ButtonPic;
    Button ButtonProfilname;



    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.mainmenuheaderfragment, container, false);

        // Create Button Function for ProfilPic-Button
        ImageButton ButtonPic = (ImageButton) view.findViewById(R.id.HeaderMainMenuProfilPic);

        // Create Button Function for ProfilName
        Button ButtonProfilname = (Button) view.findViewById(R.id.HeaderMainMenuProfilName);
        ButtonProfilname.setOnClickListener(this);
        TextView EventText = (TextView) view.findViewById(R.id.HeaderMainMenuName);

        return view;
    }



    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.HeaderMainMenuProfilName: {

                TextView Text= (TextView) getView().findViewById(R.id.HeaderMainMenuProfilName);
                Text.setText("TEST");
                break;
            }


        }
    }



    public void buttonClickedPic (View view) {


    }




}


