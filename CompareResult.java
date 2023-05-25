package com.example.handsonactivity_ashera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CompareResult extends AppCompatActivity {
    private TextView txtToDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_result);

        txtToDisplay = findViewById(R.id.txt);

        Intent intent = getIntent();
        String theResult = intent.getStringExtra("result");
        txtToDisplay.setText(theResult);
    }

    public void backToMain(View view) {
        finish();
    }
}
