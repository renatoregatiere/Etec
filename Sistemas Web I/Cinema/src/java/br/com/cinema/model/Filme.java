

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cinema.model;

/**
 *
 * @author renat
 */
public class Filme {
    private String nomeFilme;
    private String sinopse;
    private String duracao;
    private String genero;
    
    public Filme(){ //construtor sem parametro
        
    }
    
    public Filme(String nomeFilme, String sinopse, String duracao, String genero){
        this.nomeFilme = nomeFilme;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.genero = genero;
    }
    

    public String getNomeFilme() {
        return this.nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getSinopse() {
        return this.sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
