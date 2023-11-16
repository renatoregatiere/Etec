/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livrariacarol.model;

/**
 *
 * @author carol
 */
public class Livro {
    private int idLivro;
    private String nomeLivro;
    private String generoLivro;
    private String autorLivro;
    private String resumoLivro;
    private double precoLivro;
    private String isbnLivro;

    public Livro() {
    }

    public Livro(int idLivro, String nomeLivro, String generoLivro, String autorLivro, String resumoLivro, double precoLivro, String isbnLivro) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.generoLivro = generoLivro;
        this.autorLivro = autorLivro;
        this.resumoLivro = resumoLivro;
        this.precoLivro = precoLivro;
        this.isbnLivro = isbnLivro;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getResumoLivro() {
        return resumoLivro;
    }

    public void setResumoLivro(String resumoLivro) {
        this.resumoLivro = resumoLivro;
    }

    public double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
    }

    public String getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(String isbnLivro) {
        this.isbnLivro = isbnLivro;
    }
    
   
}
