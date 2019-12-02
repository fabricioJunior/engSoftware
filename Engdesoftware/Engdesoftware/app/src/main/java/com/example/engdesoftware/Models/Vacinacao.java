package com.example.engdesoftware.Models;

import android.provider.ContactsContract;

import com.example.engdesoftware.BancoFK.Banco;

import java.util.Date;


public class Vacinacao extends  Banco {
    private Vacinas vacina;
    private Usuario usuario;
    private Date data;
    private int qtd;

    public  boolean postVacincao(){
        try {
            Banco.postVacinacao(this);
            return true;
        } catch (Exception ex) {

        }
        return false;
    }

    public Vacinacao(){
        vacina = new Vacinas();
        usuario = new Usuario();
    }
    public Vacinas getVacina() {
        return vacina;
    }

    public void setVacina(Vacinas vacina) {
        this.vacina = vacina;
    }
    public void setVacina(int codigoVacina){
       vacina = getVacina(codigoVacina);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setUsuario(String cpf){
        this.usuario = getUser(cpf);
    }
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }



    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    public void setData(long data){
         this.data = new Date(data);
    }

    @Override
    public boolean equals(Object x ){
        if(x == null || x.getClass() != this.getClass()){
            return  false;
        }
        Vacinacao y = (Vacinacao) x;
        return vacina.equals(y.getVacina()) && usuario.equals(y.getUsuario()) && data.equals(y.getData());
    }

    @Override
    public String toString(){
        return vacina.getNome() + " " + data.toString();

    }
}
