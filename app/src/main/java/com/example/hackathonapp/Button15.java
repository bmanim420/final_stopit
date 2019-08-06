package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button15 extends AppCompatActivity {

    PDFView pdf15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button15);

        pdf15 = (PDFView) findViewById(R.id.pdf15);
        pdf15.fromAsset("15.pdf").load();
    }
}
