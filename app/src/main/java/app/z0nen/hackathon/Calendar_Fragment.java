package app.z0nen.hackathon;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Devon on 3/14/2015.
 */
public class Calendar_Fragment extends Fragment {
    View rootview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.calendar_layout, container, false);
<<<<<<< HEAD

        /*
        WebView webView = (WebView)rootView.findViewById(R.id.webCalendar);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("http://saveourshores.org/media/newsletters/");
        webView.getSettings().setBuiltInZoomControls(true);
        webView.setInitialScale(50);
        */
=======
//
//        WebView webView = (WebView)rootView.findViewById(R.id.webCalendar);
//        webView.getSettings().setJavaScriptEnabled(true);
//
//        webView.loadUrl("http://saveourshores.org/calendar/");
//        webView.getSettings().setBuiltInZoomControls(true);
//        webView.setInitialScale(50);
>>>>>>> fa97f381816add74288911e06590836ca530577e

        return rootView;
    }

}