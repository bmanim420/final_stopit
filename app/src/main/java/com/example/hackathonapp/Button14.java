package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button14 extends AppCompatActivity {

    PDFView pdf14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button14);

        pdf14 = (PDFView) findViewById(R.id.pdf14);
        pdf14.fromAsset("14.pdf").load();
    }
}
