package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button22 extends AppCompatActivity {

    PDFView pdf22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button22);

        pdf22 = (PDFView) findViewById(R.id.pdf22);
        pdf22.fromAsset("22.pdf").load();
    }
}
