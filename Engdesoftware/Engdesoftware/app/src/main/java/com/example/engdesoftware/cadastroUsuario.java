package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.example.engdesoftware.BancoFK.Banco;
import com.example.engdesoftware.Models.Sangue;
import com.example.engdesoftware.Models.Usuario;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class cadastroUsuario extends AppCompatActivity {


    TextInputEditText nomeCompletoTxt;
    TextInputEditText cpfTxt;
    TextInputEditText nomeCompletoPaiTxt;
    TextInputEditText nomeCompletoMaeTxt;
    Spinner tipoSangue;
    AppCompatCheckBox contemAlergiaBox;
    TextInputEditText historicoFamiliar;
    TextInputEditText telefoneTxt;
    Spinner estadoCivil;
    TextInputEditText estadoTxt;
    TextInputEditText cidadeTxt;
    TextInputEditText ruaTxt;
    TextInputEditText numeroTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
        tipoSangue = findViewById(R.id.tipoSangueBox);
        estadoCivil = findViewById(R.id.estadoCivilBox);
        nomeCompletoTxt = findViewById(R.id.nomeCompletoTxt);
        cpfTxt = findViewById(R.id.cpfTxt);
        nomeCompletoPaiTxt = findViewById(R.id.nomeCompletoPaiTxt);
        nomeCompletoMaeTxt  = findViewById(R.id.nomeCompletoMaeTxt);
        contemAlergiaBox = findViewById(R.id.contemAlergiaBox);
        historicoFamiliar = findViewById(R.id.historicoFamiliarTxt);
        telefoneTxt = findViewById(R.id.telefoneTxt);
        estadoTxt = findViewById(R.id.estadoTxt);
        cidadeTxt = findViewById(R.id.cidadeTxt);
        ruaTxt = findViewById(R.id.ruaTxt);
        numeroTxt = findViewById(R.id.ruaTxt);
        loadSpinner();
        loadEstadoCivilBox();
    }
    private void loadSpinner(){
        ArrayList<Sangue> sangues = Banco.sangues();
        ArrayAdapter<Sangue> adapter = new ArrayAdapter<Sangue>(this, android.R.layout.simple_spinner_dropdown_item,sangues);
        tipoSangue.setAdapter(adapter);
    }
    private void loadEstadoCivilBox(){
        String[] items = new String[]{"CASADO(A)", "SOLTEIRO(A)", "VIUVO(A)"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        estadoCivil.setAdapter(adapter);
    }

    public void cadastraBtnClicked(View view) {
        Usuario novo = new Usuario();
        novo.setNome_completo(nomeCompletoTxt.getText().toString());
        novo.setCpf(cpfTxt.getText().toString());
        novo.setNome_completo_pai(nomeCompletoPaiTxt.getText().toString());
        novo.setNome_completo_mae(nomeCompletoMaeTxt.getText().toString());
        novo.setContemAlergia(contemAlergiaBox.getLinksClickable());
        novo.setTipoSangueno((Sangue)tipoSangue.getSelectedItem());
        novo.setDoencasNaFamilia(historicoFamiliar.getText().toString());
        novo.setTelefone(telefoneTxt.getText().toString());
        novo.setEstadoCivil(estadoCivil.getSelectedItem().toString());
        novo.setEstado(estadoTxt.getText().toString());
        novo.setCidade(cidadeTxt.getText().toString());
        novo.setRua(ruaTxt.getText().toString());
        novo.setNumero(numeroTxt.getText().toString());

    }
}
