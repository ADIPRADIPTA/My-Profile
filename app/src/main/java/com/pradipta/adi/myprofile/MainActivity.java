package com.pradipta.adi.myprofile;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout llButtonInstagram, llButtonGithub, llButtonFacebook;
    ImageButton imageButtoninstagram, imageButtongithub, imageButtonfacebook;
    Button Btncv, Btnlamaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtoninstagram = (ImageButton) findViewById(R.id.imageButtoninstagram);
        imageButtongithub = (ImageButton) findViewById(R.id.imageButtongithub);
        imageButtonfacebook = (ImageButton) findViewById(R.id.imageButtonfacebook);
        Btncv = (Button)findViewById(R.id.Btncv);
        Btnlamaran = (Button)findViewById(R.id.Btnlamaran);

        imageButtoninstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.instagram.com/pradipta6161/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        imageButtongithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.github.com/ADIPRADIPTA";

                Intent g = new Intent(Intent.ACTION_VIEW);
                g.setData(Uri.parse(url));
                startActivity(g);
            }
        });

        imageButtonfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.facebook.com/arezpecta2?ref=bookmarks";

                Intent f = new Intent(Intent.ACTION_VIEW);
                f.setData(Uri.parse(url));
                startActivity(f);
            }
        });

        Btncv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cv = new Intent(MainActivity.this, CurriculumVitae.class);
                startActivity(cv);
            }
        });

        Btnlamaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lamaran = new Intent(MainActivity.this, SuratLamaran.class);
                startActivity(lamaran);
            }
        });
    }

    @Override
    public void onBackPressed() {
        this.close();
    }
    public void close() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Anda Benar-Benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();
    }
}
