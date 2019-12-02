package com.example.engdesoftware.Utils;


import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.example.engdesoftware.MainActivity;

import static android.widget.Toast.LENGTH_SHORT;

public class Utils {
    public static void menssagemAoUsuario(String mensagem, String titulo, final Context context) {
        AlertDialog alerta;
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        //define o titulo
        builder.setTitle(titulo);
        //define a mensagem
        builder.setMessage(mensagem);
        //define um botão como positivo
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(context, "ok", LENGTH_SHORT).show();
            }
        });
        //cria o AlertDialog
        alerta = builder.create();

        //Exibe
        alerta.show();
    }
    public static void menssagemAoUsuario(String mensagem, String titulo, final Context view, final Runnable action ) {
        AlertDialog alerta;
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(view);
        //define o titulo
        builder.setTitle(titulo);
        //define a mensagem
        builder.setMessage(mensagem);
        //define um botão como positivo
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(view, "ok", LENGTH_SHORT).show();
                if(action != null){
                    action.run();
                }
            }
        });
        //cria o AlertDialog
        alerta = builder.create();

        //Exibe
        alerta.show();
    }
}
