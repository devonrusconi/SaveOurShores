package app.z0nen.hackathon;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;

/**
 * Created by Devon on 3/14/2015.
 */

public class Form_Fragment extends Fragment implements View.OnClickListener{
    View rootview;
    private Button minusOne;
    private TextView textEight, result;
    private String strEight;
    private int value;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.form_layout, container, false);

<<<<<<< HEAD
=======
        View caculateButton = rootview.findViewById(R.id.button);
        caculateButton.setOnClickListener(this);
        View additionButton = rootview.findViewById(R.id.button2);
        additionButton.setOnClickListener(this);

        return rootview;
    }
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            textEight = (TextView) rootview.findViewById(R.id.textView8);
            strEight = textEight.getText().toString();
            if(strEight != "0") {
                value = (Integer.parseInt(strEight)) - 1;
                result = (TextView) rootview.findViewById(R.id.textView8);
                result.setText("" + value);
            }
        }
        else if (v.getId() == R.id.button2) {
            textEight = (TextView) rootview.findViewById(R.id.textView8);
            strEight = textEight.getText().toString();
            value = (Integer.parseInt(strEight))+1;
            result = (TextView) rootview.findViewById(R.id.textView8);
            result.setText(""+value);
        }
>>>>>>> 54fbbd8f2a9af15698e6ef8cda8f61a9ce0bf7d1
    }

}
