package com.example.engdesoftware.BancoFK;

import com.example.engdesoftware.Models.Sangue;
import com.example.engdesoftware.Models.Usuario;
import com.example.engdesoftware.Models.Vacinas;

import java.util.ArrayList;


public class Banco {
    private static  ArrayList<Usuario> usuarios;
    private static ArrayList<Sangue>   sangues;
    private static ArrayList<Vacinas> vacinas;
    public static void loadDb(){
        usuarios = usuarios();
        sangues = sangues();
    }
    public static  ArrayList<Sangue> sangues(){
        ArrayList<Sangue> retorno = new ArrayList<Sangue>();
        Sangue Apositivo = new Sangue();
        Apositivo.setTipoView("A+");
        Sangue Anegativo = new Sangue();
        Anegativo.setTipoView("A-");
        Sangue Bpositivo = new Sangue();
        Bpositivo.setTipoView("B+");
        Sangue Bnegativo = new Sangue();
        Bnegativo.setTipoView("B-");
        Sangue ABpositivo = new Sangue();
        ABpositivo.setTipoView("AB+");
        Sangue ABnegativo = new Sangue();
        ABnegativo.setTipoView("AB-");
        Sangue Opositivo = new Sangue();
        Opositivo.setTipoView("O+");
        Sangue Onegativo = new Sangue();
        Onegativo.setTipoView("O-");
        retorno.add(Apositivo);
        retorno.add(Anegativo);
        retorno.add(Bpositivo);
        retorno.add(Bnegativo);
        retorno.add(ABpositivo);
        retorno.add(ABnegativo);
        retorno.add(Opositivo);
        retorno.add(Onegativo);
        return retorno;
    }
    public static  ArrayList<Usuario> usuarios(){
        ArrayList<Usuario> retorno = new ArrayList<Usuario>();
        Usuario normal = new Usuario();
        normal.setLogin("usuarioNormal");
        normal.setSenha("senha");
        normal.setAdm(false);
        normal.setNome_completo("Usuario normal");
        Usuario admin = new Usuario();
        admin.setLogin("admin");
        admin.setSenha("admin");
        admin.setNome_completo("Usuario admin");
        admin.setAdm(true);
        retorno.add(normal);
        retorno.add(admin);
        return retorno;
    }
    public static  ArrayList<Vacinas> vacinas(){


    }
    public  static  void postUser(Usuario novo){
          usuarios.add(novo);
    }
    public  static  Usuario getUser(Usuario busca){
        if(usuarios.contains(busca)){
            return usuarios.get(usuarios.indexOf(busca));
        }
        return  null;
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public static ArrayList<Sangue> getSangues() {
        return sangues;
    }

}
