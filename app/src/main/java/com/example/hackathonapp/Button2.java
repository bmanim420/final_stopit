package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button2 extends AppCompatActivity {

    PDFView pdf2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);

        pdf2 = (PDFView) findViewById(R.id.pdf2);
        pdf2.fromAsset("2.pdf").load();
    }
}
