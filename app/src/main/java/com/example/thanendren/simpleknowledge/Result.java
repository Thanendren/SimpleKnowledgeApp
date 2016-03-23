package com.example.thanendren.simpleknowledge;

/**
 * Created by Thanendren on 21/3/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Result extends AppCompatActivity {

    TextView textView3;
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        textView3 = (TextView) findViewById(R.id.textView3);
        button3 = (Button) findViewById(R.id.button3);
        textView3.setText("Your Final Result Is " + Questions.correct + "/" + Questions.questions.length);

        Questions.correct=0;

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);}


        });


    }
}