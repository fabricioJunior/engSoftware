package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.engdesoftware.Models.Usuario;

public class NovaVacinacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_vacinacao);
    }
    public  NovaVacinacao(Usuario user){
        super();
    }
}
