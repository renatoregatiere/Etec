/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.livraria.model;

/**
 *
 * @author renat
 */
public class Livro {

    private String idLivro;
    private String generoLivro;
    private Autor autor;
    private String resumoLivro;
    private double precoLivro;
    private int isbnLivro;

    public Livro() {
    }

    public Livro(String idLivro, String generoLivro, Autor autor, String resumoLivro, double precoLivro, int isbnLivro) {
        this.idLivro = idLivro;
        this.generoLivro = generoLivro;
        this.autor = autor;
        this.resumoLivro = resumoLivro;
        this.precoLivro = precoLivro;
        this.isbnLivro = isbnLivro;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(String idLivro) {
        this.idLivro = idLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
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

    public int getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(int isbnLivro) {
        this.isbnLivro = isbnLivro;
    }

}
