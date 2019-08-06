package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button30 extends AppCompatActivity {

    PDFView pdf30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button30);

        pdf30 = (PDFView) findViewById(R.id.pdf30);
        pdf30.fromAsset("30.pdf").load();
    }
}
