package com.example.robo.dz1;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CounterActivity extends AppCompatActivity {

    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        Button countBtn = findViewById(R.id.count_btn);
        Button resetBtn = findViewById(R.id.reset_btn);
        final TextView countTextView = findViewById(R.id.count_txt);

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                countTextView.setText(String.valueOf(count));

                //Even number -> green, Odd number -> blue
                int color;
                if(count % 2 == 0){
                    color = getResources().getColor(R.color.green);
                }else{
                    color = getResources().getColor(R.color.blue);
                }
                countTextView.setTextColor(color);
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                countTextView.setText(String.valueOf(count));
                countTextView.setTextColor(getResources().getColor(R.color.black));
            }
        });
    }
}
