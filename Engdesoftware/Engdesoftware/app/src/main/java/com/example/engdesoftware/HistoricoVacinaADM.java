package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.engdesoftware.Models.Usuario;

public class HistoricoVacinaADM extends AppCompatActivity {

    Usuario selecionado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico_vacina_adm);
        selecionado = BuscarUsuario.resultado;
    }


}
