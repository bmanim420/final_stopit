package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button10 extends AppCompatActivity {

    PDFView pdf10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button10);

        pdf10 = (PDFView) findViewById(R.id.pdf10);
        pdf10.fromAsset("10.pdf").load();
    }
}
