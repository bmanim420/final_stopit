package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button29 extends AppCompatActivity {

    PDFView pdf29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button29);

        pdf29 = (PDFView) findViewById(R.id.pdf29);
        pdf29.fromAsset("29.pdf").load();
    }
}
