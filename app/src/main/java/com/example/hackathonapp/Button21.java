package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button21 extends AppCompatActivity {

    PDFView pdf21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button21);

        pdf21 = (PDFView) findViewById(R.id.pdf21);
        pdf21.fromAsset("21.pdf").load();
    }
}
