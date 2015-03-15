package app.z0nen.hackathon;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Devon on 3/14/2015.
 */

public class Home_Fragment extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.home_layout, container, false);
        return rootview;
    }
    public void fontClass(Context myContext) {
        TextView title=(TextView) rootview.findViewById(R.id.homeTitle);
        Typeface font = Typeface.createFromAsset(myContext.getAssets(),"Caviar_Dreams_Bold.ttf");
        title.setTypeface(font);

    }

}
