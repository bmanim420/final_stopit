package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button12 extends AppCompatActivity {

    PDFView pdf12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button12);

        pdf12 = (PDFView) findViewById(R.id.pdf12);
        pdf12.fromAsset("12.pdf").load();
    }
}
