/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmacia.model;

/**
 *
 * @author Renato
 */
public class remedio {
    private int idRemedio;
    private String nomeRemedio;
    private String categoriaRemedio;
    private String principioAtivo;
    private double precoRemedio;


    public remedio() {
    }


    public remedio(int idRemedio, String nomeRemedio, String categoriaRemedio, String principioAtivo, double precoRemedio) {
        this.idRemedio = idRemedio;
        this.nomeRemedio = nomeRemedio;
        this.categoriaRemedio = categoriaRemedio;
        this.principioAtivo = principioAtivo;
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

    public void setCategoriaRemedio(String categoriaRemedio) {
        this.categoriaRemedio = categoriaRemedio;
    }

    public String getPrincipioAtivo() {
        return this.principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public double getPrecoRemedio() {
        return this.precoRemedio;
    }

    public void setPrecoRemedio(double precoRemedio) {
        this.precoRemedio = precoRemedio;
    }



       
}
