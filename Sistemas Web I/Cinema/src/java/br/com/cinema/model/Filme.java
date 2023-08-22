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
    
    public String getNomeFilme(){
        return nomeFilme;
    }
    
    public void setNomeFilme(String nomeFilme){
        this.nomeFilme = nomeFilme;
    }
    
    public String getSinopse(){
        return sinopse;
    }
    
    public void setNomeSinopse(String nomeSinopse){
        this.sinopse = sinopse;
    }
    
    public String getDuracao(){
        return duracao;
    }
    
    public void setNomeDuracao(String nomeDuracao){
        this.duracao = duracao;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setNomeGenero(String nomeGenero){
        this.genero = genero;
    }
}
