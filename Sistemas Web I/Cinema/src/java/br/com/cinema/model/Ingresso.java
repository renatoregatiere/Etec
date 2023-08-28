
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 package br.com.cinema.model;

/**
 *
 * 
 * @author renat
 */

public class Ingresso {
    private String lugar;
    private int quantidade;
    private double preco;
    private Filme filme;

    public Ingresso() {
    }

    public Ingresso(Filme filme, String lugar, double preco, int quantidade) {
        this.filme = filme;
        this.lugar = lugar;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Filme getFilme() {
        return this.filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    }
