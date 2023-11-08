/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.livraria.model;

/**
 *
 * @author renat
 */
public class VendaLivro {

    private int idVenda;
    private Livro livro;
    private Cliente cliente;
    private double totalVenda;

    public VendaLivro() {
    }

    public VendaLivro(int idVenda, Livro livro, Cliente cliente, double totalVenda) {
        this.idVenda = idVenda;
        this.livro = livro;
        this.cliente = cliente;
        this.totalVenda = totalVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

}
