package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button28 extends AppCompatActivity {

    PDFView pdf28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button28);

        pdf28 = (PDFView) findViewById(R.id.pdf28);
        pdf28.fromAsset("28.pdf").load();
    }
}
