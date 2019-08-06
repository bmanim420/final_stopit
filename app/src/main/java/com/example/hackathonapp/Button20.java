package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button20 extends AppCompatActivity {

    PDFView pdf20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button20);

        pdf20 = (PDFView) findViewById(R.id.pdf20);
        pdf20.fromAsset("20.pdf").load();
    }
}
