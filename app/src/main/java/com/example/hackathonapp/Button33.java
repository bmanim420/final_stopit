package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button33 extends AppCompatActivity {

    PDFView pdf33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button33);

        pdf33 = (PDFView) findViewById(R.id.pdf33);
        pdf33.fromAsset("33.pdf").load();
    }
}
