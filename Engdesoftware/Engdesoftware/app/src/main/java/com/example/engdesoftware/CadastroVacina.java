package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.engdesoftware.BancoFK.Banco;
import com.example.engdesoftware.Models.Vacinas;
import com.example.engdesoftware.Utils.Utils;
import com.google.android.material.textfield.TextInputEditText;

public class CadastroVacina extends AppCompatActivity {
    TextInputEditText nomeVacinaTxt;
    TextInputEditText codigoVacinaTxt;
    TextInputEditText quantidadeTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_vacina);
        nomeVacinaTxt = findViewById(R.id.nomeVacinaTxt);
        codigoVacinaTxt = findViewById(R.id.codigoVacinaTxt);
        quantidadeTxt = findViewById(R.id.quantidadeTxt);
    }
    public void cadastraBtnClicked(View view) {
        try {
            Vacinas nova = new Vacinas();
            nova.setNome(nomeVacinaTxt.getText().toString());
            nova.setCodigoVacina(Integer.parseInt( codigoVacinaTxt.getText().toString()));
            nova.setQuantidade(Integer.parseInt(quantidadeTxt.getText().toString()));
            if (Vacinas.postVacina(nova)) {
                Utils.menssagemAoUsuario("Nova vacina cadastrada com sucesso", "Informação", this,()->{
                     finish();
                });
            } else {
                Utils.menssagemAoUsuario("Verifique o codigo da vacina e tente novamente.", "Vacina já cadastrada", this);
            }
        } catch (Exception ex) {
            Utils.menssagemAoUsuario("Erro no cadastro,verifique as informações digitadas", "ERRO NO CADASTRO", this);
        }
    }
}
