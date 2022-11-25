package com.example.appapi1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView theCorrectAnsTextView, textviewcolour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theCorrectAnsTextView = (TextView)findViewById(R.id.textView2);
        textviewcolour=(TextView)findViewById(R.id.textView);
        //defining textviewcolour by getting id of desired textview from xml file
    }
    public void wrongAns(View view) {
        theCorrectAnsTextView.setText("TextView text has changed!");
    }

    public void changecolour(View view) {
        textviewcolour.setTextColor(Color.RED);
//created method to change colour (not really but just used one)


    }
}
