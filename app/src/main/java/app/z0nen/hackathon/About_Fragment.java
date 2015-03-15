package app.z0nen.hackathon;

import android.app.Fragment;

import android.net.Uri;
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


    View rootview;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.about_layout, container, false);

        VideoView vv = (VideoView)this.rootview.findViewById(R.id.videoView);
        String uri = "andrid.resource://" + getActivity().getPackageName() + "/" + R.raw.video1;
        MediaController mc= new MediaController(getActivity());
        vv.setMediaController(mc);
        vv.setVideoURI(Uri.parse(uri));
        vv.start();

        return rootview;

    }


}
