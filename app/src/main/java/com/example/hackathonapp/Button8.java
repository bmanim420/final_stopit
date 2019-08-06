package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button8 extends AppCompatActivity {

    PDFView pdf8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button8);

        pdf8 = (PDFView) findViewById(R.id.pdf8);
        pdf8.fromAsset("8.pdf").load();
    }
}
