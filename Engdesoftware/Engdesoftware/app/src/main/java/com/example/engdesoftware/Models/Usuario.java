package com.example.engdesoftware.Models;

import com.example.engdesoftware.BancoFK.Banco;

public class Usuario {
    private String cpf;
    private String nome_completo;
    private String nome_completo_pai;
    private String nome_completo_mae;
    private boolean contemAlergia;
    private Sangue tipoSangueno;
    private String doencasNaFamilia;
    private String telefone;
    private String estadoCivil;
    private String estado;
    private String cidade;
    private String rua;
    private String numero;

    private String login;
    private String senha;
    private boolean isAdm;


    public boolean postUser() {
        try {
            Banco.postUser(this);
        } catch (Exception ex) {

        }
        return false;
    }

    ///No lugar da condição incrementa metodo de GET(API)
    public boolean loginCorreto(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

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

    public boolean isAdm() {
        return isAdm;
    }

    public void setAdm(boolean adm) {
        isAdm = adm;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getNome_completo_pai() {
        return nome_completo_pai;
    }

    public void setNome_completo_pai(String nome_completo_pai) {
        this.nome_completo_pai = nome_completo_pai;
    }

    public String getNome_completo_mae() {
        return nome_completo_mae;
    }

    public void setNome_completo_mae(String nome_completo_mae) {
        this.nome_completo_mae = nome_completo_mae;
    }

    public boolean isContemAlergia() {
        return contemAlergia;
    }

    public void setContemAlergia(boolean contemAlergia) {
        this.contemAlergia = contemAlergia;
    }

    public Sangue getTipoSangueno() {
        return tipoSangueno;
    }

    public void setTipoSangueno(Sangue tipoSangueno) {
        this.tipoSangueno = tipoSangueno;
    }

    public String getDoencasNaFamilia() {
        return doencasNaFamilia;
    }

    public void setDoencasNaFamilia(String doencasNaFamilia) {
        this.doencasNaFamilia = doencasNaFamilia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
       return nome_completo;
    }
    @Override
    public boolean equals(Object x) {
        if (x == null || x.getClass() != this.getClass()) {
            return false;
        }
        return getCpf().equals(((Usuario) x).getCpf());
    }
}
