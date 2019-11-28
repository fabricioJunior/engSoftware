package com.example.engdesoftware.Models;

import com.google.gson.Gson;

public class Usuario {
    private String login;
    private String senha;
    private boolean isAdm;
    private String 
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    ///No lugar da condição incrementa metodo de GET(API)
    public boolean loginCorreto(String login, String senha){
       return this.login.equals(login) && this.senha.equals(senha);
    }

    public boolean isAdm() {
        return isAdm;
    }

    public void setAdm(boolean adm) {
        isAdm = adm;
    }

    @Override
    public  boolean equals(Object x){
         return  (x != null) &&
    }
}
