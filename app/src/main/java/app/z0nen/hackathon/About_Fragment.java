package app.z0nen.hackathon;

import android.app.Fragment;
<<<<<<< HEAD
=======

import android.net.Uri;

import android.content.res.AssetManager;
>>>>>>> 1718f601629c5738dc5f723f2de31c611b7d8cda
import android.graphics.Typeface;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
=======
import android.webkit.WebView;

import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

>>>>>>> 1718f601629c5738dc5f723f2de31c611b7d8cda
import android.widget.TextView;
import android.content.Context;


/**
 * Created by Devon on 03/14/2015.
 */
public class About_Fragment extends Fragment {
    View rootview;
    VideoView myview;
    private static final String TAG = "VideoPlayer";
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.about_layout, container, false);
       myview = (VideoView) rootview.findViewById(R.id.videoView);


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return rootview;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        myview.setMediaController(new MediaController(getActivity()));
    }
    public void playVideo() {
        Uri uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.video1);
        Log.d(TAG, "Uri is: " + uri);
        setVideoLocation(uri);
        if (!myview.isPlaying()) {
            myview.start();
        }
    }
    private void setVideoLocation(Uri uri) {
        try {
            myview.setVideoURI(uri);
        } catch (Exception e) {
            Log.e(TAG, "VideoPlayer uri was invalid", e);
            Toast.makeText(getActivity(), "Not found", Toast.LENGTH_SHORT).show();
        }
    }
    public void pauseVideo() {
        myview.pause();
    }
    public void fontClass(Context myContext) {
        TextView title;
        Typeface custom_font = Typeface.createFromAsset(myContext.getAssets(), "src/main/Asap-Regular.otf");


        title = (TextView) rootview.findViewById(R.id.textView);
        title.setTypeface(custom_font);

    }


}
