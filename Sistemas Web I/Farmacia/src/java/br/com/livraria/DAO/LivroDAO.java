/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livraria.DAO;

import br.com.farmacia.model.remedio;
import br.com.livraria.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carol
 */
public class LivroDAO implements GenericDAO{

    private Connection conn;
    
    public LivroDAO() throws Exception{
        try{
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    
   @Override //sobrescrita do método
    public Boolean cadastrar(Object object) {
        
        
        remedio livro = (remedio) object; //realiza a conversão do object para livro
        PreparedStatement stmt = null;
        
        String sql = "insert into livro(nomelivro, generolivro,"
                + "autorlivro, resumolivro, precolivro, isbnlivro)"
                + "values (?, ?, ?, ?, ?, ?)";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livro.getNomeLivro());
            stmt.setString(2, livro.getGeneroLivro());
            stmt.setString(3, livro.getAutorLivro());
            stmt.setString(4, livro.getResumoLivro());
            stmt.setDouble(5, livro.getPrecoLivro());
            stmt.setString(6, livro.getIsbnLivro());
            stmt.execute();
            return true;
        }catch (Exception e){
            System.out.println("Problemas ao cadastrar livro!"
            + "Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
       } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            }catch (Exception ex){
                System.out.println("Problemas ao fechar conexão! "
                        + "Erro:"+ex.getMessage());
                ex.printStackTrace();
            }
        }
        
    }

    @Override
    public List<Object> listar() {
     List<Object> livros = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from livro;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                remedio livro = new remedio();
                livro.setIdLivro(rs.getInt("idlivro"));
                livro.setNomeLivro(rs.getString("nomelivro"));
                livro.setGeneroLivro(rs.getString("generolivro"));
                livro.setAutorLivro(rs.getString("autorlivro"));
                livro.setResumoLivro(rs.getString("resumolivro"));
                livro.setPrecoLivro(rs.getDouble("precolivro"));
                livro.setIsbnLivro(rs.getString("isbnlivro"));
                livros.add(livro);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar livros! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return livros;
}
    @Override
    public Boolean excluir(int idOject) {
        PreparedStatement stmt = null;
        String sql = "delete from livro where idlivro = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idOject);
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao excluir o livro! Erro "
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        remedio livro = null;
        String sql = "select * from livro where idlivro = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            while (rs.next()) {
                livro = new remedio();
                livro.setIdLivro(rs.getInt("idlivro"));
                livro.setNomeLivro(rs.getString("nomelivro"));
                livro.setGeneroLivro(rs.getString("generolivro"));
                livro.setAutorLivro(rs.getString("autorlivro"));
                livro.setResumoLivro(rs.getString("resumolivro"));
                livro.setPrecoLivro(rs.getDouble("precolivro"));
                livro.setIsbnLivro(rs.getString("isbnlivro"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar livro. Erro: " + e.getMessage());
            e.printStackTrace();
        }
        return livro;
    
    }

    @Override
    public Boolean alterar(Object object) {
        remedio livro = (remedio) object;
        PreparedStatement stmt = null;

        String sql = "update livro set nomelivro = ?, generolivro = ?, "
                + "autorlivro = ?, resumolivro = ?, precolivro = ? , isbnlivro = ? where idlivro = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livro.getNomeLivro());
            stmt.setString(2, livro.getGeneroLivro());
            stmt.setString(3, livro.getAutorLivro());
            stmt.setString(4, livro.getResumoLivro());
            stmt.setDouble(5, livro.getPrecoLivro());
            stmt.setString(6, livro.getIsbnLivro());
            stmt.setInt(7, livro.getIdLivro());
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Problemas ao alterar o livro. "
                    + "Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: "
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }

    }
}
