<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
       
        <form action="CadastrarLivro" method="POST" name="cadastrarlivro">
            ${mensagem}
            <br /><br />
            <h5 id="logo">Cadastro de Livro</h5>

            <label for="username">Nome</label>
            <input type="text" id="username" name="nomeLivro" placeholder="Digite o nome do livro..." autocomplete="off" required />

            <label for="username">Gênero</label>
            <select name="generoLivro" id="username">
                <option value="selecione">Selecione...</option>
                <option value="ficcao">Ficção</option>
                <option value="nao-ficcao">Não Ficção</option>
                <option value="romance">Romance</option>
                <option value="misterio">Mistério</option>
                <option value="fantasia">Fantasia</option>
                <option value="ciencia">Ciência</option>
                <option value="historia">História</option>
                <option value="biografia">Biografia</option>
            </select>
            <!-- <input type="text" id="username" name="generoLivro" placeholder="Type in your username.." autocomplete="off" required />-->

            <label for="username">Autor</label>
            <input type="text" id="username" name="autorLivro" placeholder="Digite o autor do livro" autocomplete="off" required />

            <label for="username">Resumo</label>
            <textarea type="text" id="username" name="resumoLivro" placeholder="Digite o resumo do livro" autocomplete="off" required ></textarea>

            <label for="username">Preço</label>
            <input type="number" id="username" name="precoLivro" placeholder="Digite o preço do livro" step="0.01" autocomplete="off" required />

            <label for="username">ISBN</label>
            <input type="text" id="username" name="isbnLivro" placeholder="Digite o ISBN do livro" autocomplete="off" required />


            <input type="submit" name="cadastrar" value="Cadastrar" />
         
        </form>
    </body>
</html>
