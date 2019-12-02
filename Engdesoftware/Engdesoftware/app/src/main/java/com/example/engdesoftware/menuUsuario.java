package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.engdesoftware.Models.Usuario;
import com.example.engdesoftware.Utils.UsuarioConectado;

public class menuUsuario extends AppCompatActivity {
    Usuario selecionado;
    TextView nomeClienteLabel;
    TextView cpfClienteLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);
        selecionado = UsuarioConectado.USER;
        nomeClienteLabel = findViewById(R.id.nomePacienteLabel);
        cpfClienteLabel = findViewById(R.id.cpfPacienteLabel);
        nomeClienteLabel.setText(selecionado.getNome_completo());
        cpfClienteLabel.setText(selecionado.getCpf());
    }

    public void buscaUsuarioBtnClicked(View view) {


    }

    public void informacaoPessoalBtnClicked(View view) {
    }

    public void historicoDeVacinasBtnClicked(View view) {
        startActivity(new Intent(this,HistoricoVacinas.class));
    }

    public void sairBtnClicked(View view) {
        finish();
    }
}
