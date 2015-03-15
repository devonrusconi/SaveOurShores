package app.z0nen.hackathon;

import android.app.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;


/**
 * Created by Devon on 03/14/2015.
 */
public class About_Fragment extends Fragment {


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview;
        rootView = inflater.inflate(R.layout.about_layout, container, false);

//        VideoView vid = (VideoView) rootview.findViewById(R.id.videoView);
//        vid.setVideoPath("C:\\Users\\Devon\\Desktop\\SaveOurShores\\app\\src\\main\\res\\raw\\video1.3gp");
//        vid.setMediaController(new MediaController(getActivity()));
//        vid.start();
//        vid.requestFocus();

        return rootview;

    }


}
