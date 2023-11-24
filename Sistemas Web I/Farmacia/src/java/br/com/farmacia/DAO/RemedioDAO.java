/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmacia.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.farmacia.model.Remedio;
import br.com.farmacia.util.ConnectionFactory;

/**
 *
 * @author LABINFO
 */
public class RemedioDAO implements GenericDAO {

    private Connection conn;

    public RemedioDAO() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getLocalizedMessage());

        }
    }

    @Override //sobrescrita de método 
    public Boolean cadastrar(Object object) {

        Remedio remedio = (Remedio) object; // realiza a conversão de objeto para remedio
        PreparedStatement stmt = null;

        String sql = "insert into remedio (nomeremedio, categoriaremedio, "
                + "precoremedio)"
                + "values(?, ?, ?, ?, ?, ?);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, remedio.getNomeRemedio());
            stmt.setString(2, remedio.getCategoriaRemedio());
            stmt.setDouble(3, remedio.getPrecoRemedio());
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Problemas ao cadastrar remedio."
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
        List<Object> remedios = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from remedio";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Remedio remedio = new Remedio();
                remedio.setIdRemedio(rs.getInt("idremedio"));
                remedio.setNomeRemedio(rs.getString("nomeremedio"));
                remedio.setCategoriRemedio(rs.getString("categoriaremedio"));
                remedio.setPrecoRemedio(rs.getDouble("precoremedio"));
                remedios.add(remedio);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar remedios Dao! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return remedios;

    }


@Override
public Object carregar(int idObject) {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Remedio remedio = null;
    String sql = "select * from remedio where idremedio = ?;";
    try {
        stmt = conn.prepareStatement (sql);
        stmt.setInt(1, idObject);
        rs = stmt.executeQuery();
        while (rs.next()) {
            remedio = new Remedio();
            remedio.setIdRemedio(rs.getInt ("idremedio"));
            remedio.setNomeRemedio (rs.getString("nomeremedio"));
            remedio.setCategoriaReedio (rs.getString("categoiaremedio"));
            remedio.setPrecoRemedio (rs .getDouble ("precolívro"));
        }
    } catch (SQLException e) {
    System.out.println("Erro ao carregar remedio. Erro: " + e.getMessage());
    e.printStackTrace();
    }
    return remedio;
}

    @Override
    public Boolean excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "delete from remedio where idremedio = ?;";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.execute();
            return true;
        } catch (Exception ex){
            System.out.println("Problemas ao excluir o remedio! Erro"+ex.getMessage());
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
