package com.example.engdesoftware.Models;

public class Vacinacao {
    private Vacinas vacina;
    private Usuario usuario;
    private int qtd;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
