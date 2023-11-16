/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livraria.controller;

import br.com.livraria.DAO.GenericDAO;
import br.com.livraria.DAO.LivroDAO;
import br.com.livrariacarol.model.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carol
 */
@WebServlet(name = "AlterarLivro", urlPatterns = {"/AlterarLivro"})
public class AlterarLivro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            int idLivro = Integer.parseInt(request.getParameter("idLivro"));
            String nomeLivro = request.getParameter("nomeLivro");
            String generoLivro = request.getParameter("generoLivro");
            String autorLivro = request.getParameter("autorLivro");
            String resumoLivro = request.getParameter("resumoLivro");
            double precoLivro = Double.parseDouble(request.
                    getParameter("precoLivro"));
            String isbnLivro = request.getParameter("isbnLivro");
            
            String mensagem;
            
            Livro livro = new Livro();
            livro.setIdLivro(idLivro);
             livro.setNomeLivro(nomeLivro);
            livro.setGeneroLivro(generoLivro);
            livro.setAutorLivro(autorLivro);
            livro.setResumoLivro(resumoLivro);            
            livro.setPrecoLivro(precoLivro);
            livro.setIsbnLivro(isbnLivro);
            
            try{
                GenericDAO dao = new LivroDAO();
                if(dao.alterar(livro)){
                    mensagem = "Livro alterado com sucesso.";
                }else{
                    mensagem = "Problemas ao alterar livro.";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("ListarLivros").forward(request, response);
            }catch(Exception e){
                System.out.println("Problemas na servlet ao alterar. Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
