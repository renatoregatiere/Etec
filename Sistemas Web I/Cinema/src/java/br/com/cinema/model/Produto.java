/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cinema.model;

/**
 *
 * @author renat
 */
public class Produto {
        private String nomeProduto;
        private String preco;
        private String tipoProduto;
        private String qtdProduto;

    public Produto(){

    }

    public Produto(String nomeProduto, String preco, String tipoProduto, String qtdProduto){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
        this.qtdProduto = qtdProduto;
    }


    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPreco() {
        return this.preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTipoProduto() {
        return this.tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getQtdProduto() {
        return this.qtdProduto;
    }

    public void setQtdProduto(String qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    
}