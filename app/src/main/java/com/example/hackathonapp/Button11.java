package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button11 extends AppCompatActivity {

    PDFView pdf11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button11);

        pdf11 = (PDFView) findViewById(R.id.pdf11);
        pdf11.fromAsset("11.pdf").load();
    }
}
