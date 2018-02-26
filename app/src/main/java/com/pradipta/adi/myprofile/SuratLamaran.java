package com.pradipta.adi.myprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SuratLamaran extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surat_lamaran);

        pdfView = (PDFView) findViewById(R.id.cekpdf);
        pdfView.fromAsset("SURAT LAMARAN FULL.pdf").load();
    }
}
