package com.example.marcelo.agendacontatos;

/**
 * Created by marcelo on 13/08/15.
 */
public class Contato {
    private String nome;
    private int tel;

    public Contato(String nome, int tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
