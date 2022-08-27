package com.mapadosaber.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Eixo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eixo);
    }

    public void abrirBocaJacare(View v){
        Intent intent = new Intent(this, BocaJacare.class);
        startActivity(intent);
    }
    public void abrirDancinhaCorpo(View v){
        Intent intent = new Intent(this, DancinhaCorpo.class);
        startActivity(intent);
    }
    public void abrirCabecaOmbroJoelhoPe(View v){
        Intent intent = new Intent(this, CabecaOmbroJoelhoPe.class);
        startActivity(intent);
    }

    public void abrirMexendoPartesCorpo(View v){
        Intent intent = new Intent(this, MexendoPartesCorpo.class);
        startActivity(intent);
    }

    public void abrirSugestaoMusical1(View v){
        Intent intent = new Intent(this, SugestaoMusical1.class);
        startActivity(intent);
    }

    public void abrirSugestaoMusical2(View v){
        Intent intent = new Intent(this, SugestaoMusical2.class);
        startActivity(intent);
    }
}