package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textViewMain = findViewById(R.id.textViewMain);
    }

    public void onBtnClick(View view) {
        this.textViewMain.setText("Text Changed Successfully");
    }

    public void onBtnClick2(View view) {
        textViewMain.setTextColor(Color.rgb(200,100,50));
    }
    // this.TextColor.setTextColor("");
}