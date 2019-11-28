package com.example.engdesoftware.Models;

public class Sangue {
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
}
