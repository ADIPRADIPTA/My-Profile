package com.pradipta.adi.myprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CurriculumVitae extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculum_vitae);

        pdfView = (PDFView) findViewById(R.id.pdfview);
        pdfView.fromAsset("CV Adi Pradipta.pdf").load();
    }

}
