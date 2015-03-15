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
 * Created by Rivka on 3/14/2015.
 */

public class Form_Fragment extends Fragment implements View.OnClickListener {
    View rootview;
    private TextView textEight, result, textTen, textTwelve, textFourteen, textSixteen,
                     textEighteen,textTwenty, textTwentyTwo, textTwentyFour, textTwentySix,
                     textTwentyEight, textThirty;

    private String strEight, strTen, strTwelve, strFourteen, strSixteen, strEighteen, strTwenty,
                   strTwentyTwo, strTwentyFour, strTwentySix, strTwentyEight, strThirty;

    private int value;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.form_layout, container, false);

        //subtraction
        View sub1Button = rootview.findViewById(R.id.button);
        sub1Button.setOnClickListener(this);

        View sub3Button = rootview.findViewById(R.id.button3);
        sub3Button.setOnClickListener(this);

        View sub5Button = rootview.findViewById(R.id.button5);
        sub5Button.setOnClickListener(this);

        View sub7Button = rootview.findViewById(R.id.button7);
        sub7Button.setOnClickListener(this);

        View sub9Button = rootview.findViewById(R.id.button9);
        sub9Button.setOnClickListener(this);

        View subCups1Button = rootview.findViewById(R.id.subCups);
        subCups1Button.setOnClickListener(this);

        View sub6packButton = rootview.findViewById(R.id.subSixPack);
        sub6packButton.setOnClickListener(this);

        View strawsButton = rootview.findViewById(R.id.subStraws);
        strawsButton.setOnClickListener(this);

        View subFishButton = rootview.findViewById(R.id.subFishing);
        subFishButton.setOnClickListener(this);

        View subOilButton = rootview.findViewById(R.id.subMotorOil);
        subOilButton.setOnClickListener(this);

        View subBalloonsButton = rootview.findViewById(R.id.subBalloons);
        subBalloonsButton.setOnClickListener(this);

        View subPiecesButton = rootview.findViewById(R.id.subPieces);
        subPiecesButton.setOnClickListener(this);


        //addition
        View additionButton = rootview.findViewById(R.id.button2);
        additionButton.setOnClickListener(this);

        View add4Button = rootview.findViewById(R.id.button4);
        add4Button.setOnClickListener(this);

        View add6Button = rootview.findViewById(R.id.button6);
        add6Button.setOnClickListener(this);

        View add8Button = rootview.findViewById(R.id.button8);
        add8Button.setOnClickListener(this);

        View add10Button = rootview.findViewById(R.id.button10);
        add10Button.setOnClickListener(this);

        View addCups1Button = rootview.findViewById(R.id.addCups);
        addCups1Button.setOnClickListener(this);

        View add6packButton = rootview.findViewById(R.id.addSixPack);
        add6packButton.setOnClickListener(this);

        View addStrawsButton = rootview.findViewById(R.id.addStraws);
        addStrawsButton.setOnClickListener(this);

        View addFishButton = rootview.findViewById(R.id.addFishing);
        addFishButton.setOnClickListener(this);

        View addOilButton = rootview.findViewById(R.id.addMotorOil);
        addOilButton.setOnClickListener(this);

        View addBalloonsButton = rootview.findViewById(R.id.addBalloons);
        addBalloonsButton.setOnClickListener(this);

        View addPiecesButton = rootview.findViewById(R.id.addPieces);
        addPiecesButton.setOnClickListener(this);

        return rootview;
    }

    public void onClick(View v) {
        // Bags (grocery, shopping, trash)
        if (v.getId() == R.id.button) {   // Subtract
            textEight = (TextView) rootview.findViewById(R.id.textView8);
            strEight = textEight.getText().toString();
            if (Integer.parseInt(strEight) != 0) {
                value = (Integer.parseInt(strEight)) - 1;
                result = (TextView) rootview.findViewById(R.id.textView8);
                result.setText("" + value);
            }
        } else if (v.getId() == R.id.button2) {   // Add
            textEight = (TextView) rootview.findViewById(R.id.textView8);
            strEight = textEight.getText().toString();
            value = (Integer.parseInt(strEight)) + 1;
            result = (TextView) rootview.findViewById(R.id.textView8);
            result.setText("" + value);
        }

        // Bags (trash)
        else if (v.getId() == R.id.button3) {   // Subtract
            textTen = (TextView) rootview.findViewById(R.id.textView10);
            strTen = textTen.getText().toString();
            if (Integer.parseInt(strTen) != 0)
                {
                    value = (Integer.parseInt(strTen)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView10);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.button4) {   // Add
                textTen = (TextView) rootview.findViewById(R.id.textView10);
                strTen = textTen.getText().toString();
                value = (Integer.parseInt(strTen)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView10);
                result.setText("" + value);
            }

            // Bags (ziplock, snack)
            else if (v.getId() == R.id.button5) {   // Subtract
                textTwelve = (TextView) rootview.findViewById(R.id.textView12);
                strTwelve = textTwelve.getText().toString();
                if (Integer.parseInt(strTwelve) != 0) {
                    value = (Integer.parseInt(strTwelve)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView12);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.button6) {   // Add
                textTwelve = (TextView) rootview.findViewById(R.id.textView12);
                strTwelve = textTwelve.getText().toString();
                value = (Integer.parseInt(strTwelve)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView12);
                result.setText("" + value);
            }

            // Food Wrappers (ie chips or candy)
            else if (v.getId() == R.id.button7) {   // Subtract
                textFourteen = (TextView) rootview.findViewById(R.id.textView14);
                strFourteen = textFourteen.getText().toString();
                if (Integer.parseInt(strFourteen) != 0) {
                    value = (Integer.parseInt(strFourteen)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView14);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.button8) {   // Add
                textFourteen = (TextView) rootview.findViewById(R.id.textView14);
                strFourteen = textFourteen.getText().toString();
                value = (Integer.parseInt(strFourteen)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView14);
                result.setText("" + value);
            }

            // Bottles
            else if (v.getId() == R.id.button9) {   // Subtract
                textSixteen = (TextView) rootview.findViewById(R.id.textView16);
                strSixteen = textSixteen.getText().toString();
                if (Integer.parseInt(strSixteen) != 0) {
                    value = (Integer.parseInt(strSixteen)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView16);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.button10) {   // Add
                textSixteen = (TextView) rootview.findViewById(R.id.textView16);
                strSixteen = textSixteen.getText().toString();
                value = (Integer.parseInt(strSixteen)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView16);
                result.setText("" + value);
            }

            // Cups, Lids, Plates, Utensils
            else if (v.getId() == R.id.subCups) {   // Subtract
                textEighteen = (TextView) rootview.findViewById(R.id.textView18);
                strEighteen = textEighteen.getText().toString();
                if (Integer.parseInt(strEighteen) != 0) {
                    value = (Integer.parseInt(strEighteen)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView18);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.addCups) {   // Add
                textEighteen = (TextView) rootview.findViewById(R.id.textView18);
                strEighteen = textEighteen.getText().toString();
                value = (Integer.parseInt(strEighteen)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView18);
                result.setText("" + value);
            }

            // 6-Pack Rings
            else if (v.getId() == R.id.subSixPack) {   // Subtract
                textTwenty = (TextView) rootview.findViewById(R.id.textView20);
                strTwenty = textTwenty.getText().toString();
                if (Integer.parseInt(strTwenty) != 0) {
                    value = (Integer.parseInt(strTwenty)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView20);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.addSixPack) {   // Add
                textTwenty = (TextView) rootview.findViewById(R.id.textView20);
                strTwenty = textTwenty.getText().toString();
                value = (Integer.parseInt(strTwenty)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView20);
                result.setText("" + value);
            }

            // Straws or Stirrers
            else if (v.getId() == R.id.subStraws) {   // Subtract
                textTwentyTwo = (TextView) rootview.findViewById(R.id.textView22);
                strTwentyTwo = textTwentyTwo.getText().toString();
                if (Integer.parseInt(strEight) != 0) {
                    value = (Integer.parseInt(strTwentyTwo)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView22);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.addStraws) {   // Add
                textTwentyTwo = (TextView) rootview.findViewById(R.id.textView22);
                strTwentyTwo = textTwentyTwo.getText().toString();
                value = (Integer.parseInt(strTwentyTwo)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView22);
                result.setText("" + value);
            }

            // Fishing Line, Nets, Lures, Floats
            else if (v.getId() == R.id.subFishing) {   // Subtract
                textTwentyFour = (TextView) rootview.findViewById(R.id.textView24);
                strTwentyFour = textTwentyFour.getText().toString();
                if (Integer.parseInt(strTwentyFour) != 0) {
                    value = (Integer.parseInt(strTwentyFour)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView24);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.addFishing) {   // Add
                textTwentyFour = (TextView) rootview.findViewById(R.id.textView24);
                strTwentyFour = textTwentyFour.getText().toString();
                value = (Integer.parseInt(strTwentyFour)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView24);
                result.setText("" + value);
            }

            // Motor Oil Bottles
            else if (v.getId() == R.id.subMotorOil) {   // Subtract
                textTwentySix = (TextView) rootview.findViewById(R.id.textView26);
                strTwentySix = textTwentySix.getText().toString();
                if (Integer.parseInt(strTwentySix) != 0) {
                    value = (Integer.parseInt(strTwentySix)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView26);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.addMotorOil) {   // Add
                textTwentySix = (TextView) rootview.findViewById(R.id.textView26);
                strTwentySix = textTwentySix.getText().toString();
                value = (Integer.parseInt(strTwentySix)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView26);
                result.setText("" + value);
            }

            // Balloons or Ribbons
            else if (v.getId() == R.id.subBalloons) {   // Subtract
                textTwentyEight = (TextView) rootview.findViewById(R.id.textView28);
                strTwentyEight = textTwentyEight.getText().toString();
                if (Integer.parseInt(strTwentyEight) != 0) {
                    value = (Integer.parseInt(strTwentyEight)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView28);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.addBalloons) {   // Add
                textTwentyEight = (TextView) rootview.findViewById(R.id.textView28);
                strTwentyEight = textTwentyEight.getText().toString();
                value = (Integer.parseInt(strTwentyEight)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView28);
                result.setText("" + value);
            }

            // Pieces
            else if (v.getId() == R.id.subPieces) {   // Subtract
                textThirty = (TextView) rootview.findViewById(R.id.textView30);
                strThirty = textThirty.getText().toString();
                if (Integer.parseInt(strThirty) != 0) {
                    value = (Integer.parseInt(strTwentyEight)) - 1;
                    result = (TextView) rootview.findViewById(R.id.textView30);
                    result.setText("" + value);
                }
            } else if (v.getId() == R.id.addPieces) {   // Add
                textThirty = (TextView) rootview.findViewById(R.id.textView30);
                strThirty = textThirty.getText().toString();
                value = (Integer.parseInt(strThirty)) + 1;
                result = (TextView) rootview.findViewById(R.id.textView30);
                result.setText("" + value);
            }
        }
}
