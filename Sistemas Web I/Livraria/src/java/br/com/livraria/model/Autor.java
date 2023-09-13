/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.livraria.model;

/**
 *
 * @author renat
 */
public class Autor extends Pessoa {

    private int idAutor;
    private int qtdLivrosAutor;

    public Autor() {
    }

    public Autor(int idAutor, int qtdLivrosAutor, int idPessoa, String nomePesssoa, String nacionalidadePessoa) {
        super(idPessoa, nomePesssoa, nacionalidadePessoa);
        this.idAutor = idAutor;
        this.qtdLivrosAutor = qtdLivrosAutor;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getQtdLivrosAutor() {
        return qtdLivrosAutor;
    }

    public void setQtdLivrosAutor(int qtdLivrosAutor) {
        this.qtdLivrosAutor = qtdLivrosAutor;
    }

}
