package com.example.andriod.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView scoreView = (TextView) findViewById(R.id.score_view);
        scoreView.setText(String.valueOf(Questions.Score));
        Toast.makeText(getApplicationContext(),
                "You are Awesome", Toast.LENGTH_LONG).show();

    }
}
