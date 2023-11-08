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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LABINFO
 */
public class LivroDAO implements GenericDAO {

    private Connection conn;

    public LivroDAO() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getLocalizedMessage());

        }
    }

    @Override //sobrescrita de método 
    public Boolean cadastrar(Object object) {

        Livro livro = (Livro) object; // realiza a conversão de objeto para livro
        PreparedStatement stmt = null;

        String sql = "insert into livro (nomelivro, generolivro, "
                + "autorlivro, resumolivro, precolivro, isbnlivro)"
                + "values(?, ?, ?, ?, ?, ?);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livro.getNomeLivro());
            stmt.setString(2, livro.getGeneroLivro());
            stmt.setString(3, livro.getAutorLivro());
            stmt.setString(4, livro.getResumoLivro());
            stmt.setDouble(5, livro.getPrecoLivro());
            stmt.setString(6, livro.getIsbnLivro());
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Problemas ao cadastrar livro."
                    + "Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.CloseConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> livros = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from livro";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Livro livro = new Livro();
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
            System.out.println("Problemas ao listar livros Dao! Erro:" + ex.getMessage());
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
public Object carregar(int idObject) {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Livro livro = null;
    String sql = "select * from livro where idlivro = ?;";
    try {
        stmt = conn.prepareStatement (sql);
        stmt.setInt(1, idObject);
        rs = stmt.executeQuery();
        while (rs.next()) {
            livro = new Livro();
            livro.setIdLivro(rs.getInt ("idlívro"));
            livro.setNomeLivro (rs.getString("nomelivro"));
            livro.setGeneroLivro (rs.getString("generolivro"));
            livro.setAutorLivro(rs.getString("autorlívro"));
            livro.setResumoLivro (rs.getString("resumolívro"));
            livro.setPrecoLivro (rs .getDouble ("precolívro"));
            livro.setIsbnLivro(rs.getString("isbnlivro"));
        }
    } catch (SQLException e) {
    System.out.println("Erro ao carregar livro. Erro: " + e.getMessage());
    e.printStackTrace();
    }
    return livro;
}

    @Override
    public Boolean excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "delete from livro where idlivro = ?;";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.execute();
            return true;
        } catch (Exception ex){
            System.out.println("Problemas ao excluir o livro! Erro"+ex.getMessage());
            ex.printStackTrace();
            return false;      
        } finally{
            try {
                ConnectionFactory.CloseConnection(conn, stmt);                
            } catch (Exception e){
                System.out.println("Problemas ao fechar a conexão! Erro"+e.getMessage());
            e.printStackTrace();
            }
            
        }
                
    }
}
