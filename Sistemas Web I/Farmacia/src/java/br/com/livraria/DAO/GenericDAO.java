/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livraria.DAO;

import java.util.List;

/**
 *
 * @author carol
 */
public interface GenericDAO {
    public Boolean cadastrar(Object object);
    public List<Object> listar();
    public Boolean excluir(int idObject); 
    public Object carregar(int idObject);
    public Boolean alterar(Object object);
}
