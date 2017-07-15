package com.example.andriod.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView quiz = (TextView) findViewById(R.id.quiz_text);
        if(quiz!=null) {
            quiz.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent quizIntent = new Intent(MainActivity.this, Questions.class);
                    startActivity(quizIntent);
                }
            });
        }
    }
}
