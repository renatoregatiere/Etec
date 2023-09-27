/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.livraria.DAO;

import br.com.livraria.model.Livro;
import br.com.livraria.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author renat
 */
public class LivroDAO implements GenericDAO{
    
    private Connection conn;
    
    public LivroDAO() throws Exception{
        try{
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override//sobrescrita de método
    public Boolean cadastrar(Object object) {
        
        Livro livro = (Livro) object; // realiza a conversão de objeto para livro
        PreparedStatement stmt = null;
        String sql = "insert into livro(nomelibro,generolivro,"+"autorlivro,resumolilvro,precolivro,isbnlivro)"+ "values(?,?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,livro.getNomeLivro());
            stmt.setString(2,livro.getAutorLivro());
            stmt.setString(3,livro.getIsbnLivro());
            stmt.setString(4,livro.getResumoLivro());
            stmt.setDouble(5,livro.getPrecoLivro());
            stmt.execute();
            return true;
            }catch (Exception e){
            System.out.println("Problemas ao cadastrar o livro"+"Erro: "+e.getMessage());
            e.printStackTrace();
            return false;
        } finally{
            try{
                ConnectionFactory.closeConnection(conn,stmt);
            }catch (Exception ex){
                System.out.println("Problemas ao fechar conexão! Erro: "+ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    
    
}
