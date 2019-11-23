package com.example.mrinal.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    int a;

    public void Toasting(String toastIt)
    {
        Toast.makeText(MainActivity.this, toastIt, Toast.LENGTH_SHORT).show();
    }

    public void guessMe(View view)
    {

       EditText text=(EditText)findViewById(R.id.getNumber);
       int b=Integer.valueOf(text.getText().toString());
       if(a==b) {
           Toasting("Correct! Try again!");
           a = (int) (Math.random() * 20);
       }
       else if(a>b)
           Toasting("Higher");
       else if(a<b)
           Toasting("Lower");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(int)(Math.random()*20);
    }
}
