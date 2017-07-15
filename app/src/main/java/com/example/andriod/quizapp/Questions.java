package com.example.andriod.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Questions extends AppCompatActivity {
    public static int Score = 0;
    Button submit;
    TextView etext;
    Button finalSubmit;
    TextView etext_2;
    private RadioGroup radioGroup_1;
    private RadioButton radioButton_1;
    private Button btnDisplay_1;
    private RadioGroup radioGroup_2;
    private RadioButton radioButton_2;
    private Button btnDisplay_2;
    private RadioGroup radioGroup_3;
    private RadioButton radioButton_3;
    private Button btnDisplay_3;
    private CheckBox chkCg, chkL, chkP, chkN;
    private Button btnDisplay_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        etext = (TextView) findViewById(R.id.ques1_ans);
        submit = (Button) findViewById(R.id.ques1_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str1 = etext.getText().toString();
                if (str1.equals("Goods And Services Tax")) {
                    Score = Score + 10;
                    Toast.makeText(getApplicationContext(),
                            "Good Job, Carry on", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "check once, you might spell it wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        addListenerOnButton();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        etext_2 = (TextView) findViewById(R.id.ques6_ans);
        finalSubmit = (Button) findViewById(R.id.final_submit);
        finalSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str1 = etext.getText().toString();
                if (str1.equals("Arun Jaitley")) {
                    Score = Score + 10;
                }
            }
        });
        if (finalSubmit != null) {
            finalSubmit.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent quizIntent = new Intent(getApplicationContext(), ScoreActivity.class);
                    startActivity(quizIntent);
                }
            });
        }
    }

    public void addListenerOnButton() {

        radioGroup_1 = (RadioGroup) findViewById(R.id.radio_1);
        btnDisplay_1 = (Button) findViewById(R.id.ques2_submit);

        btnDisplay_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // get selected radio button from radioGroup
                int selectedId = radioGroup_1.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton_1 = (RadioButton) findViewById(selectedId);
                if ("Canada".equals(radioButton_1.getText())) {
                    Questions.Score = Questions.Score + 10;
                    Toast.makeText(getApplicationContext(),
                            radioButton_1.getText(), Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Try Again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void addListenerOnButton2() {

        radioGroup_2 = (RadioGroup) findViewById(R.id.radio_2);
        btnDisplay_2 = (Button) findViewById(R.id.ques3_submit);

        btnDisplay_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // get selected radio button from radioGroup
                int selectedId = radioGroup_2.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton_2 = (RadioButton) findViewById(selectedId);
                if ("Service Tax".equals(radioButton_2.getText())) {
                    Questions.Score = Questions.Score + 10;
                    Toast.makeText(getApplicationContext(),
                            radioButton_2.getText(), Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Try Again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void addListenerOnButton3() {

        radioGroup_3 = (RadioGroup) findViewById(R.id.radio_3);
        btnDisplay_3 = (Button) findViewById(R.id.ques5_submit);

        btnDisplay_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // get selected radio button from radioGroup
                int selectedId = radioGroup_3.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton_3 = (RadioButton) findViewById(selectedId);
                if ("To increase government revenue".equals(radioButton_3.getText())) {
                    Questions.Score = Questions.Score + 10;
                    Toast.makeText(getApplicationContext(),
                            radioButton_3.getText(), Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void addListenerOnButton4() {

        chkCg = (CheckBox) findViewById(R.id.optn_1_ques4);
        chkL = (CheckBox) findViewById(R.id.optn_2_ques4);
        chkP = (CheckBox) findViewById(R.id.optn_3_ques4);
        chkN = (CheckBox) findViewById(R.id.optn_4_ques4);
        btnDisplay_4 = (Button) findViewById(R.id.ques4_submit);
        btnDisplay_4.setOnClickListener(new View.OnClickListener() {
            //Run when button is clicked
            @Override
            public void onClick(View view) {
                if (chkCg.isChecked() && chkL.isChecked() && chkP.isChecked() && chkN.isChecked()) {
                    Questions.Score = Questions.Score + 10;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Try Again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}




