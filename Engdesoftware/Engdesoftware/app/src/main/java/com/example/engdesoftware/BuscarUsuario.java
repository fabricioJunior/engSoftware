package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.engdesoftware.BancoFK.Banco;
import com.example.engdesoftware.Models.Usuario;
import com.example.engdesoftware.Utils.UsuarioConectado;
import com.example.engdesoftware.Utils.Utils;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import static android.R.layout.list_content;

public class BuscarUsuario extends AppCompatActivity {
    public static  Usuario resultado;
    TextInputEditText cpfTxt;
    TextView nome;
    TextInputEditText nomeTxt;
    Button confirma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_usuario);
        cpfTxt = findViewById(R.id.cpfTxt);
        nome = findViewById(R.id.nomeLabel);
        nomeTxt = findViewById(R.id.nomeTxt);
        confirma = findViewById(R.id.confirmaBtn);

    }
    public void buscaUsuarioBtnClicked(View view) {
        resultado = Usuario.getUser(cpfTxt.getText().toString());
        if(resultado == null){
            Utils.menssagemAoUsuario("Usuário não encontrado","ERRO",this);

            nome.setVisibility(View.INVISIBLE);
            nomeTxt.setVisibility(View.INVISIBLE);
            confirma.setVisibility(View.INVISIBLE);
        }else{
            UsuarioConectado.UsuarioSelecionado = resultado;
            nomeTxt.setText(resultado.getNome_completo());
            cpfTxt.setVisibility(View.VISIBLE);
            nome.setVisibility(View.VISIBLE);
            nomeTxt.setVisibility(View.VISIBLE);
            confirma.setVisibility(View.VISIBLE);
        }
    }

    public void confirmaBtnClicked(View view) {
        if(UsuarioConectado.USER.isAdm()){
            startActivity(new Intent(this, HistoricoVacinas.class));
        }
    }
}
