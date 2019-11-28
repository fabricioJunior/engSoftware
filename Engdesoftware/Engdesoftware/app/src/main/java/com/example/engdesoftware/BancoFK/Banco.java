package com.example.engdesoftware.BancoFK;

import android.os.CpuUsageInfo;

import com.example.engdesoftware.Models.Usuario;

import java.util.ArrayList;


public class Banco {
    private ArrayList<Usuario> usuarios;

    public void loadDb(){
        usuarios = usuarios();
    }
    public  static  ArrayList<Usuario> usuarios(){
        ArrayList<Usuario> retorno = new ArrayList<Usuario>();
        Usuario normal = new Usuario();
        normal.setLogin("usuarioNormal");
        normal.setSenha("senha");
        normal.setAdm(false);
        Usuario admin = new Usuario();
        admin.setLogin("admin");
        admin.setSenha("admin");
        admin.setAdm(true);
        retorno.add(normal);
        retorno.add(admin);
        return retorno;
    }

}
