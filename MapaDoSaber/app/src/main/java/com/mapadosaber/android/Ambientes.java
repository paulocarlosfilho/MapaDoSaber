package com.mapadosaber.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ambientes extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambientes);

    }
    public void abrirEixo1(View v){
        Intent it_Eixo = new Intent(this, Eixo.class);
        startActivity(it_Eixo);
    }
}