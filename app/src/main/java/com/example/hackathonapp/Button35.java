package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button35 extends AppCompatActivity {

    PDFView pdf35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button35);

        pdf35 = (PDFView) findViewById(R.id.pdf35);
        pdf35.fromAsset("35.pdf").load();
    }
}
