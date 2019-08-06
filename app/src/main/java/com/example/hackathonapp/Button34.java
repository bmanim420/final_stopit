package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button34 extends AppCompatActivity {

    PDFView pdf34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button34);

        pdf34 = (PDFView) findViewById(R.id.pdf34);
        pdf34.fromAsset("34.pdf").load();
    }
}
