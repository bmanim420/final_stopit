package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button19 extends AppCompatActivity {

    PDFView pdf19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button19);

        pdf19 = (PDFView) findViewById(R.id.pdf19);
        pdf19.fromAsset("19.pdf").load();
    }
}
