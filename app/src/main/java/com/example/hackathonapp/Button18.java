package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button18 extends AppCompatActivity {

    PDFView pdf18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button18);

        pdf18 = (PDFView) findViewById(R.id.pdf18);
        pdf18.fromAsset("18.pdf").load();
    }
}
