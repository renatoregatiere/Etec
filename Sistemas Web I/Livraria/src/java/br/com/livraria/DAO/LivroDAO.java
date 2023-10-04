/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livraria.DAO;

import br.com.livraria.model.Livro;
import br.com.livraria.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author LABINFO
 */
public class LivroDAO implements GenericDAO{

    private Connection conn;
    
    public LivroDAO () throws Exception{
        try{
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        }catch  (Exception ex) {
            throw new Exception (ex.getLocalizedMessage());
    
            }
        }
 
    @Override //sobrescrita de método 
    public Boolean cadastrar(Object object) {
        
        Livro livro = (Livro) object; // realiza a conversão de objeto para livro
        PreparedStatement stmt = null;
        
        String sql = "insert into livro (nomelivro, generolivro, "
                + "autorlivro, resumolivro, precolivro, isbnlivro)" 
                + "values(?, ?, ?, ?, ?, ?);";
        
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, livro.getNomeLivro());
            stmt.setString(2, livro.getGeneroLivro());
            stmt.setString(3, livro.getAutorLivro ());
            stmt.setString(4, livro.getResumoLivro());
            stmt.setDouble(5, livro.getPrecoLivro());
            stmt.setString(6, livro.getIsbnLivro());
            stmt.execute();
            return true;
        }catch (Exception e){
            System.out.println("Problemas ao cadastrar livro." 
            + "Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            try{
                ConnectionFactory.CloseConnection(conn, stmt);
            }catch (Exception ex){
                System.out.println ("Problemas ao fechar conexão! Erro:" +ex.getMessage ());
                ex.printStackTrace();
            }
        }
    }
    
}
