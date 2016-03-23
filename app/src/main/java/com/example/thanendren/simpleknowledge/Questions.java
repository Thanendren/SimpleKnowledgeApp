package com.example.thanendren.simpleknowledge;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Questions extends AppCompatActivity {

    TextView textView2;
    RadioGroup radioGroup;
    Button button2;
    RadioButton RadioButton, RadioButton2, RadioButton3;

    public static String questions[]={"First Question?","Second Question?", "Third Question?","Fourth Question"};
    String ans[]={"First Answer","Second Answer","Third Answer","Fourth Answer"};
    String opt[]={"First Answer","1w","1w","2w","2w","Second Answer","3w","Third Answer","3w","4w","4w","Fourth Answer"};

    int position=0;
    public static int correct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_questions);

        textView2 = (TextView)findViewById(R.id.textView2);
        button2 = (Button) findViewById(R.id.button2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton = (RadioButton) findViewById(R.id.radioButton);
        RadioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton3 = (RadioButton) findViewById(R.id.radioButton3);

        textView2.setText(questions[position]);
        RadioButton.setText(opt[0]);
        RadioButton2.setText(opt[1]);
        RadioButton3.setText(opt[2]);

        textView2.setText(questions[position]);
        RadioButton.setText(opt[position]);
        RadioButton2.setText(opt[(position)*3 + 1]);
        RadioButton3.setText(opt[(position)*3 + 2]);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                RadioButton selectedans = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                String selectedansText = selectedans.getText().toString();

                if (selectedansText == ans[position])
                {
                    correct++;
                }

                position++;

                if (position < questions.length) {

                    textView2.setText(questions[position]);
                    RadioButton.setText(opt[position * 3]);
                    RadioButton2.setText(opt[(position * 3) + 1]);
                    RadioButton3.setText(opt[(position * 3) + 2]);
                }

                else {
                    Intent in = new Intent(getApplicationContext(), Result.class);
                    startActivity(in);


                }


            }
        });
    }
}