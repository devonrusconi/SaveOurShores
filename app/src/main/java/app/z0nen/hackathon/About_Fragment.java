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
public class About_Fragment extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {




//        String url = "<html><body>Youtube video .. <br> <iframe class=\"youtube-player\" type=\"text/html\" width=\"640\" height=\"385\" src=\"http://www.youtube.com/embed/bIPcobKMB94\" frameborder=\"0\"></body></html>";
//        WebView myWebView = (WebView) rootview.findViewById(R.id.webView);
//        myWebView.loadData(url, "text/html", "utf-8");

        rootview = inflater.inflate(R.layout.about_layout, container, false);
        return rootview;
    }
}
