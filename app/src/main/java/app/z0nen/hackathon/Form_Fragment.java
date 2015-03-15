package app.z0nen.hackathon;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

/**
 * Created by Devon on 3/14/2015.
 */
public class Form_Fragment extends Fragment implements View.OnClickListener {
    Button myButton;
    TextView t;
    @Override
    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedinstanceState) {
        View myView = inflater.inflate(R.layout.form_layout, container, false);
        myButton = (Button) myView.findViewById(R.id.button);
        myButton.setOnClickListener(this);
        return myView;
    }

    @Override
    public void OnClick(View v) {
        t = (TextView) t.findViewById(R.id.text)
    }
}

