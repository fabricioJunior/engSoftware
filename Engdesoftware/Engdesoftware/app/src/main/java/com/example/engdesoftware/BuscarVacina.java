package com.example.engdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.engdesoftware.Models.Vacinas;
import com.google.android.material.textfield.TextInputEditText;

public class BuscarVacina extends AppCompatActivity {
    private TextInputEditText nomeVacina;
    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_vacina);
        nomeVacina = findViewById(R.id.nomeVacinaTxt);
        list = findViewById(R.id.vacinasList);
    }


    public void buscaVacinaBtnClicked(View view) {
        ArrayAdapter<Vacinas> vacinasList = new ArrayAdapter<Vacinas>(this,android.R.layout.simple_list_item_1,Vacinas.getVacinas(nomeVacina.getText().toString()));
        list.setAdapter(vacinasList);
    }

    public void voltaBtnClicked(View view) {
        finish();
    }
}
