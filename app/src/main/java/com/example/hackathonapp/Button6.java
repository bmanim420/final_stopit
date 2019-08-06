package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button6 extends AppCompatActivity {

    PDFView pdf6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button6);

        pdf6 = (PDFView) findViewById(R.id.pdf6);
        pdf6.fromAsset("6.pdf").load();
    }
}
