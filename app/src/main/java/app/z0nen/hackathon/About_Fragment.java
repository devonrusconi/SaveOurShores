package app.z0nen.hackathon;

import android.app.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * Created by Devon on 03/14/2015.
 */
public class About_Fragment extends Fragment {
    View rootview;


    // Insert your Video URL

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.about_layout, container, false);


        return rootView;


    }


}
