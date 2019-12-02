package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.engdesoftware.BancoFK.Banco;
import com.example.engdesoftware.Models.Usuario;
import com.example.engdesoftware.Models.Vacinacao;
import com.example.engdesoftware.Utils.UsuarioConectado;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HistoricoVacinas extends AppCompatActivity {
    private TextView cpfLabel;
    private TextView nomeLabel;
    private ListView vacinaView;
    private Usuario selecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico_vacinas);
        cpfLabel = findViewById(R.id.cpfLabel);
        nomeLabel = findViewById(R.id.nomePacienteLabel);
        if(!UsuarioConectado.USER.isAdm()){
            UsuarioConectado.UsuarioSelecionado =  UsuarioConectado.USER;
        }
        selecionado = UsuarioConectado.UsuarioSelecionado;
        vacinaView = findViewById(R.id.vacinasList);
        cpfLabel.setText(selecionado.getCpf());
        nomeLabel.setText(selecionado.getNome_completo());
        ArrayAdapter<Vacinacao> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,selecionado.getVacinacaos());
        vacinaView.setAdapter(adapter);
    }


    public void voltaBtnClicked(View view) {
       finish();
    }
}
