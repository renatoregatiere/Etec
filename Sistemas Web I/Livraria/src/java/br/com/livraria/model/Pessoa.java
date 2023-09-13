/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.livraria.model;

/**
 *
 * @author renat
 */
public class Pessoa {

    private int idPessoa;
    private String nomePesssoa;
    private String nacionalidadePessoa;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nomePesssoa, String nacionalidadePessoa) {
        this.idPessoa = idPessoa;
        this.nomePesssoa = nomePesssoa;
        this.nacionalidadePessoa = nacionalidadePessoa;
    }

    /**
     * @return the idPessoa
     */
    public int getIdPessoa() {
        return idPessoa;
    }

    /**
     * @param idPessoa the idPessoa to set
     */
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    /**
     * @return the nomePesssoa
     */
    public String getNomePesssoa() {
        return nomePesssoa;
    }

    /**
     * @param nomePesssoa the nomePesssoa to set
     */
    public void setNomePesssoa(String nomePesssoa) {
        this.nomePesssoa = nomePesssoa;
    }

    /**
     * @return the nacionalidadePessoa
     */
    public String getNacionalidadePessoa() {
        return nacionalidadePessoa;
    }

    /**
     * @param nacionalidadePessoa the nacionalidadePessoa to set
     */
    public void setNacionalidadePessoa(String nacionalidadePessoa) {
        this.nacionalidadePessoa = nacionalidadePessoa;
    }

}
