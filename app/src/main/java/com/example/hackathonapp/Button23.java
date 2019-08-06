package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button23 extends AppCompatActivity {

    PDFView pdf23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button23);

        pdf23 = (PDFView) findViewById(R.id.pdf23);
        pdf23.fromAsset("23.pdf").load();
    }
}
