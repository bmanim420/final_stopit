package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button13 extends AppCompatActivity {

    PDFView pdf13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button13);

        pdf13 = (PDFView) findViewById(R.id.pdf13);
        pdf13.fromAsset("13.pdf").load();
    }
}
