package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

import com.example.engdesoftware.BancoFK.Banco;
import com.example.engdesoftware.Models.Usuario;
import com.example.engdesoftware.Models.Vacinacao;
import com.example.engdesoftware.Utils.Utils;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class NovaVacinacao extends AppCompatActivity {
    private TextInputEditText vacinaCodigoTxt;
    private TextInputEditText cpfTxt;
    private CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_vacinacao);
        vacinaCodigoTxt = findViewById(R.id.codigoVacinaTxt);
        cpfTxt = findViewById(R.id.cpfPaciente);
        calendarView = findViewById(R.id.dataDaVacinacao);
    }

    public void cadastraBtnClicked(View view) {
        try{

            Vacinacao nova = new Vacinacao();
            nova.setVacina(Integer.parseInt(vacinaCodigoTxt.getText().toString()));
            nova.setUsuario(cpfTxt.getText().toString());
            nova.setData(calendarView.getDate());
            if(nova.postVacincao()){
                Utils.menssagemAoUsuario("Nova vacina cadastrada com sucesso","INFORMAÇÃO",this,()->{
                    finish();
                });
            } else{
                Utils.menssagemAoUsuario("Não foi possível cadastra a nova vacinação, verifica as informações digitadas e tente novamente","ERRO",this);
            }
        }catch (Exception ex){


        }

    }

}
