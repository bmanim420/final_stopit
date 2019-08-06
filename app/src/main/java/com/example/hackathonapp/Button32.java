package com.example.hackathonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Button32 extends AppCompatActivity {

    PDFView pdf32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button32);

        pdf32 = (PDFView) findViewById(R.id.pdf32);
        pdf32.fromAsset("32.pdf").load();
    }
}
