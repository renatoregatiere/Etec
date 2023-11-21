/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.livraria.model;

/**
 *
 * @author renat
 */
public class Cliente extends Pessoa {

    private int idCliente;
    private String enderecoCliente;
    private String telCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String enderecoCliente, String telCliente, int idPessoa, String nomePesssoa, String nacionalidadePessoa) {
        super(idPessoa, nomePesssoa, nacionalidadePessoa);
        this.idCliente = idCliente;
        this.enderecoCliente = enderecoCliente;
        this.telCliente = telCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

}
