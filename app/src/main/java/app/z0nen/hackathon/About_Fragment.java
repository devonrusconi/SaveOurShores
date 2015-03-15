package app.z0nen.hackathon;

import android.app.Fragment;

import android.net.Uri;
import android.content.res.AssetManager;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import android.widget.TextView;
import android.content.Context;


/**
 * Created by Devon on 03/14/2015.
 */
public class About_Fragment extends Fragment {
    View rootview;
    VideoView myview;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.about_layout, container, false);


        return rootview;


    }


}
