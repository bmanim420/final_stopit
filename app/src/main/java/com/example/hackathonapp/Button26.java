package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button26 extends AppCompatActivity {

    PDFView pdf26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button26);

        pdf26 = (PDFView) findViewById(R.id.pdf26);
        pdf26.fromAsset("26.pdf").load();
    }
}
