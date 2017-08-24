package com.example.kevinmui.blank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Are You a Sloth?");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        final EditText gpaText = (EditText) findViewById(R.id.gpaText);
        final EditText sleepText = (EditText) findViewById(R.id.sleepText);
        Button calcButton = (Button) findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gpa = Float.parseFloat(gpaText.getText().toString());
                float sleep = Float.parseFloat(sleepText.getText().toString());
                float score = (float) (1/( 1 + Math.pow(Math.E,(-1*((((9*(4-gpa)+sleep)/36)*10)-5)))))*100;
                scoreTextView.setText(Float.toString(score)+"/100 points");
                gpaText.setText("");
                sleepText.setText("");
            }
        });
    }
}
