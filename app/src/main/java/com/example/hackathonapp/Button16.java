package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button16 extends AppCompatActivity {

    PDFView pdf16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button16);

        pdf16 = (PDFView) findViewById(R.id.pdf16);
        pdf16.fromAsset("16.pdf").load();
    }
}
