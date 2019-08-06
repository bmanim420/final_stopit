package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button31 extends AppCompatActivity {

    PDFView pdf31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button31);

        pdf31 = (PDFView) findViewById(R.id.pdf31);
        pdf31.fromAsset("31.pdf").load();
    }
}
