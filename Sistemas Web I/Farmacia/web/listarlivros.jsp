<%-- 
    Document   : listarlivros
    Created on : 05/10/2023, 21:45:58
    Author     : LABINFO
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.livraria.model.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto Livro</title>
    </head>
    <body>
        <h1 align="center">Lista de Livros</h1>
        <hr />
        <table align="center" border="1">
        <tr>
            <td colspan="7" align="center">Lista de Livros</td>
        </tr>
        <tr>
            <th align="center">ID Livro</th>
            <th align="center">Nome</th>
            <th align="center">Gênero</th>
            <th align="center">Autor</th>
            <th align="center">Resumo</th>
            <th align="center">Preço</th>
            <th align="center">ISBN</th>
            <th align="center" colspan="2">Editar</th>
        </tr>
        <%
            List<Livro> livros = (List<Livro>) request.getAttribute ("livros");
            for(Livro livro:livros){
        %>
        <tr>
            <td align="center"><%=livro.getIdLivro()%></td>
            <td align="center"><%=livro.getNomeLivro()%></td>
            <td align="center"><%=livro.getGeneroLivro()%></td>
            <td align="center"><%=livro.getAutorLivro()%></td>
            <td align="center"><%=livro.getResumoLivro()%></td>
            <td align="center"><%=livro.getPrecoLivro()%></td>
            <td align="center"><%=livro.getIsbnLivro()%></td>
            <td align="center">
                <a href="">Excluir</a></td>
            <td align="center">
                <a href="">Alterar</a></td>
        </tr>
        <%
            }
        %>
        
        <tr>
            <td align="center" colspan="7"><a href="index.jsp"></a></td>
        </tr>
        </table>    
    </body>
</html>
