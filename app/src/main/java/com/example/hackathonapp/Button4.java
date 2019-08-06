package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button4 extends AppCompatActivity {

    PDFView pdf4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button4);

        pdf4 = (PDFView) findViewById(R.id.pdf4);
        pdf4.fromAsset("4.pdf").load();
    }
}
