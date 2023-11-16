<%-- 
    Document   : index
    Created on : 03/10/2023, 18:41:43
    Author     : carol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        <link href="menu.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header class="header">
            <a href="" class="logo">Controle de Livros</a>
            <input class="menu-btn" type="checkbox" id="menu-btn" />
            <label class="menu-icon" for="menu-btn"><span class="navicon"></span></label>
            <ul class="menu">
                <li><a href="cadastrarlivro.jsp">Cadastrar Livro</a></li>
                <li><a href="ListarLivros">Listar Livro</a></li>
            </ul>
        </header>
       
        ${message}
       
    </body>
</html>
