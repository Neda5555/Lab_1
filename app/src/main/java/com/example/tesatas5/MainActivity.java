package com.example.tesatas5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textViewmain = findViewById(R.id.textViewmain);
    }

    public void bottonchangeclick(View view) {
        this.textViewmain.setText("Labas");
    }
    public void bottonchangecolor (View view)
    {
        this.textViewmain.setTextColor(Color.argb(255, 255, 0, 0));
    }
}