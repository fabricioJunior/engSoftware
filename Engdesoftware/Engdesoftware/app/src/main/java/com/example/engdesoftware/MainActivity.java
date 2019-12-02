package com.example.engdesoftware;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.engdesoftware.BancoFK.Banco;
import com.example.engdesoftware.Models.Usuario;
import com.example.engdesoftware.Utils.UsuarioConectado;
import com.example.engdesoftware.Utils.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;

import java.util.ArrayList;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    private Button entraBtn;
    private TextInputEditText loginTxt;
    private TextInputEditText senhaTxt;
    private AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banco.loadDb();
        entraBtn = findViewById(R.id.entrarButton);
        entraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entraBtnClick(v);
            }
        });
        loginTxt = findViewById(R.id.loginTxt);
        senhaTxt = findViewById(R.id.senhaTxt);

    }

    public void entraBtnClick(View view) {

        if (loginTxt.getText().toString() == "") {
            Utils.menssagemAoUsuario("Por favor digite o seu login", "ERRO", this);
            return;
        }
        if (senhaTxt.getText().toString().equals("")) {
            Utils.menssagemAoUsuario("Por favor digite sua senha", "ERRO", this);
            return;
        }
        Usuario login = Usuario.loginCorreto(loginTxt.getText().toString(), senhaTxt.getText().toString());
        if (login == null) {
            Utils.menssagemAoUsuario("Usuário ou senha incorretos", "Falha no login", this);
        } else {
            UsuarioConectado.USER = login;
            if (login.isAdm()) {
                startActivity(new Intent(MainActivity.this, menuADM.class));
            } else {
                startActivity(new Intent(MainActivity.this, menuUsuario.class));
            }
        }
    }




}
