package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button27 extends AppCompatActivity {

    PDFView pdf27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button27);

        pdf27 = (PDFView) findViewById(R.id.pdf27);
        pdf27.fromAsset("27.pdf").load();
    }
}
