package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textViewMain;
    private TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textViewMain = findViewById(R.id.textViewMain);
        this.editText = findViewById(R.id.editText);
    }

    public void onBtnClick(View view) {
        this.textViewMain.setText("Text Changed Successfully");
    }

    public void onBtnClick2(View view) {
        textViewMain.setTextColor(Color.rgb(200,100,50));
        editText.setTextColor(Color.rgb(0,200,50));

    }
    // this.TextColor.setTextColor("");
}