package com.example.engdesoftware.Models;

public class Vacinas {
    private int codigoVacina;
    private String nome;
    private int quantidade;

    public int getCodigoVacina() {
        return codigoVacina;
    }

    public void setCodigoVacina(int codigoVacina) {
        this.codigoVacina = codigoVacina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object x) {
        if (x == null || x.getClass() != x.getClass()) {
            return false;
        }
        return this.codigoVacina == ((Vacinas) x).codigoVacina;
    }

}
