package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button3 extends AppCompatActivity {

    PDFView pdf3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

        pdf3 = (PDFView) findViewById(R.id.pdf3);
        pdf3.fromAsset("3.pdf").load();
    }
}
