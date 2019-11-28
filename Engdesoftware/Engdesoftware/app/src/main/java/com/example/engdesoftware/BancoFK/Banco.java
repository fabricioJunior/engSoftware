package com.example.engdesoftware.BancoFK;

import android.widget.ArrayAdapter;

import com.example.engdesoftware.Models.Sangue;
import com.example.engdesoftware.Models.Usuario;
import com.example.engdesoftware.Models.Vacinacao;
import com.example.engdesoftware.Models.Vacinas;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Banco {
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<Sangue> sangues;
    private static ArrayList<Vacinas> vacinas;
    private static ArrayList<Vacinacao> vacinacaos;
    public static void loadDb() {
        usuarios = usuarios();
        sangues = sangues();
        vacinas = vacinas();
    }

    public static ArrayList<Sangue> sangues() {
        ArrayList<Sangue> retorno = new ArrayList<Sangue>();
        Sangue Apositivo = new Sangue();
        Apositivo.setTipoView("A+");
        Sangue Anegativo = new Sangue();
        Anegativo.setTipoView("A-");
        Sangue Bpositivo = new Sangue();
        Bpositivo.setTipoView("B+");
        Sangue Bnegativo = new Sangue();
        Bnegativo.setTipoView("B-");
        Sangue ABpositivo = new Sangue();
        ABpositivo.setTipoView("AB+");
        Sangue ABnegativo = new Sangue();
        ABnegativo.setTipoView("AB-");
        Sangue Opositivo = new Sangue();
        Opositivo.setTipoView("O+");
        Sangue Onegativo = new Sangue();
        Onegativo.setTipoView("O-");
        retorno.add(Apositivo);
        retorno.add(Anegativo);
        retorno.add(Bpositivo);
        retorno.add(Bnegativo);
        retorno.add(ABpositivo);
        retorno.add(ABnegativo);
        retorno.add(Opositivo);
        retorno.add(Onegativo);
        return retorno;
    }

    public static ArrayList<Usuario> usuarios() {
        ArrayList<Usuario> retorno = new ArrayList<Usuario>();
        Usuario normal = new Usuario();
        normal.setLogin("user");
        normal.setSenha("user");
        normal.setCpf("06002503614");
        normal.setAdm(false);
        normal.setNome_completo("Usuario normal");
        Usuario admin = new Usuario();
        admin.setLogin("admin");
        admin.setSenha("admin");
        admin.setNome_completo("Usuario admin");
        admin.setAdm(true);
        retorno.add(normal);
        retorno.add(admin);
        return retorno;
    }

    public static ArrayList<Vacinas> vacinas() {
        ArrayList<Vacinas> retorno = new ArrayList<Vacinas>();
        Vacinas tripliceViral = new Vacinas();
        Vacinas hepatiteB = new Vacinas();
        Vacinas hpv = new Vacinas();
        Vacinas tetano = new Vacinas();
        Vacinas bcg = new Vacinas();
        Vacinas sarampo = new Vacinas();
        Vacinas difteria = new Vacinas();
        tripliceViral.setCodigoVacina(1);
        tripliceViral.setNome("Tríplice Viral");
        tripliceViral.setQuantidade(5);
        hepatiteB.setCodigoVacina(2);
        hepatiteB.setNome("Hepatite B");
        hepatiteB.setQuantidade(8);
        hpv.setNome("HPV");
        hpv.setCodigoVacina(3);
        hpv.setQuantidade(48);
        tetano.setCodigoVacina(4);
        tetano.setNome("Tétano");
        tetano.setQuantidade(36);
        bcg.setCodigoVacina(5);
        bcg.setNome("BCG");
        bcg.setQuantidade(6);
        sarampo.setCodigoVacina(6);
        sarampo.setNome("Sarampo");
        sarampo.setQuantidade(36);
        difteria.setCodigoVacina(7);
        difteria.setNome("Difteria");
        difteria.setQuantidade(30);
        retorno.add(tripliceViral);
        retorno.add(hepatiteB);
        retorno.add(hpv);
        retorno.add(tetano);
        retorno.add(bcg);
        retorno.add(sarampo);
        retorno.add(difteria);
        return retorno;
    }

    public static ArrayList<Vacinacao> vacincao(){
       ArrayList<Vacinacao> retorno = new ArrayList<Vacinacao>();
       return retorno;
    }
    public static boolean postUser(Usuario novo) {
        if (usuarios.contains(novo)) {
            return false;
        }
        usuarios.add(novo);
        return false;
    }

    public static Usuario getUser(Usuario busca) {
        if (usuarios.contains(busca)) {
            return usuarios.get(usuarios.indexOf(busca));
        }
        return null;
    }

    public static boolean postVacina(Vacinas nova) {
        if (vacinas.contains(nova)) {
            return false;
        }
        vacinas.add(nova);
        return true;
    }

    public static boolean postVacinacao(Usuario user, Vacinas vacina){
          Vacinas x = vacinas.get(vacinas.indexOf(vacina));
          if(x.getQuantidade() < 1){
               return false;
          }
          x.setQuantidade(x.getQuantidade() - 1);
          Vacinacao nova = new Vacinacao();
          nova.setUsuario(user);
          nova.setVacina(vacina);
          vacinacaos.add(nova);
          return  true;
    }

    public static ArrayList<Vacinacao> getVacinacaos(Usuario user) {
        ArrayList<Vacinacao> retorno = new ArrayList<Vacinacao>();
        for (Vacinacao va : vacinacaos)
            if (va.getUsuario().equals(user))
                retorno.add(va);
        return retorno;
    }
    public static  ArrayList<Vacinacao> getVacinacaos(){
        return vacinacaos;
    }
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public static ArrayList<Sangue> getSangues() {
        return sangues;
    }

}
