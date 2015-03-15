package app.z0nen.hackathon;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;

/**
 * Created by Rivka on 3/14/2015.
 */

public class Home_Fragment extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.home_layout, container, false);
        return rootview;
    }
    /*public void fontClass(Context myContext)
        Typeface title = Typeface.createFromAsset(myContext.getAssets(),"Caviar_Dreams_Bold.ttf");
        TextView font=(TextView) rootview.findViewById(R.id.homeTitle);
        font.setTypeface(title);

    }*/

}

