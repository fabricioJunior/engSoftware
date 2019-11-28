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
import com.google.android.material.textfield.TextInputEditText;

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
            menssagemAoUsuario("Por favor digite o seu login", "ERRO");
            return;
        }
        if (senhaTxt.getText().toString().equals("")) {
            menssagemAoUsuario("Por favor digite sua senha", "ERRO");
            return;
        }
        Usuario login = loginCorreto(loginTxt.getText().toString(), senhaTxt.getText().toString());
        if (login == null) {
            menssagemAoUsuario("Usuário ou senha incorretos", "Falha no login");
        } else {
            UsuarioConectado.USER = login;
            if (login.isAdm()) {
                startActivity(new Intent(MainActivity.this, menuADM.class));
            } else {
                startActivity(new Intent(MainActivity.this, menuUsuario.class));
            }
        }

    }

    private Usuario loginCorreto(String login, String senha) {
        ArrayList<Usuario> users = Banco.usuarios();
        for (Usuario user : users) {
            if (user.loginCorreto(login, senha)) {
                return user;
            }
        }
        return null;
    }

    private void menssagemAoUsuario(String mensagem, String titulo) {
        AlertDialog alerta;
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle(titulo);
        //define a mensagem
        builder.setMessage(mensagem);
        //define um botão como positivo
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "positivo=" + arg1, LENGTH_SHORT).show();
            }
        });
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }
}
