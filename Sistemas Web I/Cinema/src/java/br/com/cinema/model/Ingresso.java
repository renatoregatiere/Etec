/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renat
 */
public class Ingresso {
    private String lugar;
    private int quantidade;
    private double preco;


    public Ingresso(){

    }

    public Ingresso(String lugar,int quantidade,double preco){
        this.lugar=lugar;
        this.quantidade=quantidade;
        this.preco=preco;
    }

    public String getLugar(){
        return lugar;
    }

    public void setLugar(){
        this.lugar=lugar;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(){
        this.quantidade=quantidade;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(){
        this.preco=preco;
    }
}
