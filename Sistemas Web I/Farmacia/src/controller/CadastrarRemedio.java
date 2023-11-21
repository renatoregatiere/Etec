/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LABINFO
 */
@WebServlet(name = "CadastrarRemedio", urlPatterns = {"/CadastrarRemedio"})
public class CadastrarRemedio extends HttpServlet {

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
           
          String nomeLivro = request.getParameter("nomeLivro"); 
          String generoLivro = request.getParameter("generoLivro");
          String autorLivro = request.getParameter("autorLivro"); 
          String resumoLivro = request.getParameter("resumoLivro"); 
          double precoLivro = Double.parseDouble (request.getParameter("precoLivro")); 
          String isbnLivro = request.getParameter("isbnLivro"); 
          
          String mensagem = null;
          
          Livro livro = new Livro ();
          livro.setNomeLivro (nomeLivro);
          livro.setGeneroLivro (generoLivro);
          livro.setAutorLivro(autorLivro);
          livro.setResumoLivro(resumoLivro);
          livro.setPrecoLivro (precoLivro);
          livro.setIsbnLivro (isbnLivro);
          
          try{
              GenericDAO dao = new LivroDAO ();
              if(dao.cadastrar (livro)){
                  mensagem = "Livro cadastrado com sucesso!";
              }else {
                  mensagem = "Problemas ao cadastrar o livro.";
              }
              request.setAttribute ("mensagem", mensagem);
              request.getRequestDispatcher("cadastrarLivro.jsp")
                .forward(request, response);
          } catch (Exception e) {
              out.println("Erro ao cadastrar livro: "+ e.getMessage ());
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
