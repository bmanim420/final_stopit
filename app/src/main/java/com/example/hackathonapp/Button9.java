package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button9 extends AppCompatActivity {

    PDFView pdf9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button9);

        pdf9 = (PDFView) findViewById(R.id.pdf9);
        pdf9.fromAsset("9.pdf").load();
    }
}
