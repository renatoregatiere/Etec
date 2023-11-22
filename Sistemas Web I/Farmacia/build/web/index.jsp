<%-- 
    Document   : index
    Created on : 05/10/2023, 21:31:42
    Author     : LABINFO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Controle de Livros</h1>
        <hr />
        ${message}
        <p align="center">
            <a href="cadastrarLivro.jsp"><button>Cadastrar Livro</button></a>
        </p>
        <p align="center">
            <a href="ListarLivros"><button>Listar Livros</button></a>
        </p>
    </body>
</html>
