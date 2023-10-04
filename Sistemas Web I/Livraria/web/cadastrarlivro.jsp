<%-- 
    Document   : cadastrarLivro.jsp
    Created on : 5 de set. de 2023, 20:06:15
    Author     : LABINFO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Livros</title>
        <link href="cadastrarLivro.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        ${mensagem}
        <div class="container">
            <div class="header">
                <h2>Cadastrar</h2>
            </div>
            <form action="CadastrarLivro" method="POST"  id="form" class="form">
                <div class="form-control">
                    <label for="username">Nome do livro</label>
                    <input type="text" placeholder="Nome do livro" id="Nome do livro" name="nomeLivro"/>
                    <i class="fas fa-check-circle"></i>
                    <i class="fas fa-exclamation-circle"></i>

                </div>
                <div class="form-control">
                    <label for="username">Gênero</label>
                    <input type="text" placeholder="Gênero" id="Gênero" name="generoLivro"/>
                    <i class="fas fa-check-circle"></i>
                    <i class="fas fa-exclamation-circle"></i>

                </div>
                <div class="form-control">
                    <label for="username">Autor</label>
                    <input type="text" placeholder="Autor" id="Autor" name="autorLivro"/>
                    <i class="fas fa-check-circle"></i>
                    <i class="fas fa-exclamation-circle"></i>

                </div>
                <div class="form-control">
                    <label for="username">Resumo</label>
                    <input type="text" placeholder="Resumo" id="Resumo" name="resumoLivro"/>
                    <i class="fas fa-check-circle"></i>
                    <i class="fas fa-exclamation-circle"></i>

                </div>
                <div class="form-control">
                    <label for="username">Preço</label>
                    <input type="text" placeholder="Preço" id="Preço" name="precoLivro"/>
                    <i class="fas fa-check-circle"></i>
                    <i class="fas fa-exclamation-circle"></i>

                </div>
                <div class="form-control">
                    <label for="username">isbn</label>
                    <input type="text" placeholder="Isbn" id="Isbn" name="isbnLivro"/>
                    <i class="fas fa-check-circle"></i>
                    <i class="fas fa-exclamation-circle"></i>

                </div>
                <button>Cadastrar</button>
            </form>
        </div>

    </body>
</html>
