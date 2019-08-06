package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button24 extends AppCompatActivity {

    PDFView pdf24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button24);

        pdf24 = (PDFView) findViewById(R.id.pdf24);
        pdf24.fromAsset("24.pdf").load();
    }
}
