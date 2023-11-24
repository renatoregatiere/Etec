/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.farmacia.model;

/**
 *
 * @author renat
 */
public class Remedio {

    private int idRemedio;
    private String nomeRemedio;
    private String categoriaRemedio;
    private double precoRemedio;


    public Remedio() {
    }


    public Remedio(int idRemedio, String nomeRemedio, String categoriaRemedio, double precoRemedio) {
        this.idRemedio = idRemedio;
        this.nomeRemedio = nomeRemedio;
        this.categoriaRemedio = categoriaRemedio;
        this.precoRemedio = precoRemedio;
    }


    public int getIdRemedio() {
        return this.idRemedio;
    }

    public void setIdRemedio(int idRemedio) {
        this.idRemedio = idRemedio;
    }

    public String getNomeRemedio() {
        return this.nomeRemedio;
    }

    public void setNomeRemedio(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }

    public String getCategoriaRemedio() {
        return this.categoriaRemedio;
    }

    public void setCategoriRemedio(String categoriRemedio) {
        this.categoriaRemedio = categoriRemedio;
    }

    public double getPrecoRemedio() {
        return this.precoRemedio;
    }

    public void setPrecoRemedio(double precoRemedio) {
        this.precoRemedio = precoRemedio;
    }
    
  
}
