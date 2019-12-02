package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.engdesoftware.Utils.Utils;

public class menuADM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_adm);
    }

    public void cadastraUsuarioBtnClick(View view) {
        startActivity(new Intent(menuADM.this, cadastroUsuario.class));
    }
    public  void atualizarUsuarioBtnClick(View view){
        Utils.menssagemAoUsuario("Sem funcionamento","Info",this);
    }
    public void buscaUsuarioBtnClick(View view){
        startActivity(new Intent(menuADM.this,  BuscarUsuario.class));
    }

    public void cadastraVacinaBtn(View view) {
        startActivity(new Intent(menuADM.this,  CadastroVacina.class));
    }

    public void atualizarVacinaBtnClick(View view) {

    }

    public void buscaVacinaBtnClicked(View view) {
        startActivity(new Intent(menuADM.this,BuscarVacina.class));
    }

    public void sairBtnClicked(View view) {
        finish();
    }

    public void cadastraVacinaBtnClick(View view) {
        startActivity(new Intent(menuADM.this,NovaVacinacao.class));
    }
}
