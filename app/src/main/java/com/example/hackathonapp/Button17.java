package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button17 extends AppCompatActivity {

    PDFView pdf17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button17);

        pdf17 = (PDFView) findViewById(R.id.pdf17);
        pdf17.fromAsset("17.pdf").load();
    }
}
