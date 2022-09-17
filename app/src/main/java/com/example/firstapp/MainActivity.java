package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    View mhs, jr, mk, nil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mhs = findViewById(R.id.btn_mhs);
        jr = findViewById(R.id.btn_jrs);
        mk = findViewById(R.id.btn_mk);
        nil = findViewById(R.id.btn_nilai);

        mhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MahasiswaActivity.class);
                startActivity(intent);
            }
        });

        jr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JurusanActivity.class);
                startActivity(intent);
            }
        });

        mk.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MataKuliahActivity.class);
                startActivity(intent);
            }
        }));

        nil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NilaiActivity.class);
                startActivity(intent);
            }
        });
    }
}