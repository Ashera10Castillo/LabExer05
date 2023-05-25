package com.example.handsonactivity_ashera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText txtInput1, txtInput2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput1 = findViewById(R.id.txt1);
        txtInput2 = findViewById(R.id.txt2);
    }

    public void swapTextFields(View view) {
        String temp = txtInput1.getText().toString();
        txtInput1.setText(txtInput2.getText().toString());
        txtInput2.setText(temp);
    }

    public void compareTextFields(View view) {
        String text1 = txtInput1.getText().toString();
        String text2 = txtInput2.getText().toString();

        Intent intent = new Intent(this, CompareResult.class);
        if (text1.equals(text2)) {
            intent.putExtra("result", "SAME");
        } else {
            intent.putExtra("result", "NOT THE SAME");
        }
        startActivity(intent);
    }
}
