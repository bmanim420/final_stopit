package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button25 extends AppCompatActivity {

    PDFView pdf25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button25);

        pdf25 = (PDFView) findViewById(R.id.pdf25);
        pdf25.fromAsset("25.pdf").load();
    }
}
