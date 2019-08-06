package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button5 extends AppCompatActivity {

    PDFView pdf5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button5);

        pdf5 = (PDFView) findViewById(R.id.pdf5);
        pdf5.fromAsset("5.pdf").load();
    }
}
