package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button7 extends AppCompatActivity {

    PDFView pdf7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button7);

        pdf7 = (PDFView) findViewById(R.id.pdf7);
        pdf7.fromAsset("7.pdf").load();
    }
}
