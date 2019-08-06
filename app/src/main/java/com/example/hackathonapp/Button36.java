package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button36 extends AppCompatActivity {

    PDFView pdf36;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button36);

        pdf36 = (PDFView) findViewById(R.id.pdf36);
        pdf36.fromAsset("36.pdf").load();
    }
}
