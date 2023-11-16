<%@page import="br.com.livrariacarol.model.Livro"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Projeto Livraria</title>
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        <link href="menu.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header class="header">
            <a href="index.jsp" class="logo">Controle de Livros</a>
            <input class="menu-btn" type="checkbox" id="menu-btn" />
            <label class="menu-icon" for="menu-btn"><span class="navicon"></span></label>
            <ul class="menu">
                <li><a href="cadastrarlivro.jsp">Cadastrar Livro</a></li>
                <li><a href="ListarLivros">Listar Livro</a></li>
            </ul>
        </header>
        <br/>
        <h1 align="center">Lista de Livros</h1>
        <hr />
        <table align="center" border="1" >
            <tr>
                <td colspan="9" align="center">Lista de Livros</td>
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
                List<Livro> livros = (List<Livro>) request.getAttribute("livros");
                for (Livro livro : livros) {
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
                    <a href="ExcluirLivro?idLivro=<%=livro.getIdLivro()%>">Excluir</a></td>
                <td align="center">
                   <a href="CarregarLivro?idLivro=<%=livro.getIdLivro()%>">Alterar</a></td>
            </tr>
            <%
                }
            %>

            <tr>
                <td align="center" colspan="9"><a href="index.jsp">Voltar</a></td>
            </tr>
        </table>
    </body>
</html>
