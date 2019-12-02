package com.example.engdesoftware.Models;

import com.example.engdesoftware.BancoFK.Banco;

import java.util.ArrayList;

public class Sangue extends Banco {
    private String tipoView;

    @Override
    public String toString(){
        return getTipoView();
    }

    public String getTipoView() {
        return tipoView;
    }

    public void setTipoView(String tipoView) {
        this.tipoView = tipoView;
    }

    public static ArrayList<Sangue> getSangues(){

        return Banco.getSangues();
    }
}
